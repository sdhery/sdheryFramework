<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/FInclude/includeTaglibs.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <c:import url="/admin/module/core/includePublicHtml.jsp"/>
</head>
<body>
<c:import url="includeTop.jsp?tag=1"/>
<table class="table table-bordered table-hover table-striped table-condensed">
    <thead>
    <tr>
        <th>角色名称</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="sysRole" varStatus="s">
        <tr>
            <td>${sysRole.sysRoleName}</td>
            <td><c:if test ="${sysRole.sysRoleId != 1}"><a href="${frontPath}/admin/role/update?sysRoleId=${sysRole.sysRoleId}">修改</a></c:if></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>