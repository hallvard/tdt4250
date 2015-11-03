var React = require('react');

var StringAnswer = require('./StringAnswer.jsx');
var NumberAnswer = require('./NumberAnswer.jsx');
var YesNoAnswer = require('./YesNoAnswer.jsx');
var MultiOptionAnswer = require('./MultiOptionAnswer.jsx');
var SingleOptionAnswer = require('./SingleOptionAnswer.jsx');


var Question = React.createClass({

	answerSelector: function(qItem) {
	    if (qItem.options && qItem.options.length > 0 ){
	        return (qItem.numChoices == 1 ?
	        			<SingleOptionAnswer qItem={qItem} num={this.props.num} qHelper={this.props.qHelper}/> :
	        			<MultiOptionAnswer qItem={qItem} num={this.props.num} qHelper={this.props.qHelper}/>);
	    } else if (qItem.kind=='YESNO') {
	        return (<YesNoAnswer qItem={qItem} num={this.props.num} qHelper={this.props.qHelper}/>);
	    } else if (qItem.kind=='NUM') {
	        return (<NumberAnswer qItem={qItem} num={this.props.num} qHelper={this.props.qHelper}/>);
	    }
	    return (<StringAnswer qItem={qItem} num={this.props.num} qHelper={this.props.qHelper}/>);
	},

	componentWillReceiveProps: function(nextProps) {
		this.setState({});
	},

    render: function () {
        var qItem = this.props.data;
        var qIndex = this.props.key;
        var divStyle = {};
        if (typeof qItem.accepted === 'boolean') {
        	divStyle.border = "2px solid " + (qItem.accepted ? "LightGreen" : "Red"); 
        }
        return (
        	<div>
				<div className="section" style={divStyle}>
				    <h5>Q {qIndex}</h5>
				    <p>{qItem.question}</p>
                    {
                      this.answerSelector(qItem) 
                    }
				</div>
  			</div>
        );
    }
});

module.exports = Question;
