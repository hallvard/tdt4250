// React component for ExampleTask

/*
this.props:
{
	"elementSize" : 16
  	"value" : "wall",
  	"x" : 0,
  	"y" : 0,
}
this.state:
{
  "value" : "wall"
}
*/

var SokobanGridElementComponent = React.createClass({
	displayName : "SokobanGridElement component",

	getInitialState : function() {
		return {
			value : this.props.value
		}
	},
	
	componentWillReceiveProps: function(nextProps) {
		this.setState({
			value : nextProps.value
		});
	},

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

	name2Image: function(name) {
		if (name.length == 1) {
			name = char2Name(name)
		}
		return 'images/' + name + '16x16.png';
	},
	
	render : function render() {
		var elementSize = (typeof this.props.elementSize === 'number' ? this.props.elementSize : 16);
		return React.createElement('img', { src: this.name2Image(this.props.value), width: elementSize, height: elementSize })
	}
});
