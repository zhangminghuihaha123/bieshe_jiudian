window.onload=function () {
    var num=$("#uip01").html().slice(3,$("#uip01").html().length-1);
    $("#uidiv02").css("height",(50+num*240)+"px");
    $("#uidiv04").css("top",(100+num*240)+"px");
    $("#uidiv05").css("top",(130+num*240)+"px");
}

function pd(data) {
    var time=new Date(data.value);
    var now=new Date();
    if(time>now){
        var room=data.name;
        $.ajax({
            url: "th01",
            type: "POST",
            async: false,
            data: {"roomnum":room,"starttime":data.value,"roomuser":$("#uiuser").html().slice(7,$("#uiuser").html().length)},
            success: function () {
               alert("退款成功!");
            }
        })
    }else {
        alert("您不能退款，原因为起始时间已过退款时间");
    }
}

function cent() {
   var name=$("#uiuser").html().slice(7,$("#uiuser").html().length);
   var room=$("#uiselect01").find("option:selected").text();
   var call=$("#uitext").val();
   $.ajax({
       url: "/tousercall",
       type: "POST",
       async: false,
       data: {"name":name,"room":room,"call":call},
       success: function () {
          alert("信息发送成功");
       }
   })
}