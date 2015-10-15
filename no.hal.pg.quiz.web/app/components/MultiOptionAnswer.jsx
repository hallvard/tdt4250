var React = require('react');
var Input = require('react-bootstrap').Input;

var MultiOptionsAnswer = React.createClass({

    render: function () {
        return (
			<div className="container">
    			<div className="row">
    				{this.props.options.map(function(option) {
	            		return (option.selected ? <Input type="checkbox" label={option.answer} defaultChecked /> : <Input type="checkbox" label={option.answer} />)
        			})}
    			</div>
			</div>
		);
	}
});

module.exports = MultiOptionsAnswer;
