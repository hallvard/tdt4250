var React = require('react');
var App = require('./components/App.jsx');
var QuizContainer = require('./components/QuizContainer.jsx');

console.log("Exporting react");
window.React = React;
exports.React = React;
window.QuizContainer = QuizContainer;
exports.QuizContainer = QuizContainer;
//module.exports = React;
/*React.render(
    <App />,
    document.getElementById('example')
);*/
