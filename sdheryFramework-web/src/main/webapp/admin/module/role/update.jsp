<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ include file="/FInclude/includeTaglibs.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <c:import url="/admin/module/core/includePublicHtml.jsp"/>
</head>
<body>
<c:import url="includeTop.jsp?tag=3"/>
<form class="form-horizontal well" method="post" action="${frontPath}/admin/role/update">
    <input type="hidden" name="sysRoleId" value="${sysRole.sysRoleId}"/>
    <div class="control-group">
        <label class="control-label">角色名称：</label>
        <div class="controls">
            <input type="text" name="sysRoleName" placeholder="角色名称" class="span4" value="${sysRole.sysRoleName}"/>
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