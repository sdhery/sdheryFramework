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
<form class="form-horizontal well" method="post" action="${frontPath}/admin/role/add">
    <div class="control-group">
        <label class="control-label">角色名称：</label>
        <div class="controls">
            <input type="text" name="sysRoleName" placeholder="角色名称" class="span4"/>
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