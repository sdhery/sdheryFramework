<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/FInclude/includeTaglibs.jsp" %>
<ul class="nav nav-tabs">
    <li class="${param.tag eq 1 ? 'active' : ''}"><a href="${frontPath}/admin/info/list">列表</a></li>
    <li class="${param.tag eq 2 ? 'active' : ''}"><a href="${frontPath}/admin/module/info/add.jsp">添加</a></li>
</ul>