var options = {
    submitHandler: function (theForm) {
        var params = $(theForm).serialize();
        $.post($.frontPath+"/admin/loginOK", params, function (resultObj) {
            if(resultObj.success){
                window.location.href=$.frontPath+"/admin/main.jsp"
            }else{
                alert(resultObj.result)
            }
        })
        return false;
    }
}
$(function () {
    $("#loginForm").validate(options)
})