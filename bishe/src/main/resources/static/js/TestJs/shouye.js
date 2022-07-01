function sy01() {
    $("#sydiv03").css("background","rgba(85,83,83,0.31)");
    window.location.href="/index";
}
function sy31() {
    $("#sydiv05").css("background","rgba(85,83,83,0.31)");
    $.ajax({
        url: "gituser",
        type: "POST",
        async: false,
        data: {"user":$("#syp05").html().slice(7,$("#syp05").html().length)}
    })
    window.location.href="/qtfw";
}
function sy11() {
    $("#sydiv03").css("background","rgba(85,83,83,0.31)");
}
function sy33() {
    $("#sydiv05").css("background","rgba(85,83,83,0.31)");
}
function sy09() {
    $("#sydiv04").css("background","rgba(85,83,83,0.31)");
}
function sy12() {
    $("#sydiv04").css("background","rgba(85,83,83,0.31)");
}
function sy03() {
    window.location.href="/index";
}
function sy02() {
    $("#sydiv03").css("background","#ffffff");
}
function sy32() {
    $("#sydiv05").css("background","#ffffff");
}
function sy10() {
    $("#sydiv04").css("background","#ffffff");
}
window.onload=function () {
    if($("#syo01").val()==='欢迎当前用户:null'){
        $("#syb01").css("display","block");
        $("#syb02").css("display","block");
        $("#syp05").css("display","none");
        $("#syspan01").html("(请先进行登录)");
    }else {
        $("#syb01").css("display","none");
        $("#syb02").css("display","none");
        $("#syp05").css("display","block");
    }
    var num=$(".fjs").length;;
    $("#sygg").css("top",(1000+217*num)+"px");
    $("body").css("height",(1320+217*num)+"px")
}
function sy04() {
    var a=2000;
      if ($("#syo01").val()!=='欢迎当前用户:null'){
          var id=setInterval(function () {
              if($("#sydiv08").css("left")==600+"px"){
                  clearInterval(id);
              }else {
                  a-=50;
                  $("#sydiv08").css("left",a+"px");
              }
          },30);
      }
}

function sy05() {
    var b=600;
    var id=setInterval(function () {
        if($("#sydiv08").css("left")==2000+"px"){
            clearInterval(id);
        }else {
            b+=50;
            $("#sydiv08").css("left",b+"px");
        }
    },30);
}

function sy06() {
     window.location.href="/index";
}
function sy07() {
    window.location.href="/zhuce";
}

function changepics() {
    var reads= new FileReader();
    f=document.getElementById('input01').files[0];
    reads.readAsDataURL(f);
    reads.onload=function (e) {
        document.getElementById('syimg07').src=this.result;
    };
}

function sy08() {
    sy05();
    $.ajax({
        url: "/syimage",
        async: false,
        type: "POST",
        data: {"file":$("#input01").val()},
        success: function () {
                alert('提交成功');
        }
    })
}

function yd(data) {
   var rooms=data.value;
   var users=(data.id).slice(7,data.id.length);
   var start=$("#date01").val();
   var end=$("#date02").val();
   if(end>start){
       if(users!="null"){
           $.ajax({
               url: "/usertobuy",
               type: "POST",
               async: false,
               data: {"roomstyle":rooms,"user":users,"start":start,"end":end},
               success: function () {
                   window.location.href="/userinbuy";
               }
           })
       }else{
           alert("请先登录！");
           window.location.href="/index";
       }
   }else {
       alert("请查看您的时间是否正确!");
   }
}

function qtfw() {
    var userlenth=$("#syp05").html().length;
    var user=$("#syp05").html().slice(7,userlenth);
    $.ajax({
        url: "gituser",
        type: "POST",
        async: false,
        data: {"user":$("#syp05").html().slice(7,userlenth)}
    })
    if(user===''||user===null){
        alert("请先登录!");
    }else {
        $.ajax({
            url: "getRoomsArd",
            type: "POST",
            async: false,
            data: {"user":user},
            success: function (data) {
                 if(data===null||data===''){
                     alert("您没有购买房间，无法进入");
                 }else {
                     window.location.href="/qtfw";
                 }
            }
        })
    }
}

function gmsp() {
    var userlenth=$("#syp05").html().length;
    var user=$("#syp05").html().slice(7,userlenth);
    $.ajax({
        url: "gituser",
        type: "POST",
        async: false,
        data: {"user":$("#syp05").html().slice(7,userlenth)}
    })
    if(user===''||user===null){
        alert("请先登录!");
    }else {
        $.ajax({
            url: "getRoomsArd",
            type: "POST",
            async: false,
            data: {"user":user},
            success: function (data) {
                if(data===null||data===''){
                    alert("您没有购买房间，无法进入");
                }else {
                    window.location.href="/gmsp";
                }
            }
        })
    }
}

function lypl() {
    var userlenth=$("#syp05").html().length;
    var user=$("#syp05").html().slice(7,userlenth);
    $.ajax({
        url: "gituser",
        type: "POST",
        async: false,
        data: {"user":$("#syp05").html().slice(7,userlenth)}
    })
    if(user===''||user===null){
        alert("请先登录!");
    }else {
        $.ajax({
            url: "getRoomsArd",
            type: "POST",
            async: false,
            data: {"user":user},
            success: function (data) {
                if(data===null||data===''){
                    alert("您没有购买房间，无法进入");
                }else {
                    window.location.href="/lypl";
                }
            }
        })
    }
}