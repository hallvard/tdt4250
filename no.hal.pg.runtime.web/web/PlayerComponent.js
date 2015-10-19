// React component for Player list

/*
this.props:
{
	serviceUrl: the url that returns the current Player object
	player : the player
	{
		name: player name
	}
}
this.state:
{
	name: player name
}
*/

var emailPattern = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
var urlPattern = /(http|ftp|https):\/\/[\w-]+(\.[\w-]+)+([\w.,@?^=%&amp;:\/~+#-]*[\w@?^=%&amp;\/~+#-])?/;

var PlayerComponent = React.createClass({
	displayName: "Player component",
	
	getInitialState : function() {
		var comp = this;
		AppHelper.loadData(this.props.serviceUrl, false, function(response) {
			var person = {
					name : response.name,
					ids : response.ids
				};
			comp.setState(person);
			comp.props.taskList.setPlayer(person);
		});
		return {
			name : "???", // this.props.player.name,
			ids : [ "???" ] // this.props.player.ids
		};
	},

  	render: function render() {
  		var ids = (this.state.ids ? this.state.ids : []);
  		var idRows = ids.map(function(id) {
  			var url = null;
  			if (emailPattern.test(id)) {
  				url = "mailto:" + id;
  			} else if (urlPattern.test(id)) {
  				url = id;
  			}
      		return React.createElement("tr", { key: id },
    	    	React.createElement("td", { className: "playerId" },
    		    	(url != null ? React.createElement( "a", { href: url }, id ) : id)
    	 		)
          	);
  		});
    	return React.createElement("table", { className: "player" },
      		React.createElement("tbody", null,
	    			React.createElement("tr", null,
		    	    	React.createElement("td", { className: "playerName" },
		        		    "Name: " + this.state.name
		        	 	)
	    		),
	    		idRows
      		)
    	);
  	}
});
