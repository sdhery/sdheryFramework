<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ include file="/FInclude/includeTaglibs.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <c:import url="/admin/module/core/includePublicHtml.jsp"/>
</head>
<body>
<c:import url="includeTop.jsp?tag=2"/>
<form class="form-horizontal well" method="post" action="${frontPath}/admin/admin/add">
    <div class="control-group">
        <label class="control-label">登录名：</label>
        <div class="controls">
            <input type="text" name="loginId" placeholder="登录名" class="span4"/>
        </div>
    </div>
    <div class="control-group">
        <label class="control-label">密码：</label>
        <div class="controls">
            <input type="password" name="passwordHash" placeholder="密码" class="span4"/>
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