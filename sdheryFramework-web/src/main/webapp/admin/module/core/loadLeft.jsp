<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/FInclude/includeTaglibs.jsp" %>
<c:set value="${sdk:getSysTreeBySysTreeId(param.parentId)}" var="sysTree"/>
<div class="accordion">
        <div class="accordion-group">
            <div class="accordion-heading">
                <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseOne">
                        ${sysTree.sysTreeName}
                </a>
            </div>
            <div id="collapseOne" class="accordion-body collapse in">
                <div class="accordion-inner">
                    <ul class="nav nav-list">
                        <c:forEach items="${result}" var="sysTreeSecond">
                            <li><a href="${frontPath}${sysTreeSecond.object.actionUrl}" target="contentFrame"><i class="icon-pencil"></i>${sysTreeSecond.name}</a></li>
                        </c:forEach>
                    </ul>
                </div>
            </div>
        </div>
</div>
