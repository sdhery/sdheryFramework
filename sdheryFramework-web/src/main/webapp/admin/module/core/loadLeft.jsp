<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/FInclude/includeTaglibs.jsp" %>
<c:set value="${sysTree:getSysTreeListByParentId(param.sysTreeId)}" var="children"/>
<div class="accordion">
    <c:forEach items="${children}" var="sysTree">
        <c:set value="${sysTree:getSysTreeListByParentId(sysTree.sysTreeId)}" var="childrenSecond"/>
        <div class="accordion-group">
            <div class="accordion-heading">
                <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseOne">
                        ${sysTree.sysTreeName}
                </a>
            </div>
            <div id="collapseOne" class="accordion-body collapse in">
                <div class="accordion-inner">
                    <ul class="nav nav-list">
                        <c:forEach items="${childrenSecond}" var="sysTreeSecond">
                            <li><a href="${frontPath}/admin/info/list" target="contentFrame"><i class="icon-pencil"></i>${sysTreeSecond.sysTreeName}</a></li>
                        </c:forEach>
                    </ul>
                </div>
            </div>
        </div>
    </c:forEach>
</div>
