'use strict';

/* App Module */

var app = angular.module('marketApp', [
                            'ngRoute',
                            'marketControllers',
                            'marketFilters',
                            'marketServices']).config( [
                                '$compileProvider',
                                function( $compileProvider ) {
                                    $compileProvider.aHrefSanitizationWhitelist(/^\s*(https?|ftp|mailto|chrome-extension):/);
                                    $compileProvider.imgSrcSanitizationWhitelist(/^\s*(https?|ftp|file|chrome-extension):|data:image/);
                                }
                            ]);

app.config(['$routeProvider',
  function($routeProvider) {
    $routeProvider.
      when('/', {
        templateUrl: 'partials/app-list.html',
        controller: 'ListCrtl'
      }).
      when('/view/:appid', {
        templateUrl: 'partials/app-view.html',
        controller: 'ViewCrtl'
      }).
      otherwise({
        redirectTo: '/'
      });
  }]);


