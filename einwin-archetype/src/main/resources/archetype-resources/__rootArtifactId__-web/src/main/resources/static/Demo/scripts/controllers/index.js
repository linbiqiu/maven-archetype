/**
 * Created by Tim on 2017/2/20.
 */
"use strict";
/*配置路由*/
var demoApp=angular.module('demoApp',
    [
        'ngRoute',
        'directives',
        'angularValidator',
        'ui.bootstrap',
        'formCenter',
        'datetimepicker'
    ]);


//设置视图和路由的对应关系
demoApp.config(function ($routeProvider) {
    $routeProvider
        .when('/test',{
            templateUrl:'views/test/test.html',
        })
        .otherwise({
            redirectTo: '/test'
        });
});