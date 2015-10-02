// React component for Task

var TaskComponent = React.createClass({
	displayName: "Task component",

	getInitialState: function() {
		return {
			started: this.props.started,
			finished: this.props.finished,
		};
	},
  	render: function render() {
  		var divClass = "task";
  		if (this.state.finished) {
  			divClass = "finishedTask";
  		} else if (this.state.started) {
  			divClass = "startedTask";
  		}
    	return React.createElement(
      		"div", { className: divClass },
      		React.createElement(
      			"a", { href: "mailto:fjdskl" },
      			"Task ", this.state.num
      		)
    	);
  	}
});
