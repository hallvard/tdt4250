var React = require('react');
var Button = require('react-bootstrap').Button;

var YesNoAnswer = React.createClass({

    render: function () {
    	var num = this.props.num;
    	var qHelper = this.props.qHelper;
        return (
			<div className="container">
    			<div className="row">
        			<div className="center-block">
    					<Button bsStyle="success"
			        		onClick={ function() {
			        			qHelper.submitSimpleAnswer(num, true);
			        		}}
    					>Yes</Button>
						<span></span>
    					<Button bsStyle="danger"
			        		onClick={ function() {
			        			qHelper.submitSimpleAnswer(num, false);
			        		}}
    					>No</Button>
					</div>
    			</div>
    		</div>
		);
	}
});

module.exports = YesNoAnswer;
