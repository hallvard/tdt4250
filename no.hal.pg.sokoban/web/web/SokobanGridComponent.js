// React component for ExampleTask

/*
this.props:
{
	serviceUrl: the url that returns the current SokobanGrid object
	"elementSize" : 16
	grid: {
	  "values" : [ "#######", "#.@ # #", "#$* $ #", "#   $ #", "# ..  #", "#  *  #" ],
	  "x" : 0,
	  "width" : 7,
	  "y" : 0,
	  "height" : 7
	}
}
this.state:
{
	grid: {
	  	"values" : [
		  	"wall", "wall", "wall", "wall", "wall", "wall", "wall",
		  	"wall", "target", "player", "empty", "wall", "empty", "wall",
		  	"wall", "box", "box_on_target", "empty", "box", "empty", "wall",
		  	"wall", "empty", "empty", "empty", "box", "empty", "wall",
		  	"wall", "empty", "target", "target", "empty", "empty", "wall",
		  	"wall", "empty", "empty", "box_on_target", "empty", "empty", "wall",
		  	"wall", "wall", "wall", "wall", "wall", "wall", "wall"
	  	],
		"x" : 0,
		"width" : 7,
		"y" : 0,
		"height" : 7
	}
}
*/

var SokobanGridComponent = React.createClass({
	displayName : "SokobanGrid component",

	char2Name: function(c) {
		switch (c) {
		case '#': return "wall";
		case ' ': return "empty";
		case '.': return "target";
		case '@': return "player";
		case '+': return "player_on_target";
		case '$': return "box";
		case '*': return "box_on_target";
		}
		return null;
	},

	getGridValue: function(grid, x, y, compact) {
		var value = (compact ? grid.values[y].charAt(x) : grid.values[grid.width * y + x]);
		if (typeof value != 'string') {
			AppHelper.log("No value @ " + x + ',' + y + ' in ' + grid, AppHelper.LOGGING_ERROR);
		}
		return value;
	},
	
	computeGrid: function(grid, changes, compactGrid) {
		var names = [];
		for (var rowNum = 0; rowNum < grid.height; rowNum++) {
			for (var colNum = 0; colNum < grid.width; colNum++) {
				var value = (changes != null && colNum >= changes.x && colNum < changes.x + changes.width && rowNum >= changes.y && rowNum < changes.y + changes.height) ?
					this.getGridValue(changes, colNum - changes.x, rowNum - changes.y, false) :
					this.getGridValue(grid, colNum, rowNum, compactGrid);
				if (value.length == 1) {
					value = this.char2Name(value);
				}
				names.push(value);
			}
		}
		return {
			values: names,
			x: grid.x,
			y: grid.y,
			width: grid.width,
			height: grid.height, 
		};
	},
	
	getInitialState : function() {
		var comp = this;
		AppHelper.loadData(this.props.serviceUrl + '/sokobanGame/grid/getGridValues?stringFormat=false', false, function(response) {
			comp.setState({
				grid : response
			});
		});
		if (AppHelper.isArray(this.props.grid)) {
			return {
				grid : this.props.grid.map(function (grid) { return comp.computeGrid(grid, null, true); })
			}
		} else {
			return {
				grid : comp.computeGrid(this.props.grid, null, true)
			}
		}
	},

	movePlayer : function(direction) {
		if (typeof direction != 'string') {
			direction = direction.key;
		}
		if (direction.length > 1) {
			switch (direction) {
			case "ArrowUp": direction = 'u'; break;
			case "ArrowDown": direction = 'd'; break;
			case "ArrowLeft": direction = 'l'; break;
			case "ArrowRight": direction = 'r'; break;
			default: return
			}
		}
		var comp = this;
		AppHelper.loadData(this.props.serviceUrl + '/sokobanGame/movePlayer?stringFormat=false&direction=' + direction, false, function(response) {
			comp.setState({ grid : comp.computeGrid(comp.state.grid, response) });
		});
	},

	createGridRows: function (grid) {
		var rows = [];
		var elementSize = (typeof this.props.elementSize === 'number' ? this.props.elementSize : 16);
		for (rowNum = 0; rowNum < grid.height; rowNum++) {
			var columns = [] 
			for (colNum = 0; colNum < grid.width; colNum++) {
				var value = grid.values[rowNum * grid.width + colNum];
				var col = React.createElement('td', { key: colNum, className: 'sokobanGridCell' },
							React.createElement(SokobanGridElementComponent, { value: value, x: colNum, y: rowNum, elementSize: elementSize })
						);
				columns.push(col);
			}
			var row = React.createElement('tr', { key: rowNum, className: 'sokobanGridRow' }, columns);
			rows.push(row);
		}
		return rows;
	},
	
	createGridTable: function (grid, num) {
		var comp = this;
		return React.createElement("table", { key: num, className: 'sokobanGridTable', tabIndex: num, onKeyDown: function(event) { comp.movePlayer(event);} },
				React.createElement("tbody", null, comp.createGridRows(grid))
				)
	},
	
	render : function render() {
		var num = 0;
		var comp = this;
		var grids = AppHelper.asArray(this.state.grid);
		return React.createElement("div", null, grids.map(function (grid) { return comp.createGridTable(grid, num++); }));
	}
});
