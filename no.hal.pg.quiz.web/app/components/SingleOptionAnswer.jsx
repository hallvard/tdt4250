var React = require('react');
var Input = require('react-bootstrap').Input;

var SingleOptionsAnswer = React.createClass({

    render: function () {
    	var qItem = this.props.qItem;
    	var num = this.props.num;
    	var qHelper = this.props.qHelper;
        return (
   			<div className="container">
	   			<div className="row">
    			{qItem.options.map(function(option, idx) {
    				var qid = qItem.qid + "." + idx;
    				var changeFun = function () {
						qHelper.submitSimpleAnswer(num, idx);
					};
            		return (option.selected ?
            					<Input key={qid} type="radio" name="name" label={option.answer} onChange={changeFun} defaultChecked/> :
            					<Input key={qid} type="radio" name="name" label={option.answer} onChange={changeFun}/>
            		)
        		})}
    			</div>
    		</div>
        );
    }
});

module.exports = SingleOptionsAnswer;
