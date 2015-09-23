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
      <form class="col s12">

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