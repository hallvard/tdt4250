// React component for Task

/*
this.props:
{
	serviceUrl: service URL
	task: task
	taskNum: task number
}
this.state:
{
	started: started
	finished: finished
}
 */

var TaskComponent = React.createClass({
	displayName: "Task component",

	getInitialState: function() {
//		var comp = this;
//		AppHelper.loadData(this.props.serviceUrl, function(response) {
//			comp.setState({
//				started: response.started,
//				finished: response.finished 
//			});
//		});
		return {
			started: this.props.task.started,
			finished: this.props.task.finished,
		};
	},

  	render: function render() {
  		var divClass = "task";
  		if (this.state.finished) {
  			divClass = "finishedTask";
  		} else if (this.state.started) {
  			divClass = "startedTask";
  		}
  		var serviceUrl = this.props.serviceUrl; 
  		var taskLink = serviceUrl.replace("/data/", "/app/");
  		console.log("Task link: " + taskLink + " (" + serviceUrl + ")");
    	return React.createElement(
      		"div", { className: divClass },
      		React.createElement(
      			"a", { href: serviceUrl.replace("/data/", "/app/") },
      			"Task ", this.props.taskNum
      		)
    	);
  	}
});
