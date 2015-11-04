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
	
//	setPlayer: function(player) {
//		this.setState({
//			player : player
//		});
//	},

  	render: function render() {
  		AppHelper.log("Task count: " + this.state.tasks.length, AppHelper.INFO);
  		var props = this.props;
  		var state = this.state;
  		var rows = this.state.tasks.map(function(task, idx) {
      		return React.createElement(
          		"tr", { key: idx },
    	    	React.createElement(
    	      		"td", { className: "taskItem" },
    		    	React.createElement(
    	 	    		TaskComponent, { serviceUrl: props.serviceUrl + '/' + idx, // player: state.player,
    	 	    							task: task, taskNum: (idx + 1)}
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
