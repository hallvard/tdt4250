// App Helper object

console.log("Loading AppHelper");
var AppHelper = {
	
	LOGGING_ERROR: 1,
	LOGGING_WARNING: 2,
	LOGGING_INFO: 3,

	loggingLevel: 3,

	log: function(message) {
		var level = this.loggingLevel;
		if (arguments.length > 1) {
			level = arguments[1];
		}
		if (level >= this.loggingLevel) {
			console.log(message);
		}
	},

	serviceUrl: function(serviceUrl) {
		if (serviceUrl.indexOf("?") === 0) {
			serviceUrl = serviceUrl.substring(1);
		}
		if (serviceUrl.indexOf(":") > 5) {
			serviceUrl = window.location.origin + serviceUrl;
		}
		return serviceUrl;
	},
	
	loadData : function(theUrl) {
		var isAsync = arguments.length > 1;
		var xmlHttp = new XMLHttpRequest();
		if (isAsync) {
			var callback = arguments[1];
			var responseObject = this.responseObject;
			var self = this;
			xmlHttp.onreadystatechange = function() {
				if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
					callback(self.responseObject(xmlHttp.responseText));
				}
			}
		}
		xmlHttp.open("GET", theUrl, isAsync);
		xmlHttp.send(null);
		return (isAsync ? null : this.responseObject(xmlHttp.responseText));
	},

	isArray: function(object) {
		return (Array.isArray && Array.isArray(object));
	},
	
	responseObject: function(responseText) {
		var response = responseText;
		if (typeof response === 'string') {
			response = JSON.parse(response);
		}
		if (this.isArray(response)) {
			response = response[0];
		}
		this.log("Response: " + responseText + " -> " + response, this.LOGGING_INFO);
		return response;
	}
};
