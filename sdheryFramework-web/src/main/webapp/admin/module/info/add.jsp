<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ include file="/FInclude/includeTaglibs.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link type="text/css" href="${frontPath}/admin/style/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
    <script type="text/javascript" src="${frontPath}/js/jquery/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="${frontPath}/admin/style/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<form class="form-horizontal well" method="post" action="${frontPath}/admin/info/addOk">
    <div class="control-group">
        <label class="control-label">标题：</label>

        <div class="controls">
            <input type="text" name="title" placeholder="标题" class="span4"/>
        </div>
    </div>
    <div class="control-group">
        <label class="control-label">内容：</label>

        <div class="controls">
            <textarea name="content" id="content" class="span4"></textarea>
        </div>
    </div>
    <div class="control-group">
        <div class="controls">
            <button type="submit" class="btn btn-primary">提交</button>
        </div>
    </div>
</form>
</body>
</html>