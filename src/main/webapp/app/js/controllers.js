'use strict';

/* Controllers */

var tiendaControllers = angular.module('tiendaControllers', []);


/**
 * Message controller
 */
tiendaControllers.controller('MessageCtrl', ['$scope', '$rootScope','messageService',
function ($scope, $rootScope, messageService) {
	
	$scope.close = function() {
		messageService.clear();
	};
}]);



/**
 * List controller
 */
tiendaControllers.controller('ListCrtl', ['$scope', '$http',
function ($scope, $http) {

	$http.get('/aplicacion/all/').success(function(data) {
	      $scope.apps = data;
	});
 }]);



/**
 * View controller
 */
tiendaControllers.controller('ViewCrtl', ['$scope', '$routeParams', '$http', '$location', 'messageService',

function ($scope, $routeParams, $http, $location, messageService) {

	  $http.get('/aplicacion/get/'+ $routeParams.appid).
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


