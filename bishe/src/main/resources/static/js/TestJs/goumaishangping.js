window.onload=function () {
     var sizes=$(".spdivs").length;
     $("#spdiv02").css("height",(30+sizes*250)+"px");
}

function spgm01(data) {
     var n=$(".spbs").index(data);
     var num=$(".spselects").eq(n).val();
     var food=$(".spspans01").eq(n).html().slice(4,$(".spspans01").eq(n).html().length);
     var user=$("#uiuser").html().slice(7,$("#uiuser").html().length);
     $.ajax({
          url: "toPayFood",
          type: "POST",
          async: false,
          data: {"food":food,"num":num,"user":user},
          success: function (data) {
               alert(data);
          }
     })
}