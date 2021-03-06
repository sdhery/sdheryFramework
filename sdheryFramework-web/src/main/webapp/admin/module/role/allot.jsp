<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/FInclude/includeTaglibs.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <link type="text/css" href="${frontPath}/js/JQueryzTreev3.5.14/css/zTreeStyle/zTreeStyle.css" rel="stylesheet"/>
    <c:import url="/admin/module/core/includePublicHtml.jsp"/>
    <script src="${frontPath}/js/JQueryzTreev3.5.14/js/jquery.ztree.all-3.5.min.js"></script>
    <script>
        function init(){
            var setting = {
                view:{
                    selectedMulti:false
                },
                async:{
                    enable:true,
                    url:"${frontPath}/admin/role/loadSysResource",
                    autoParam:["id=parentId"]
                },
                check: {
                    enable: true
                }
            };
            jQuery.fn.zTree.init(jQuery("#leftTree"), setting, null);
        }
        $(function(){
            init()
        })
        var selectedNodes = function(){
            var treeObj = $.fn.zTree.getZTreeObj("leftTree");
            var nodes = treeObj.getCheckedNodes(true);
            var $allotFrom = $("#allotFrom")
            $allotFrom.html("<input type='hidden' name='sysRoleId' value='${param.sysRoleId}'/>")
            for(var i=0;i<nodes.length;i++){
                var hiddenHtml = "<input type='hidden' name='sysResourceIds' value='"+nodes[i].id+"'/>"
                $allotFrom.append(hiddenHtml)
            }
            $allotFrom.submit()
        }
    </script>
</head>
<body>
<c:import url="includeTop.jsp"/>
<ul id="leftTree" class="ztree"></ul><a class="btn" onclick="selectedNodes()">提交</a>
<form id="allotFrom" method="post" action="${frontPath}/admin/role/allot"></form>
</body>
</html>