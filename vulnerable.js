// example.js

function vulnerableFunction() {
  eval("console.log('This is eval!')");
}

module.exports = {
  vulnerableFunction
};
