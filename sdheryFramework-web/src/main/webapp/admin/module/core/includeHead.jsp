<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/FInclude/includeTaglibs.jsp" %>
<c:set value="${sysUser:getAdminSysUser(pageContext.request)}" var="sysUser"/>
<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container-fluid">
            <button data-target=".nav-collapse" data-toggle="collapse" class="btn btn-navbar" type="button">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a href="#" class="brand">管理后台</a>
            <div class="nav-collapse collapse">
                <ul class="nav pull-right">
                    <div class="btn-group">
                        <a class="btn btn-inverse"><i class="icon-user icon-white"></i>&nbsp;&nbsp;${sysUser.loginId}</a>
                        <a href="#" id="drop3" role="button" class="btn btn-inverse dropdown-toggle" data-toggle="dropdown"><b class="caret"></b></a>
                        <ul class="dropdown-menu" role="menu" aria-labelledby="drop3">
                            <li role="presentation"><a role="menuitem" tabindex="-1" href="#">退出</a></li>
                        </ul>
                    </div>
                </ul>
                <ul class="nav">
                    <li class="active"><a href="${frontPath}/admin/main.jsp">首页</a></li>
                    <li><a href="javascript:loadLeft('2');">信息</a></li>
                </ul>
            </div><!--/.nav-collapse -->
        </div>
    </div>
</div>