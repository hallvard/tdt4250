// React component for Player list

/*
this.props:
{
	serviceUrl: the url that returns the current Game object
	players:
	[]
	tasks:
	[]
}
this.state:
{
	players:
	[]
	tasks:
	[]
}
*/

var GameComponent = React.createClass({
	displayName: "Game component",
	
	getInitialState : function() {
		var comp = this;
		AppHelper.loadData(this.props.serviceUrl, true, function(response) {
			comp.setState({
				players : response.players,
				tasks : response.tasks
			});
		});
		return {
			players: this.props.players,
			tasks: this.props.tasks
		};
	},

  	render: function render() {
  		var serviceUrl = this.props.serviceUrl;
  		var playerComponents = this.state.players.map(function(player) {
  			var playerProps = { name: player.name, ids: player.ids };
      		return React.createElement(
      				PlayerComponent, { serviceUrl: serviceUrl + '/' + player.ids[0], player: playerProps}
          		)
  		});
    	return React.createElement(
      		"div", { className: "game" },
      		React.createElement(
    			"div", { className: "playerList" },
    			React.createElement(
    					"h2", null, "Players"
    			),
    			playerComponents
    		),
    		React.createElement(
    				"h2", null, "Tasks"
    		),
    		React.createElement(
    			TaskListComponent, { serviceUrl: this.props.serviceUrl + '/tasks', tasks: []}
    		)    		
    	);
  	}
});
