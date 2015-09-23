var React = require('react');
var QuizContainer = require('./QuizContainer.jsx');

var App = React.createClass({
    render: function () {




        return (
            <div>
                <h1>TDT4250 QUIZ GAME</h1>
                <QuizContainer />
            </div>
        );
    }
});

module.exports = App;