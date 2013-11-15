<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/FInclude/includeTaglibs.jsp" %>
<ul class="nav nav-tabs">
    <li class="${param.tag eq 1 ? 'active' : ''}"><a href="${frontPath}/admin/info/list">列表</a></li>
    <c:if test="${param.tag != 3}"><li class="${param.tag eq 2 ? 'active' : ''}"><a href="${frontPath}/admin/module/role/add.jsp">添加</a></li></c:if>
    <c:if test="${param.tag eq 3}"><li class="${param.tag eq 3 ? 'active' : ''}"><a>修改</a></li></c:if>
</ul>