var React = require('react');
var Input = require('react-bootstrap').Input;

var MultiOptionsAnswer = React.createClass({

    render: function () {
    	var qItem = this.props.qItem;
    	var num = this.props.num;
    	var qHelper = this.props.qHelper;
    	var allSelected = [];
        return (
			<div className="container">
    			<div className="row">
    				{qItem.options.map(function(option, idx) {
	    				var qid = qItem.qid + "." + idx;	    				
	    				var changeFun = function (changeEvent) {
	    					var selected = changeEvent.target.checked;
	    					var pos = allSelected.indexOf(selected);
	    					if ((pos >= 0) != selected) {
	    						if (selected) {
	    							allSelected.push(idx);
	    						} else {
	    							allSelected.splice(pos, 1);
	    						}
	    					}
							qHelper.submitSimpleAnswer(num, allSelected);
						};
						if (option.selected) {
							allSelected.push(idx);
						}
	            		return (option.selected ?
			            			<Input key={qid} type="checkbox" label={option.answer} onChange={changeFun} defaultChecked/> :
			            			<Input key={qid} type="checkbox" label={option.answer} onChange={changeFun}/>
			            )
        			})}
    			</div>
			</div>
		);
	}
});

module.exports = MultiOptionsAnswer;
