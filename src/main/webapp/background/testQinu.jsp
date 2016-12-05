<%--
  Created by IntelliJ IDEA.
  User: gaohailong
  Date: 2016/12/3
  Time: 下午3:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="self/css/highlight.css"/>
    <link href="self/css/main.css">

    <%--<link href="http://jssdk.demo.qiniu.io/images/favicon.ico" rel="shortcut icon">--%>
    <link rel="stylesheet" href="self/qiniu/bootstrap.css">
    <link rel="stylesheet" href="self/qiniu/main.css">
    <link rel="stylesheet" href="self/qiniu/highlight.css">
    <style type="text/css" adt="123"></style>
    <script src="self/js/jquery-2.0.3.min.js"></script>
</head>
<body>
<div class="container" style="padding-top: 60px;">
    <div class="tab-content">
        <div role="tabpanel" class="tab-pane fade in active" id="demo" aria-labelledby="demo-tab">

            <div class="row" style="margin-top: 20px;">
                <%--<input type="hidden" id="domain" value="http://7xl4c6.com1.z0.glb.clouddn.com/">--%>
                <input type="hidden" id="uptoken_url" value="${}">
                <div class="col-md-12">
                    <div id="container" style="position: relative;">
                        <a class="btn btn-default btn-lg " id="pickfiles" href="http://jssdk.demo.qiniu.io/#"
                           style="position: relative; z-index: 1;">
                            <i class="glyphicon glyphicon-plus"></i>
                            <span>选择文件</span>
                        </a>
                        <div id="html5_1aj3rtennnga1n5h927gjn8343_container" class="moxie-shim moxie-shim-html5"
                             style="position: absolute; top: 0px; left: 0px; width: 171px; height: 46px; overflow: hidden; z-index: 0;">
                            <input id="html5_1aj3rtennnga1n5h927gjn8343" type="file"
                                   style="font-size: 999px; opacity: 0; position: absolute; top: 0px; left: 0px; width: 100%; height: 100%;"
                                   multiple="" accept=""></div>
                    </div>
                </div>
                <div style="display:none" id="success" class="col-md-12">
                    <div class="alert-success">
                        队列全部文件处理完毕
                    </div>
                </div>
                <div class="col-md-12 ">
                    <table class="table table-striped table-hover text-left" style="margin-top:40px;display:none">
                        <thead>
                        <tr>
                            <th class="col-md-4">Filename</th>
                            <th class="col-md-2">Size</th>
                            <th class="col-md-6">Detail</th>
                        </tr>
                        </thead>
                        <tbody id="fsUploadProgress">
                        </tbody>
                    </table>
                </div>
            </div>

        </div>
    </div>
</div>
<script type="text/javascript" src="self/qiniu/jquery.min.js"></script>
<script type="text/javascript" src="self/qiniu/bootstrap.min.js"></script>
<script type="text/javascript" src="self/qiniu/moxie.js"></script>
<script type="text/javascript" src="self/qiniu/plupload.dev.js"></script>
<script type="text/javascript" src="self/qiniu/zh_CN.js"></script>
<script type="text/javascript" src="self/qiniu/ui.js"></script>
<script type="text/javascript" src="self/qiniu/qiniu.js"></script>
<script type="text/javascript" src="self/qiniu/highlight.js"></script>
<script type="text/javascript" src="self/qiniu/main.js"></script>
<script type="text/javascript">hljs.initHighlightingOnLoad();</script>
</body>
</html>
