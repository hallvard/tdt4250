var React = require('react');
var Input = require('react-bootstrap').Input;

var OptionsAnswer = React.createClass({


    render: function () {
        return (
   <div class="container">
    <div class="row">
    {this.props.options.map(function(option){
            return (option.selected ? <Input type="checkbox" label={option.answer} defaultChecked /> : <Input type="checkbox" label={option.answer} />)
        })
    }    
    </div>





    </div>
            );
    }
});

module.exports = OptionsAnswer;
