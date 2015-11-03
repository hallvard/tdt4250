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

    getInitialState: function () {
		this.loadQuestions('getPlayerQuestions');
		return {
			questions : this.props.questions
		};
    },

    loadQuestions: function (serviceName) {
		var comp = this;
		AppHelper.loadData(this.props.serviceUrl + '/' + serviceName, true, function(response) {
			comp.setState({
				questions : response
			});
		});
    },

	submitSimpleAnswer: function (num, proposal) {
		console.log("Proposing " + proposal);
		AppHelper.loadData(this.props.serviceUrl + "/proposeAnswer?qa=" + num + "&proposal=" + proposal, false, function(response) {
			console.log(response);
		});
	},

	acceptAllProposals: function () {
		var comp = this;
		AppHelper.loadData(this.props.serviceUrl + '/acceptAllProposals', true, function(response) {
			comp.setState({
				questions : response
			});
		});
	},
	
    render: function () {
    	var comp = this;
	    return (
	      <div>
      		{this.state.questions.map(function(item, idx) {
          		return <Question key={item.qid} num={idx} data={item} qHelper={comp}/>;
        	})}
    		<div>
    			<ButtonInput value="Check answers"
	        		onClick={ function() {
	        			comp.acceptAllProposals();
	        		}}
    			/>
    		</div>
	    </div>
	    );
  	}
});

module.exports = QuizContainer;
