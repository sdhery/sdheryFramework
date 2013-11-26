<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ include file="/FInclude/includeTaglibs.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link type="text/css" href="${frontPath}/js/JQueryzTreev3.5.14/css/zTreeStyle/zTreeStyle.css" rel="stylesheet"/>
    <c:import url="/admin/module/core/includePublicHtml.jsp"/>
    <script src="${frontPath}/js/JQueryzTreev3.5.14/js/jquery.ztree.all-3.5.min.js"></script>
    <script>
        function init() {
            var setting = {
                view: {
                    selectedMulti: false
                },
                async: {
                    enable: true,
                    url: "${frontPath}/admin/role/loadSysResource",
                    autoParam: ["id=parentId"]
                },
                check: {
                    enable: true
                },
                callback: {
                    onNodeCreated: function zTreeOnNodeCreated(event, treeId, treeNode) {
                        var zTree = $.fn.zTree.getZTreeObj("leftTree");
                        zTree.reAsyncChildNodes(treeNode);
                    }
                }
            };
            jQuery.fn.zTree.init(jQuery("#leftTree"), setting, null);
        }
        $(function () {
            init()
        })
    </script>
</head>
<body>
<c:import url="includeTop.jsp?tag=2"/>
<form class="form-horizontal well" method="post" action="${frontPath}/admin/role/add">
    <div class="control-group">
        <label class="control-label">角色名称：</label>

        <div class="controls">
            <input type="text" name="sysRoleName" placeholder="角色名称" class="span4"/>
        </div>
    </div>
    <div class="control-group">
        <label class="control-label">角色授权：</label>

        <div class="controls">
            <ul id="leftTree" class="ztree" style="background: #fff"></ul>
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