window.onload=function () {
   var fjnum=$("#yxa01").html();
   var wpnum=$("#yxa02").html();
   $("#yxdiv02").css("height",((((fjnum)*200)/0.85)+(((wpnum)*200)/0.85))+"px");
   $("#yxdiv04").css("top",((fjnum)*200)+200+"px");
}

function tofangjian(data) {
    var n=$(".yxbs").index(data);
    var money=$(".yxinputs").eq(n).val();
    var room=$(".fjps01").eq(n).html();
    $.ajax({
       url: "xiugairoom",
       type: "POST",
       async: false,
       data: {"room":room,"money":money},
       success: function () {
          alert("操作成功!");
       }
    })
}

function towuping(data) {
    var n=$(".wpbs").index(data);
    var money=$(".wpinputs").eq(n).val();
    var food=$(".wpps01").eq(n).html();
    $.ajax({
        url: "xiugaifood",
        type: "POST",
        async: false,
        data: {"food":food,"money":money},
        success: function () {
            alert("操作成功!");
        }
    })
}