function gmy01() {
  window.location.href="/shouye";
}
function gmy02() {
  var b=-1000;
  var id=setInterval(function () {
    if($("#gmydiv05").css("top")==200+"px"){
      clearInterval(id);
    }else {
      b+=50;
      $("#gmydiv05").css("top",b+"px");
    }
  },30);
}

function gmy03() {
  var b=200;
  var id=setInterval(function () {
    if($("#gmydiv05").css("top")==-1000+"px"){
      clearInterval(id);
    }else {
      b-=50;
      $("#gmydiv05").css("top",b+"px");
    }
  },30);
  alert("支付已取消");
}

function gmy04(data) {
    $.ajax({
      url: "/topay",
      type: "POST",
      async: false,
      data: {"yhk":$("#gmyinput01").val(),"password":$("#gmyinput02").val(),"roomstyle":$("#gmyp01").html(),"user":data.value,"start":$("#gmyspan08").html(),"end":$("#gmyspan09").html()},
      success: function (data) {
         alert(data);
         if((data!=='账号或密码不能为空!')&&(data!=='该银行卡不存在，请重新输入')&&(data!=='银行卡余额不足，无法交易')&&(data!=='密码错误!')){
           window.location.href="/qtfw";
         }
      }
    })
}