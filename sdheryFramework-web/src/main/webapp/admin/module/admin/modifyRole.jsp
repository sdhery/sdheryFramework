<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/FInclude/includeTaglibs.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <c:import url="/admin/module/core/includePublicHtml.jsp"/>
</head>
<body>
<c:import url="includeTop.jsp?tag=3"/>
<form class="form-horizontal well" method="post">
    <div class="control-group">
        <label class="control-label">登录名：</label>
        <div class="controls"><input type="text" value="${sysUser.loginId}" readonly/></div>
    </div>
    <div class="control-group">
        <div class="controls">
            <button type="submit" class="btn btn-primary">提交</button>
        </div>
    </div>
</form>
</body>
</html>