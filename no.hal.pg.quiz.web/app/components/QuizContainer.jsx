/*
this.props:
{
	serviceUrl : a link to the current quiz
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

var QuizContainer = React.createClass({

  getInitialState: function () {
    return {id: 0, content: 'Loading...'};
  },

  render: function () {
    return (
      <div>
      <form className="col s12">
      {this.props.questions.map(function(item, idx){
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
