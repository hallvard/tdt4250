// React component for Task list

var emailPattern = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
var urlPattern = /(http|ftp|https):\/\/[\w-]+(\.[\w-]+)+([\w.,@?^=%&amp;:\/~+#-]*[\w@?^=%&amp;\/~+#-])?/;

var PlayerComponent = React.createClass({
	displayName: "Player component",
	
  	render: function render() {
  		var rows = this.props.ids.map(function(id) {
  			var url = null;
  			if (emailPattern.test(id)) {
  				url = "mailto:" + id;
  			} else if (urlPattern.test(id)) {
  				url = id;
  			}
      		return React.createElement(
          		"tr", { key: id },
    	    	React.createElement(
    	      		"td", { className: "playerId" },
    		    	(url != null ? React.createElement( "a", { href: url }, id ) : id)
    	 		)
          	);
  		});
    	return React.createElement(
      		"table", { className: "player" },
      		React.createElement(
    			"tr", null,
    	    	React.createElement(
        	      	"td", { className: "playerName" },
        		    "Name: " + this.props.name
        	 	)
      		),
      		rows
    	);
  	}
});
