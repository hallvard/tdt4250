// React component for Task list

/*
this.props:
{
	serviceUrl: service URL
	tasks: task list 
	[]
}
this.state:
{
	tasks: task list 
	[]
}
 */
var TaskListComponent = React.createClass({
	displayName: "Task list component",
	
	getInitialState : function() {
		var comp = this;
		AppHelper.loadData(this.props.serviceUrl, true, function(response) {
			comp.setState({
				tasks : response
			});
		});
		return {
			tasks : this.props.tasks
		};
	},

  	render: function render() {
  		var num = 0;
  		AppHelper.log("Task count: " + this.state.tasks.length, AppHelper.INFO);
  		var serviceUrl = this.props.serviceUrl;
  		var rows = this.state.tasks.map(function(task) {
  			num = num + 1;
  			AppHelper.log("Creating TaskComponent # " + num, AppHelper.INFO);
      		return React.createElement(
          		"tr", { key: num },
    	    	React.createElement(
    	      		"td", { className: "taskItem" },
    		    	React.createElement(
    	 	    		TaskComponent, { serviceUrl: serviceUrl + '/' + (num - 1), task: task, taskNum: num }
    	 	    	)
    	 		)
          	);
  		});
    	return React.createElement(
      		"table", { className: "taskList" },
      		React.createElement(
      			"tbody", null,
      			rows
      		)
    	);
  	}
});
