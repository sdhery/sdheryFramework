<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ include file="/FInclude/includeTaglibs.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link type="text/css" href="${frontPath}/admin/style/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
    <script type="text/javascript" src="${frontPath}/js/jquery/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="${frontPath}/admin/style/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<c:import url="includeTop.jsp?tag=3"/>
<form class="form-horizontal well" method="post" action="${frontPath}/admin/info/updateOK">
    <input type="hidden" name="infoArticleId" value="${infoArticle.infoArticleId}"/>
    <input type="hidden" name="createTime"  value="<fmt:formatDate value="${infoArticle.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"/>
    <div class="control-group">
        <label class="control-label">标题：</label>

        <div class="controls">
            <input type="text" name="title" placeholder="标题" class="span4" value="${infoArticle.title}"/>
        </div>
    </div>
    <div class="control-group">
        <label class="control-label">内容：</label>

        <div class="controls">
            <textarea name="content" id="content" class="span4">${infoArticle.content}</textarea>
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