var React = require('react');
var Input = require('react-bootstrap').Input;

var SingleOptionsAnswer = React.createClass({

    render: function () {
        return (
   			<div className="container">
	   			<div className="row">
    			{this.props.options.map(function(option) {
            		return (option.selected ? <Input type="radio" name="name" label={option.answer} defaultChecked /> : <Input type="radio" name="name" label={option.answer} />)
        		})}
    			</div>
    		</div>
        );
    }
});

module.exports = SingleOptionsAnswer;
