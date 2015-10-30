// React component for ExampleTask

/*
this.props:
{
	colors: { color name 1, value 1, value 2, color name 2, value 1, value 2 },
	orientation: "vertical" | "horizontal",
	value: value,
	updateFunction
}
this.state:
{
	value: value
}
*/

var LowMediumHighComponent = React.createClass({
	displayName : "LowMediumHighComponent component",

	getInitialState : function() {
		return {
			value : this.props.value
		}
	},

	render : function render() {
		var tableElements = [];
		var elementSize = this.props.elementSize;
		var colors = this.props.colors;
		var firstColor = colors[0], currentColor = 'red';
		for (var i = 1; i < colors.length; i++) {
			if (typeof colors[i] === 'string') {
				currentColor = colors[i];
			} else {
				var color = (colors[i] > this.state.value ? firstColor : currentColor);
				var tableElement = React.createElement("td", { key: i, width: elementSize, height: elementSize, style: { backgroundColor: color, border: "1px solid black" } }, " ");
				if (this.props.orientation === 'vertical') {
					tableElement = React.createElement("tr", { key: i }, tableElement);
				}
				tableElements.push(tableElement);
			}
		}
		return React.createElement("table", { border: 1 },
				React.createElement("tbody", null,
					(this.props.orientation === 'vertical' ? tableElements : React.createElement("tr", null, tableElements))
				)
		);
	}
});
