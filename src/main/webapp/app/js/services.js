'use strict';

/* Services */
 
angular.module('tiendaServices', ['ngResource']).
	factory('app', function($resource, $routeParams){
        return $resource('/aplicacion/get/'+ $routeParams.appid, {}, {
    		query: {method:'GET', params:{appid: $routeParams.appid}, isArray:false}
  		});
});


app.service('messageService', ['$rootScope', '$timeout', function(rootScope, $timeout) {
	
	rootScope.messageStatus = 'message-initial';
	rootScope.messageText = '';
	
	this.setMessage = function(type, message) {
		
		if (type == "error") {
			rootScope.messageStatus = 'alert alert-error';
			
		} else if (type == "success") {
			rootScope.messageStatus = 'alert alert-success';

		} else {
			rootScope.messageStatus = 'alert alert-info';
		}
		rootScope.messageText = message;
		
		$timeout(function(){
    		rootScope.messageStatus = 'message-initial';
    		rootScope.messageText = '';
		}, 4000);
	};
	
	this.clear = function() {
		rootScope.messageStatus = 'message-initial';
		rootScope.messageText = '';
	};
	
}]);