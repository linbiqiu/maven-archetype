/**
 * Created by pengchao on 2017/5/27.
 */


var Einwin = window.Einwin || {};
Einwin.Include = (function () {
    var rootFolder="/webjars/einwin"
    var pluginsFolder=rootFolder+"/plugins";
    var bowerFolder=pluginsFolder+"/bower";
    var layoutFolder=rootFolder+"/layout";
    var directiveFolder=rootFolder+"/directive";
    var imageFolder=rootFolder+"/images";
    var initFolder=rootFolder+"/init";
    var cssFolder=rootFolder+"/css";

    var css =[
        pluginsFolder+"/jstree/3.3.3/themes/default/style.min.css",
        pluginsFolder+"/bootstrap/3.3.7/css/bootstrap.min.css",
        rootFolder+"/css/lib/lumen.css",
        pluginsFolder+"/datatables/1.10.13/css/dataTables.bootstrap.min.css",
        rootFolder+"/css/init/main.css",
        pluginsFolder+"/font-awesome/4.7.0/css/font-awesome.min.css",
        pluginsFolder+"/ionicons/css/ionicons.min.css",
        pluginsFolder+"/datetimepicker/2.3.4/jquery.datetimepicker.css",
        pluginsFolder+"/AdminLTE/2.3.8/dist/css/AdminLTE.min.css",
        pluginsFolder+"/AdminLTE/2.3.8/dist/css/skins/_all-skins.min.css",
        bowerFolder+ "/jquery-icheck/1.0.2/skins/all.css",
        bowerFolder+"/sweetalert2/6.4.2/dist/sweetalert2.min.css",
        pluginsFolder+"/treeview/bootstrap-treeview.min.css",
        pluginsFolder+"/bower/jquery-icheck/1.0.2/skins/all.css",
        pluginsFolder+"/datetimepicker/2.3.4/jquery.datetimepicker.css",
        // pluginsFolder+"/datatables-plugins/Select-1.2.2/css/select.dataTables.min.css"
    ];

    var js=[

        pluginsFolder+"/jquery/3.2.0/jquery.min.js",
        pluginsFolder+"/angularjs/1.4.6/angular.min.js",
        bowerFolder+"/angular-route/1.4.6/angular-route.min.js",
        pluginsFolder+"/validator/angular-validator.js",
        pluginsFolder+"/file/angular-file-upload.js",
        pluginsFolder+"/bootstrap/3.3.7/js/bootstrap.min.js",
        pluginsFolder+"/datatables/1.10.13/js/jquery.dataTables.min.js",
        pluginsFolder+"/datatables/jquery.page.input.js",
        pluginsFolder+"/datatables/1.10.13/js/dataTables.bootstrap.min.js",
        pluginsFolder+"/AdminLTE/2.3.8/dist/js/app.js",
        rootFolder+"/directive/angular.datetime.js",
        pluginsFolder+"/fastclick/1.0.6/fastclick.js",
        pluginsFolder+"/jquery-knob/1.2.11/jquery.knob.min.js",
        pluginsFolder+"/jquery.sparkline/2.1.2/jquery.sparkline.min.js",
        pluginsFolder+"/jQuery-slimScroll/1.3.8/jquery.slimscroll.min.js",
        pluginsFolder+"/layer/3.0.3/layer.js",
        pluginsFolder+"/jstree/3.3.3/jstree.min.js",
        pluginsFolder+"/selector/jquery.item-selector.js",
        bowerFolder+"/jquery-icheck/1.0.2/icheck.min.js",
        pluginsFolder+"/datetimepicker/2.3.4/jquery.datetimepicker.js",
        bowerFolder+"/sweetalert2/6.4.2/dist/sweetalert2.min.js",
        bowerFolder+"/es6-promise/4.0.5/es6-promise.min.js",
        pluginsFolder+"/file/angular-file-upload.js",
        pluginsFolder+"/jquery/jquery.cookie.js",
        rootFolder+"/init/main.js",
        rootFolder+"/directive/angular.permit.js",

        rootFolder+"/directive/angular.form.js",
        rootFolder+"/directive/angular.datetime.js",
        pluginsFolder+"/treeview/bootstrap-treeview.min.js",
        pluginsFolder+"/treeview/bootstrap-treeview.config.js",
        pluginsFolder+"/bower/jquery-icheck/1.0.2/icheck.min.js",
        pluginsFolder+"/datetimepicker/2.3.4/jquery.datetimepicker.js",
        pluginsFolder+"/datatables/1.10.13/js/dataTables.bootstrap.min.js",
        // pluginsFolder+"/datatables-plugins/Select-1.2.2/js/dataTables.select.min.js"

    ];

    var  getLayoutFolder=function () {
        return layoutFolder;
    }

    /**
     * 导入公用的js
     */
    var includeJs=function () {
        for(var i=0;i<js.length;i++ ) {
            document.write("<script src='"+js[i]+"'></script>");
        }
    };

    /**
     * 导入公用的
     */
    var includeCss=function () {

        var head= document.getElementsByTagName("head")[0];
        for(var i=0;i<css.length;i++ ) {
            head.appendChild(createStyle(css[i]));
        }

    }

    /**
     * 创建CSS元素
     * @param url
     * @returns {Element}
     */
    var createStyle=function(url) {
        var link = document.createElement("link");
        link.rel = "stylesheet";
        link.type = "text/css";
        link.href = url;
        return link;
    }

    var include=function () {
        includeCss();
        includeJs();
    }

    return{
        include:include
        // getLayoutFolder:getLayoutFolder
    }
}());
