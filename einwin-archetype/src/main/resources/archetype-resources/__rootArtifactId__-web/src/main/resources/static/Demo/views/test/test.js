demoApp.controller('testCtrl', ['$scope', function ($scope) {
    $scope.form = {
        projectId: '',
        project: '',
    };

    var data = [
        {
            "text": "Parent 1",
            "nodes": [
                {
                    "text": "Child 1",
                    "nodes": [
                        {
                            "text": "SubChild 1"
                        },
                        {
                            "text": "SubChild 2"
                        },
                        {
                            "text": "SubChild 3"
                        },
                        {
                            "text": "SubChild 4"
                        }
                    ]
                },
                {
                    "text": "Child 2"
                },
                {
                    "text": "Child 3"
                }
            ]
        },
        {
            "text": "Parent 2",
            "nodes": [
                {
                    "text": "Child 1"
                },
                {
                    "text": "Child 2"
                },
                {
                    "text": "Child 3"
                }
            ]
        },
        {
            "text": "Parent 3",
            "nodes": [
                {
                    "text": "Child 1"
                },
                {
                    "text": "Child 2"
                },
                {
                    "text": "Child 3"
                }
            ]
        }
    ];
    //树的初始化
    $("#project").treeSelect({ data: data}, function (node) {
        // inputNgModelParse.assign($scope, node.text);
        // hiddenNgModelParse.assign($scope, node.id);
        $scope.form.projectId=node.id;
        $scope.form.project =node.text;
        // $element.val(node.text);
        console.log(node);
    });


}]);