var React = require('react');
var Input = require('react-bootstrap').Input;

var NumberAnswer = React.createClass({

    render: function () {
		return (
			<Input
        		type="number"
		        placeholder="Enter Answer"
        		label="Working example with validation"
        		help="Validation is based on string length."
        		ref="input"
        		groupClassName="group-class"
        		labelClassName="label-class"
        	/>
		);
	}
});

module.exports = NumberAnswer;
