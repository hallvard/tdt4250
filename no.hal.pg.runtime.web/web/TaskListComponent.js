// React component for Task list

var TaskListComponent = React.createClass({
	displayName: "Task list component",
	
  	render: function render() {
  		var rows = this.props.tasks.map(function(task) {
      		return React.createElement(
          		"tr", { key: task.num },
    	    	React.createElement(
    	      		"td", { className: "taskItem" },
    		    	React.createElement(
    	 	    		TaskComponent, task
    	 	    	)
    	 		)
          	);
  		});
    	return React.createElement(
      		"table", { className: "taskList" },
      		React.createElement(
      			"tr", null,
      			rows
      		)
    	);
  	}
});
