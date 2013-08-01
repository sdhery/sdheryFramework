<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <script src="/js/jquery/jquery-1.8.3.min.js"></script>
    <script src="/js/jquery.history.js"></script>
    <script>
        var origContent = "";

        function loadContent(hash) {
            if (hash != "") {
                if (origContent == "") {
                    origContent = $('#content').html();
                }
                $('#content').load(hash,
                        function () {
                            //prettyPrint();
                        });
            } else if (origContent != "") {
                $('#content').html(origContent);
            }
        }
        $(function () {
            $.history.init(loadContent);
            $('#link a').click(function (e) {
                var url = $(this).attr('href');
                url = url.replace(/^.*#/, '');
                $.history.load(url);
                return false;
            });
        })
    </script>
</head>
<body>
<div>
    <ul id="link">
        <li><a href="g.html">google</a></li>
        <li><a href="b.html">baidu</a></li>
    </ul>
</div>
<div id="content" style="clear:both"></div>
</body>
</html>