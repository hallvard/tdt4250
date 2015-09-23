var React = require('react');

var StringAnswer = require('./StringAnswer.jsx');
var NumberAnswer = require('./NumberAnswer.jsx');
var YesNoAnswer = require('./YesNoAnswer.jsx');
var MultiOptionAnswer = require('./MultiOptionAnswer.jsx');
var SingleOptionAnswer = require('./SingleOptionAnswer.jsx');

    var answerSelector = function(qItem){
        if (qItem.options && qItem.options.length > 0 ){
            
            return (qItem.numChoices > 1 ? <MultiOptionAnswer kind={qItem.kind} options={qItem.options}/> : <SingleOptionAnswer kind={qItem.kind} options={qItem.options}/>);
        } else if (qItem.kind=='YESNO'){
            return (<YesNoAnswer />);
        } else if (qItem.kind=='NUM'){
            return (<NumberAnswer />);
        }
        return (<StringAnswer />);
    };

var Question = React.createClass({



    render: function () {

        var qItem = this.props.data;
        var qIndex = this.props.key;
        return (
        	<div>

				<div class="section">
				    <h5>Q {qIndex}</h5>
				    <p>{qItem.question}</p>
                    {
                      answerSelector(qItem) 
                    }

				</div>
        
  			</div>
            );
    }
});

module.exports = Question;
