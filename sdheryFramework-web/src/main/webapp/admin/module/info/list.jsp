<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/FInclude/includeTaglibs.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <c:import url="/admin/module/core/includePublicHtml.jsp"/>
    <script>
        $(function () {
			/*var temp = $("#modalDemo")在父窗口显示对话框
            $("#"+temp.attr("id"),window.parent.document).remove()
			window.parent.$('body').append(temp)
			window.parent.$("#modalDemo").modal("show")
            $("#modalDemo").myModal({
                backdrop: true,
                keyboard: true,
                show: true,
                iframe: true
            })*/
        })

    </script>
</head>
<body>
<c:import url="includeTop.jsp?tag=1"/>
<table class="table table-bordered table-hover table-striped table-condensed">
    <thead>
    <tr>
        <th>标题</th>
        <th>创建时间</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="article" varStatus="s">
        <tr>
            <td>${article.title}</td>
            <td><fmt:formatDate value="${article.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
            <td><a href="${frontPath}/admin/info/update?infoArticleId=${article.infoArticleId}">修改</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<div class="modal hide fade" id="modalDemo">
    <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h3>dd</h3>
    </div>
</div>
</body>
</html>