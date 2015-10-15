var React = require('react');
var Button = require('react-bootstrap').Button;

var YesNoAnswer = React.createClass({

    render: function () {
        return (
			<div className="container">
    			<div className="row">
        			<div className="center-block">
	    				{/* Indicates a successful or positive action */}
    					<Button bsStyle="success">Yes</Button>
						<span></span>
						{/* Indicates a dangerous or potentially negative action */}
    					<Button bsStyle="danger">No</Button>
					</div>
    			</div>
    		</div>
		);
	}
});

module.exports = YesNoAnswer;
