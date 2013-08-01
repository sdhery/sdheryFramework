<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ include file="/FInclude/includeTaglibs.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>请登录</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link type="text/css" href="${frontPath}/admin/style/bootstrap/css/bootstraped.min.css" rel="stylesheet"/>
    <link type="text/css" href="${frontPath}/admin/style/module/core/login.css" rel="stylesheet"/>
    <script type="text/javascript" src="${frontPath}/js/jquery/jquery-1.8.3.min.js"></script>
    <script>$.frontPath="${frontPath}"</script>
    <script type="text/javascript" src="${frontPath}/admin/js/jqueryValidation/jquery.validate.min.js"></script>
    <script type="text/javascript" src="${frontPath}/admin/js/module/core/login.js"></script>
    <script type="text/javascript" src="${frontPath}/admin/style/bootstrap/js/bootstraped.min.js"></script>
</head>
<body>
<div class="container">
    <form class="form-signin" autocomplete="off" method="post" name="loginForm" id="loginForm">
        <h2 class="form-signin-heading">请登录</h2>
        <div class="input-xlarge input-append">
            <input type="text" class="input-block-level" placeholder="登录名" name="loginId"/>
            <span class="add-on"><i class="icon-user"></i></span>
        </div>
        <div class="input-xlarge input-append">
            <input type="password" class="input-block-level" placeholder="登录密码" name="password"/>
            <span class="add-on"><i class="icon-unlock"></i></span>
        </div>
        <button class="btn btn-primary" type="submit">登录</button>
    </form>
</div>
</body>
</html>