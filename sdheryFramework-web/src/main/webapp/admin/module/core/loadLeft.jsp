<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/FInclude/includeTaglibs.jsp" %>
<div class="accordion">
        <div class="accordion-group">
            <div class="accordion-heading">
                <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseOne">
                        ${sysResource.resourceTitle}
                </a>
            </div>
            <div id="collapseOne" class="accordion-body collapse in">
                <div class="accordion-inner">
                    <ul class="nav nav-list">
                        <c:forEach items="${children}" var="sysResource">
                            <li><a href="${frontPath}${sysResource.resourceUrl}" target="contentFrame"><i class="icon-pencil"></i>${sysResource.resourceTitle}</a></li>
                        </c:forEach>
                    </ul>
                </div>
            </div>
        </div>
</div>
