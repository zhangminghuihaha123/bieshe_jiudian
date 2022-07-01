function zhuce01() {
    alert("请在两分钟之内完成注册!");
    $.ajax({
       url: "/scyzm",
       type: "POST",
        async: false,
       success: function (data) {
           $("#zhucep01").html(data);
       }
    })
}

function zhuce02() {
    if($("#age").val().length!==18){
        alert("身份证格式不正确!");
    }else {
        $.ajax({
            url: "/tozhuce",
            type: "POST",
            async: false,
            data: {"name":$("#username").val(),"password":$("#password").val(),"sex":$("input[type=radio][name=sex]:checked").val(),"age":$("#age").val(),"phonenumber":$("#phonenumber").val(),"yzm":$("#yzm").val()},
            success: function (data) {
                if(data==='注册成功！'){
                    alert(data+"正在前往登录界面");
                    window.location.href="/index";
                }else {
                    alert("注册失败！原因可能是"+data);
                }
            },
            error: function (data) {
                alert("注册失败！原因可能是"+data);
            }
        })
    }
}

function zhuce03() {
    $.ajax({
        url:"/zhucereturnname",
        type: "POST",
        async: false,
        data: {"name":$("#username").val()},
        success: function (data) {
            if(data==='可以注册!'){
                $("#zhucespan01").css("color","green");
                $("#zhucespan01").html(data);
            }else {
                $("#zhucespan01").css("color","red");
                $("#zhucespan01").html(data);
            }
        }
    })
}
