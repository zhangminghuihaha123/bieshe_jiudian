function glydl01() {
   $("#glydlspan01").html("此处填写密码");
   $("#glydlspan01").css("color","red");
}

function glydl02() {
    $.ajax({
       url:"/Admin_panduan",
       type: "POST",
       async: false,
        data: {"name":$("#name").val(),"password":$("#password").val()},
        success: function (data) {
               if(data.toString()==='恭喜你！登陆成功!'){
                   alert(data);
                   window.location.href="/guanlicenter_index";
               }else {
                   alert("失败原因："+data);
               }
        }
    })
}

function glydl03() {
     $.ajax({
         url: "/Admin_panduan_name",
         type: "POST",
         async: false,
         data: {"name":$("#name").val()},
         success: function (data) {
             if(data.toString()==='用户名正确！'){
                 $("#glydlspan02").html(data);
                 $("#glydlspan02").css("color","green");
             }else {
                 $("#glydlspan02").html(data);
                 $("#glydlspan02").css("color","red");
             }
         }
     })
}

function glydl04() {
    $.ajax({
        url:"/Admin_panduan_password",
        type: "POST",
        async: false,
        data: {"name":$("#name").val(),"password":$("#password").val()},
        success: function (data) {
              if(data.toString()==='密码正确!'){
                  $("#glydlspan01").html(data);
                  $("#glydlspan01").css("color","green");
              }else {
                  $("#glydlspan01").html(data);
                  $("#glydlspan01").css("color","red");
              }
        }
    })
}