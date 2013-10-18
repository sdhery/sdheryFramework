<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="FInclude/includeTaglibs.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <script src="${frontPath}/js/jquery/jquery-1.8.3.min.js"></script>
    <script src="${frontPath}/js/jquery.pjax.js"></script>
    <script>
        $(document).pjax('a', '#pjax-container')
    </script>
</head>
<body>
<h1>My Site</h1>
<div id="pjax-container"></div>
<div class="container" >
    Go to <a href="${frontPath}/index.jsp">next page</a>
</div>

</body>
</html>