// App Helper object

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

	appProps: function getQueryVariable(props, defaultProp, search) {
		if (typeof defaultProp != 'string') {
			defaultProp = 'serviceUrl';
		}
		if (typeof search != 'string') {
			search = window.location.search;
		}
		if (search.indexOf("?") === 0) {
			search = search.substring(1);
		}
	    var vars = search.split('&');
	    for (var i = 0; i < vars.length; i++) {
	        var pair = vars[i].split('=');
	        var argName = decodeURIComponent(pair[0]);
	        if (pair.length == 1) {
	        	if (vars.length == 1) {
	        		props[defaultProp] = search;
	        		break;
	        	} else {
	        		props[argName] = true;
	        	}
	        } else { 
	        	var argValue = decodeURIComponent(pair[1]);
	        	props[argName] = argValue;
	    	}
	    }
	    return props;
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
	
	loadData : function(theUrl, asArray, callback) {
		var isAsync = typeof callback === 'function';
		var xmlHttp = new XMLHttpRequest();
		if (isAsync) {
			var responseObject = this.responseObject;
			var self = this;
			xmlHttp.onreadystatechange = function() {
				if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
					callback(self.responseObject(xmlHttp.responseText, asArray));
				}
			}
		}
		xmlHttp.open("GET", theUrl, isAsync);
		xmlHttp.send(null);
		return (isAsync ? null : this.responseObject(xmlHttp.responseText, asArray));
	},

	isArray: function(object) {
		return (Array.isArray && Array.isArray(object));
	},
	
	responseObject: function(responseText, asArray) {
		var response = responseText;
		if (typeof response === 'string') {
			response = JSON.parse(response);
		}
		if (asArray != this.isArray(response)) {
			if (asArray) {
				response = [response];
			} else {
				response = response[0];
			} 
		}
		this.log("Response: " + responseText + " -> " + response, this.LOGGING_INFO);
		return response;
	}
};
module.exports = AppHelper;
