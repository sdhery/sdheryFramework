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
        <th>登录名</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${userList}" var="sysUser" varStatus="s">
        <tr>
            <td>${sysUser.loginId}</td>
            <td></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>