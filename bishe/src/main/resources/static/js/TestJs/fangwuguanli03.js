function ym(data) {
   if(data.value!==undefined){
      $.ajax({
         url: "/getum",
         type: "POST",
         async: false,
         data: {"user":data.value,"room":data.name},
         success: function (datas) {
            $("#fwpp01").html('用户:'+datas[0]);
            $("#fwpp02").html('住房号:'+datas[1]);
            $("#fwpp03").html('身份证号:'+datas[2]);
            $("#fwpp04").html('绑定手机号:'+datas[3]);
            $("#fwpp05").html('住房起始时间:'+datas[4]);
            $("#fwpp06").html('住房终止时间:'+datas[5]);
         }
      })
      var b=-1000;
      var id=setInterval(function () {
         if($("#fwdiv01").css("top")==200+"px"){
            clearInterval(id);
         }else {
            b+=50;
            $("#fwdiv01").css("top",b+"px");
         }
      },30);
   }
}

function up() {
   var b=200;
   var id=setInterval(function () {
      if($("#fwdiv01").css("top")==-1000+"px"){
         clearInterval(id);
      }else {
         b-=50;
         $("#fwdiv01").css("top",b+"px");
      }
   },30);
}

function tfqc() {
       $.ajax({
          url: "/qqc",
          type: "POST",
          async: false,
          success: function () {
            alert("清除成功!");
          }
       })
}

function tf01() {
   $('#tfdiv04').css("display","block");
   $('#tfdiv05').css("display","none");
}
function tf02() {
   $('#tfdiv04').css("display","none");
   $('#tfdiv05').css("display","block");
}

function stf01() {
    var room=$("#tfselect01").find('option:selected').text();
    $.ajax({
       url: "/toqqc",
       type: "POST",
       async: false,
       data: {"roomnum":room},
       success: function (data) {
           $("#tftd01").html(data[0]);
          $("#tftd02").html(data[1]);
          $("#tftd03").html(data[2]);
       }
    })
}

function sqtf() {
   var room=$("#tfselect01").find('option:selected').text();
   $.ajax({
      url: "/toqqcclear",
      type: "POST",
      async: false,
      data: {"roomnum":room},
      success: function () {
         alert("清除成功!");
      }
   })
}

function rzchangge() {
    var num=$("#rzselect01").find('option:selected').text();
    $.ajax({
       url: "/tohuoqua",
       type: "POST",
       async: false,
       data: {"room":num},
       success: function (data) {
          var opts;
             for (var i=0;i<data.length;i++){
                opts += "<option>"+data[i]+"</option>";
             }
          $("#rzselect02").html("");
          $("#rzselect02").append(opts);
       }
    })
}

function rztoget() {
   var name=$("#rzinput01").val();
   var sex=$("#rzinput02").val();
   var number=$("#rzinput03").val();
   var phone=$("#rzinput04").val();
   var roomstyle=$("#rzselect01").find('option:selected').text();
   var room=$("#rzselect02").find('option:selected').text();
   var start=$("#rzinput05").val();
   var end=$("#rzinput06").val();
   $.ajax({
      url: "toinRooms",
      async: false,
      type: "POST",
      data: {"name":name,"sex":sex,"number":number,"phone":phone,"roomstyle":roomstyle,"room":room,"start":start,"end":end},
      success: function () {
        alert("操作成功");
      }
   })
}