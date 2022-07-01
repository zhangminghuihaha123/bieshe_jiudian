function index01() {
       var img=document.createElement("img");
       img.src="/static/img/index/b.jpg";
       img.width="150";
       img.height="150";
       var myp=document.getElementById('indexdiv03');
       myp.appendChild(img);
}

function index02() {
       $.ajax({
              url: "/index_panduan_name",
              type: "POST",
              async: false,
              data: {"name":$("#username").val()},
              success: function (data) {
                     if(data==='用户名存在!'){
                            $("#indexspan01").css("color","green");
                            $("#indexspan01").html(data);
                     }else {
                            $("#indexspan01").css("color","red");
                            $("#indexspan01").html(data);
                     }
              }
       })
}

function index03() {
       $.ajax({
              url: "/index_panduan_password",
              type: "POST",
              async: false,
              data: {"name":$("#username").val(),"password":$("#password").val()},
              success: function (data) {
                     if(data==='密码正确！'){
                            $("#indexspan02").css("color","green");
                            $("#indexspan02").html(data);
                     }else {
                            $("#indexspan02").css("color","red");
                            $("#indexspan02").html(data);
                     }
              }
       })
}


function index04() {
       $.ajax({
              url:"/index_panding",
              type: "POST",
              async: false,
              data: {"name":$("#username").val(),"password":$("#password").val()},
              success: function (data) {
                     if(data==='登录成功！'){
                        alert(data);
                        window.location.href="/shouye";
                     }else {
                        alert("失败，原因是"+data);
                     }
              }
       })
}