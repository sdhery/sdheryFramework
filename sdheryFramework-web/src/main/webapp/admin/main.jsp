<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ include file="/FInclude/includeTaglibs.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>管理后台</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link type="text/css" rel="stylesheet" href="${frontPath}/js/jQueryLayout/layout-default-latest.css"/>
    <link type="text/css" href="${frontPath}/admin/style/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
    <link type="text/css" href="${frontPath}/admin/style/bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet"/>
    <script type="text/javascript" src="${frontPath}/js/jquery/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="${frontPath}/js/jQueryLayout/jquery.layout-latest.min.js"></script>
    <script type="text/javascript" src="${frontPath}/admin/style/bootstrap/js/bootstrap.min.js"></script>
    <script>
        function loadLeft(sysTreeId) {
            var params = new Object();
            params['sysTreeId'] = sysTreeId
            $("#loadLeft").load("${frontPath}/admin/module/core/loadLeft.jsp", params)
        }
        function loadRight() {
            $("#loadRight").load("${frontPath}/admin/module/info/add.jsp")
        }
        var layoutSettings_Outer = {
            defaults:{
                applyDefaultStyles:false,
                spacing_open:0,
                closable:false
            },
            north: {
                size:50
            },
            west: {
                size:240
            },
            east: {
                size:8
            },
            south: {
                size:72
            },
            center__maskContents:true
        }
        $(function () {
            topLayout = $('body').layout(layoutSettings_Outer);
        });
    </script>

</head>
<body>
<IFRAME id="contentFrame" name="contentFrame" class="ui-layout-center" scrolling="auto" frameborder="0" ></IFRAME>
<div class="ui-layout-north"><c:import url="/admin/module/core/includeHead.jsp"/></div>
<DIV class="ui-layout-west" id="loadLeft"></DIV>
<DIV class="ui-layout-east"></div>
<div class="container-fluid ui-layout-south">
    <hr>
    <footer>
        <p>&copy; Company 2013</p>
    </footer>
</div>
</body>
</html>