var React = require('react');
var Input = require('react-bootstrap').Input;

var StringAnswer = React.createClass({

    render: function () {
    	var num = this.props.num;
    	var qHelper = this.props.qHelper;
		var input = <Input
        		type="text"
		        placeholder="Enter Answer"
        		ref="input"
        		groupClassName="group-class"
        		labelClassName="label-class"
        		
        		onBlur={ function(focusEvent) {
        			qHelper.submitSimpleAnswer(num, focusEvent.target.value);
        		}}
        	/>;
		return input;
    }
});

module.exports = StringAnswer;
