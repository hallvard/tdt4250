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
		var task = this.props.task;
		var started = typeof task != 'string' && task.started;
		var finished = typeof task != 'string' && task.finished;
		return { started : started, finished : finished };
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
