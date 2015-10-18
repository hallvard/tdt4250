/*
this.props:
{
	serviceUrl : a link to the current quiz,
	player : id of current player,
	questions :
	[ {
	  "numChoices" : 1,
	  "question" : "I hvilken by ligger Stortinget?",
	  "kind" : "STRING",
	  "lastProposal" : "Trondheim"
	  "accepted" : "null"
	  "rejectCount" : 1
	  "options" : [ {
	    "answer" : "Trondheim",
	    "selected" : false
	  }, {
	    "answer" : "Oslo",
	    "selected" : false
	  }, {
	    "answer" : "Fredrikstad",
	    "selected" : false
	  } ]
}
this.state:
{
	questions :
	[ {
	  "numChoices" : 1,
	  "question" : "I hvilken by ligger Stortinget?",
	  "kind" : "STRING",
	  "lastProposal" : "Trondheim"
	  "accepted" : "null"
	  "rejectCount" : 1
	  "options" : [ {
	    "answer" : "Trondheim",
	    "selected" : false
	  }, {
	    "answer" : "Oslo",
	    "selected" : false
	  }, {
	    "answer" : "Fredrikstad",
	    "selected" : false
	  } ]
}

*/

var React = require('react');
var Question = require('./Question.jsx');
var ButtonInput = require('react-bootstrap').ButtonInput;
var AppHelper = require('../AppHelper.js');

var QuizContainer = React.createClass({
    
     serviceUrl : AppHelper.serviceUrl(window.location.search),


    getInitialState: function () {
		var comp = this;

		AppHelper.loadData(this.serviceUrl, true, function(response) {
			AppHelper.log("Questions retrieved: " + response, AppHelper.LOGGING_INFO);
			comp.setState({
				questions : response
			});
		});
		return {
			//Return initial test data set in html
			questions : this.props.questions
		};
    },



    render: function () {
    return (
      <div>
      <form className="col s12">
      {this.state.questions.map(function(item, idx){
          return <Question key={idx} data={item} />;
        })}
    <div>
    <ButtonInput type="reset" value="Cancel" />
    <ButtonInput type="submit" value="Save" />
    <ButtonInput type="submit" value="Submit" />
    </div>
    </form>
    </div>);
  }
});

module.exports = QuizContainer;
