'use strict';

/* Controllers */

var marketControllers = angular.module('marketControllers', []);


/**
 * Message controller
 */
marketControllers.controller('MessageCtrl', ['$scope', '$rootScope','messageService',
function ($scope, $rootScope, messageService) {
	
	$scope.close = function() {
		messageService.clear();
	};
}]);



/**
 * List controller
 */
marketControllers.controller('ListCrtl', ['$scope', '$http',
function ($scope, $http) {

	$http.get('http://localhost:8080/application/all/').success(function(data) {
	      $scope.apps = data;
	});
 }]);



/**
 * View controller
 */
marketControllers.controller('ViewCrtl', ['$scope', '$routeParams', '$http', '$location', 'messageService',

function ($scope, $routeParams, $http, $location, messageService) {

	  $http.get('http://localhost:8080/application/get/'+ $routeParams.appid).
	  	success(function(data) {
	  		$scope.app = data;
	  	}).
	  	error(function() {
	  		$location.path('/');
	  		messageService.setMessage('error', 'La aplicacion que se ha querido acceder no existe');
	  	});
	  
	  
//	  $scope.scrollTo = function(id) {
//		  
//		  $('#nav li').removeClass('active');
//		  $('#nav #li-'+id).addClass('active');
//		  window.scrollTo(0, $('#'+id).position().top - 50);
//	  };
	  
}]);


