function qtyy01() {
  window.location.href="/guanlicenter_index";
}

function qtyy02() {
  $("#qtyyimg07").css("left","-7%");
  $("#qtyyimg07").css("top","-20%");
  $("#qtyyimg07").css("width","5%");
  $("#qtyyimg07").css("height","60%");
  $("#qtyyimg08").css("left","-5%");
  $("#qtyyimg08").css("top","10%");
  $("#qtyyimg08").css("width","5%");
  $("#qtyyimg08").css("height","40%");
  $("#qtyydiv04").css("display","block");
  $("#qtyydiv05").css("display","none");
}

function qtyy03() {
  $("#qtyyimg07").css("left","-5%");
  $("#qtyyimg07").css("top","-10%");
  $("#qtyyimg07").css("width","5%");
  $("#qtyyimg07").css("height","40%");
  $("#qtyyimg08").css("left","-7%");
  $("#qtyyimg08").css("top","0%");
  $("#qtyyimg08").css("width","5%");
  $("#qtyyimg08").css("height","60%");
  $("#qtyydiv04").css("display","none");
  $("#qtyydiv05").css("display","block");
}

function qtyy11() {
  $("#qtyyimg11").css("left","-7%");
  $("#qtyyimg11").css("top","-20%");
  $("#qtyyimg11").css("width","5%");
  $("#qtyyimg11").css("height","60%");
  $("#qtyyimg12").css("left","-5%");
  $("#qtyyimg12").css("top","10%");
  $("#qtyyimg12").css("width","5%");
  $("#qtyyimg12").css("height","40%");
  $("#qtyydiv12").css("display","block");
  $("#qtyydiv13").css("display","none");
}

function qtyy12() {
  $("#qtyyimg11").css("left","-5%");
  $("#qtyyimg11").css("top","-10%");
  $("#qtyyimg11").css("width","5%");
  $("#qtyyimg11").css("height","40%");
  $("#qtyyimg12").css("left","-7%");
  $("#qtyyimg12").css("top","0%");
  $("#qtyyimg12").css("width","5%");
  $("#qtyyimg12").css("height","60%");
  $("#qtyydiv12").css("display","none");
  $("#qtyydiv13").css("display","block");
}

function qtyy17() {
  $("#qtyyimg15").css("left","-7%");
  $("#qtyyimg15").css("top","-20%");
  $("#qtyyimg15").css("width","5%");
  $("#qtyyimg15").css("height","60%");
  $("#qtyyimg16").css("left","-5%");
  $("#qtyyimg16").css("top","10%");
  $("#qtyyimg16").css("width","5%");
  $("#qtyyimg16").css("height","40%");
  $("#qtyydiv14").css("display","block");
  $("#qtyydiv15").css("display","none");
}

function qtyy18() {
  $("#qtyyimg15").css("left","-5%");
  $("#qtyyimg15").css("top","-10%");
  $("#qtyyimg15").css("width","5%");
  $("#qtyyimg15").css("height","40%");
  $("#qtyyimg16").css("left","-7%");
  $("#qtyyimg16").css("top","0%");
  $("#qtyyimg16").css("width","5%");
  $("#qtyyimg16").css("height","60%");
  $("#qtyydiv14").css("display","none");
  $("#qtyydiv15").css("display","block");
}

function qtyy04() {
  $.ajax({
    url: "/image",
    async: false,
    type: "POST",
    data: {"file":$("#file").val(),"roomstyle":$("#roomstyle").val(),"moneys":$("#roommoney").val()},
    success: function (data) {
      if (data==='提交成功'){
        alert(data);
      }else {
        alert("查询失败，可能的原因是:"+data);
      }
    }
  })
}
function qtyy08() {
  $.ajax({
    url: "/updateimage",
    async: false,
    type: "POST",
    data: {"file":$("#files").val(),"roomstyle":$("#roomstyles").val()},
    success: function (data) {
      if (data==='修改成功'){
           alert(data);
      }else {
          alert("查询失败，可能的原因是:"+data);
      }
    }
  })
}
function qtyy09() {
   $.ajax({
     url: "/panduanfang",
     async: false,
     type: "POST",
     data: {"roomstyle":$("#roomstyles").val()},
     success: function (data) {
       if (data==='查询成功'){
         $("#qtyyspan01").html(data);
         $("#qtyyspan01").css("color","green");
       }else {
         $("#qtyyspan01").html(data);
         $("#qtyyspan01").css("color","red");
       }
     }
   })
}

function qtyy16() {
  $.ajax({
    url: "/panduanfood02",
    async: false,
    type: "POST",
    data: {"foodstyle":$("#foodstyles").val()},
    success: function (data) {
      if (data==='查询成功'){
        $("#qtyyspan04").html(data);
        $("#qtyyspan04").css("color","green");
      }else {
        $("#qtyyspan04").html(data);
        $("#qtyyspan04").css("color","red");
      }
    }
  })
}

function qtyy22() {
  $.ajax({
    url: "/panduanfriend02",
    async: false,
    type: "POST",
    data: {"friendname":$("#deletefriend").val()},
    success: function (data) {
      if (data==='查询成功'){
        $("#qtyyspan06").html(data);
        $("#qtyyspan06").css("color","green");
      }else {
        $("#qtyyspan06").html(data);
        $("#qtyyspan06").css("color","red");
      }
    }
  })
}

function qtyy14() {
  $.ajax({
    url: "/panduanfood",
    async: false,
    type: "POST",
    data: {"foodstyle":$("#foodstyle").val()},
    success: function (data) {
      if (data==='可以录入'){
        $("#qtyyspan03").html(data);
        $("#qtyyspan03").css("color","green");
      }else {
        $("#qtyyspan03").html(data);
        $("#qtyyspan03").css("color","red");
      }
    }
  })
}

function qtyy21() {
  $.ajax({
    url: "/panduanfriend",
    async: false,
    type: "POST",
    data: {"friendname":$("#friendname").val()},
    success: function (data) {
      if (data==='可以录入'){
        $("#qtyyspan05").html(data);
        $("#qtyyspan05").css("color","green");
      }else {
        $("#qtyyspan05").html(data);
        $("#qtyyspan05").css("color","red");
      }
    }
  })
}

function qtyy10() {
  $.ajax({
    url: "/panduanfang02",
    async: false,
    type: "POST",
    data: {"roomstyle":$("#roomstyle").val()},
    success: function (data) {
      if (data==='可以录入'){
        $("#qtyyspan02").html(data);
        $("#qtyyspan02").css("color","green");
      }else {
        $("#qtyyspan02").html(data);
        $("#qtyyspan02").css("color","red");
      }
    }
  })
}

function qtyy13() {
  $.ajax({
    url: "/foodin",
    async: false,
    type: "POST",
    data: {"file":$("#filess").val(),"foodstyle":$("#foodstyle").val(),"foodmoney":$("#foodmoney").val()},
    success: function (data) {
      if (data==='提交成功'){
        alert(data);
      }else {
        alert("插入失败，可能的原因是:"+data);
      }
    }
  })
}

function qtyy19() {
  $.ajax({
    url: "/friendin",
    async: false,
    type: "POST",
    data: {"file":$("#filee").val(),"friendstyle":$("#friendname").val(),"friendmoney":$("#friendmoney").val()},
    success: function (data) {
      if (data==='提交成功'){
        alert(data);
      }else {
        alert("插入失败，可能的原因是:"+data);
      }
    }
  })
}

function qtyy15() {
  $.ajax({
    url: "/foodupdate",
    async: false,
    type: "POST",
    data: {"file":$("#filesss").val(),"foodstyle":$("#foodstyles").val()},
    success: function (data) {
      if (data==='修改成功'){
        alert(data);
      }else {
        alert("修改失败，可能的原因是:"+data);
      }
    }
  })
}

function qtyy20() {
  $.ajax({
    url: "/frienddelete",
    async: false,
    type: "POST",
    data: {"friendname":$("#deletefriend").val()},
    success: function (data) {
      if (data==='删除成功'){
        alert(data);
      }else {
        alert("修改失败，可能的原因是:"+data);
      }
    }
  })
}

function changepic() {
  var reads= new FileReader();
  f=document.getElementById('file').files[0];
  reads.readAsDataURL(f);
  reads.onload=function (e) {
    document.getElementById('qtyyimg06').src=this.result;
  };
}
function changepic2() {
  var reads= new FileReader();
  f=document.getElementById('files').files[0];
  reads.readAsDataURL(f);
  reads.onload=function (e) {
    document.getElementById('qtyyimg09').src=this.result;
  };
}
function changepic3() {
  var reads= new FileReader();
  f=document.getElementById('filess').files[0];
  reads.readAsDataURL(f);
  reads.onload=function (e) {
    document.getElementById('qtyyimg13').src=this.result;
  };
}
function changepic4() {
  var reads= new FileReader();
  f=document.getElementById('filesss').files[0];
  reads.readAsDataURL(f);
  reads.onload=function (e) {
    document.getElementById('qtyyimg14').src=this.result;
  };
}
function changepic5() {
  var reads= new FileReader();
  f=document.getElementById('filee').files[0];
  reads.readAsDataURL(f);
  reads.onload=function (e) {
    document.getElementById('qtyyimg17').src=this.result;
  };
}

function qtyy05() {
   $("#qtyyimg03").css("opacity","1.0");
  $("#qtyyimg04").css("opacity","0.3");
  $("#qtyyimg05").css("opacity","0.3");
  $("#spxx").css("display","none");
  $("#fjpz").css("display","block");
  $("#hzhb").css("display","none");
}
function qtyy06() {
  $("#qtyyimg03").css("opacity","0.3");
  $("#qtyyimg04").css("opacity","1.0");
  $("#qtyyimg05").css("opacity","0.3");
  $("#spxx").css("display","block");
  $("#fjpz").css("display","none");
  $("#hzhb").css("display","none");
}
function qtyy07() {
  $("#qtyyimg03").css("opacity","0.3");
  $("#qtyyimg04").css("opacity","0.3");
  $("#qtyyimg05").css("opacity","1.0");
  $("#spxx").css("display","none");
  $("#fjpz").css("display","none");
  $("#hzhb").css("display","block");
}