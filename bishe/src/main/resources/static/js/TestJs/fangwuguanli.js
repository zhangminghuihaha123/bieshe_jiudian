function fwgl01() {
    $("#fwgldiv09").css("background","blue");
}
function fwgl02() {
    $("#fwgldiv09").css("background","black");
}
function fwgl03() {
    $("#fwgldiv10").css("background","blue");
}
function fwgl04() {
    $("#fwgldiv10").css("background","black");
}
function fwgl05() {
    $("#fwgldiv11").css("background","blue");
}
function fwgl06() {
    $("#fwgldiv11").css("background","black");
}
function fwgl09() {
    $("#fwgldiv13").css("background","blue");
}
function fwgl10() {
    $("#fwgldiv13").css("background","black");
}
function fwgl11() {
    $("#fwgldiv14").css("background","blue");
}
function fwgl20() {
    $("#fwgldiv20").css("background","blue");
}
function fwgl23() {
    $("#fwgldiv30").css("background","blue");
}
function fwgl12() {
    $("#fwgldiv14").css("background","black");
}
function fwgl21() {
    $("#fwgldiv20").css("background","black");
}
function fwgl24() {
    $("#fwgldiv30").css("background","black");
}
function fwgl07() {
  window.location.href="/index";
}
function fwgl08() {
    window.location.href="/guanlicenter_index";
}
function fwgl13() {
    $("#ftydiv01").css("display","block");
    $("#fjpzdiv01").css("display","none");
    $("#fxxgdiv01").css("display","none");
    $("#tfdiv01").css("display","none");
    $("#rzxfdiv").css("display","none");
    $("#fwglp01").html("房态");
}
function fwgl14() {
    $("#ftydiv01").css("display","none");
    $("#fjpzdiv01").css("display","block");
    $("#fxxgdiv01").css("display","none");
    $("#tfdiv01").css("display","none");
    $("#rzxfdiv").css("display","none");
    $("#fwglp01").html("房间配置");
}
function fwgl15() {
    $.ajax({
        url:"/fangjianpeizhi",
        type: "POST",
        async: false,
        data: {"lx01":$("#fwselect01").find("option:selected").text(),"lx02":$("#fwselect02").find("option:selected").text(),"lx03":$("#fwselect03").find("option:selected").text(),"lx04":$("#fwselect04").find("option:selected").text(),"lx05":$("#fwselect05").find("option:selected").text(),"lx06":$("#fwselect06").find("option:selected").text(),"lx07":$("#fwselect07").find("option:selected").text(),"lx08":$("#fwselect08").find("option:selected").text(),"lx09":$("#fwselect09").find("option:selected").text(),"lx10":$("#fwselect10").find("option:selected").text(),
            "lx11":$("#fwselect11").find("option:selected").text(),"lx12":$("#fwselect12").find("option:selected").text(),"lx13":$("#fwselect13").find("option:selected").text(),"lx14":$("#fwselect14").find("option:selected").text(),"lx15":$("#fwselect15").find("option:selected").text(),"lx16":$("#fwselect16").find("option:selected").text(),"lx17":$("#fwselect17").find("option:selected").text(),"lx18":$("#fwselect18").find("option:selected").text(),"lx19":$("#fwselect19").find("option:selected").text(),"lx20":$("#fwselect20").find("option:selected").text(),
            "lx21":$("#fwselect21").find("option:selected").text(),"lx22":$("#fwselect22").find("option:selected").text(),"lx23":$("#fwselect23").find("option:selected").text(),"lx24":$("#fwselect24").find("option:selected").text(),"lx25":$("#fwselect25").find("option:selected").text(),"lx26":$("#fwselect26").find("option:selected").text(),"lx27":$("#fwselect27").find("option:selected").text(),"lx28":$("#fwselect28").find("option:selected").text(),"lx29":$("#fwselect29").find("option:selected").text(),"lx30":$("#fwselect30").find("option:selected").text(),
            "lx31":$("#fwselect31").find("option:selected").text(),"lx32":$("#fwselect32").find("option:selected").text(),"lx33":$("#fwselect33").find("option:selected").text(),"lx34":$("#fwselect34").find("option:selected").text(),"lx35":$("#fwselect35").find("option:selected").text(),"lx36":$("#fwselect36").find("option:selected").text(),"lx37":$("#fwselect37").find("option:selected").text(),"lx38":$("#fwselect38").find("option:selected").text(),"lx39":$("#fwselect39").find("option:selected").text(),"lx40":$("#fwselect40").find("option:selected").text()},
        success: function (data) {
          alert(data);
        }
    })
}
function fwgl16() {
    $.ajax({
        url:"/qingkongshuju",
        type: "POST",
        async: false,
        success: function () {
            alert("清除成功!");
        }
    })
}

function fwgl17(){
    $("#ftydiv01").css("display","none");
    $("#fjpzdiv01").css("display","none");
    $("#fxxgdiv01").css("display","block");
    $("#tfdiv01").css("display","none");
    $("#rzxfdiv").css("display","none");
    $("#fwglp01").html("房型修改");
}

function fwgl22(){
    $("#ftydiv01").css("display","none");
    $("#fjpzdiv01").css("display","none");
    $("#fxxgdiv01").css("display","none");
    $("#tfdiv01").css("display","block");
    $("#rzxfdiv").css("display","none");
    $("#fwglp01").html("退房");
}

function fwgl25(){
    $("#ftydiv01").css("display","none");
    $("#fjpzdiv01").css("display","none");
    $("#fxxgdiv01").css("display","none");
    $("#tfdiv01").css("display","none");
    $("#rzxfdiv").css("display","block");
    $("#fwglp01").html("入住/续费");
}


window.onload=function () {
    var name='';  var room='';  var list='';
    $.ajax({
        url: "/goumaixinxi",
        type: "POST",
        async: false,
        success: function (data) {
           list=data;
        }
    })
    for(var k=0;k<$(".status").length;k++){
        if($(".status").eq(k).html()==='未到期'){
            $(".status").eq(k).css("color","green");
        }else {
            $(".status").eq(k).css("color","red");
        }
    }
    $("#fwp01").html(list.length/2);
    $("#fwp02").html("住房率: "+(list.length/2)*100/40+"%");
    for(var i=0;i<list.length;i+=2){
       room=list[i];
       name=list[i+1];
       switch (room) {
           case 101:
               $("#ftdiv01").css("background","red");
               $("#fwimg01").css("display","block");
               $("#fwglspan01").html(name);
               document.getElementById("ftdiv01").value=name;document.getElementById("ftdiv01").name=room;
               break;
           case 102:
               $("#ftdiv02").css("background","red");
               $("#fwimg02").css("display","block");
               $("#fwglspan02").html(name);
               document.getElementById("ftdiv02").value=name;document.getElementById("ftdiv02").name=room;
               break;
           case 103:
               $("#ftdiv03").css("background","red");
               $("#fwimg03").css("display","block");
               $("#fwglspan03").html(name);
               document.getElementById("ftdiv03").value=name;document.getElementById("ftdiv03").name=room;
               break;
           case 104:
               $("#ftdiv04").css("background","red");
               $("#fwimg04").css("display","block");
               $("#fwglspan04").html(name);
               document.getElementById("ftdiv04").value=name;document.getElementById("ftdiv04").name=room;
               break;
           case 105:
               $("#ftdiv05").css("background","red");
               $("#fwimg05").css("display","block");
               $("#fwglspan05").html(name);document.getElementById("ftdiv05").value=name;document.getElementById("ftdiv05").name=room;break;
           case 106:
               $("#ftdiv06").css("background","red");
               $("#fwimg06").css("display","block");
               $("#fwglspan06").html(name);document.getElementById("ftdiv06").value=name;document.getElementById("ftdiv06").name=room;break;
           case 107:
               $("#ftdiv07").css("background","red");
               $("#fwimg07").css("display","block");
               $("#fwglspan07").html(name);document.getElementById("ftdiv07").value=name;document.getElementById("ftdiv07").name=room;break;
           case 108:
               $("#ftdiv08").css("background","red");
               $("#fwimg08").css("display","block");
               $("#fwglspan08").html(name);document.getElementById("ftdiv08").value=name;document.getElementById("ftdiv08").name=room;break;
           case 109:
               $("#ftdiv09").css("background","red");
               $("#fwimg09").css("display","block");
               $("#fwglspan09").html(name);document.getElementById("ftdiv09").value=name;document.getElementById("ftdiv09").name=room;break;
           case 110:
               $("#ftdiv10").css("background","red");
               $("#fwimg10").css("display","block");
               $("#fwglspan10").html(name);document.getElementById("ftdiv10").value=name;document.getElementById("ftdiv10").name=room;break;
           case 201:
               $("#ftdiv11").css("background","red");
               $("#fwimg11").css("display","block");
               $("#fwglspan11").html(name);document.getElementById("ftdiv11").value=name;document.getElementById("ftdiv11").name=room;break;
           case 202:
               $("#ftdiv12").css("background","red");
               $("#fwimg12").css("display","block");
               $("#fwglspan12").html(name);document.getElementById("ftdiv12").value=name;document.getElementById("ftdiv12").name=room;break;
           case 203:
               $("#ftdiv13").css("background","red");
               $("#fwimg13").css("display","block");
               $("#fwglspan13").html(name);document.getElementById("ftdiv13").value=name;document.getElementById("ftdiv13").name=room;break;
           case 204:
               $("#ftdiv14").css("background","red");
               $("#fwimg14").css("display","block");
               $("#fwglspan14").html(name);document.getElementById("ftdiv14").value=name;document.getElementById("ftdiv14").name=room;break;
           case 205:
               $("#ftdiv15").css("background","red");
               $("#fwimg15").css("display","block");
               $("#fwglspan15").html(name);document.getElementById("ftdiv15").value=name;document.getElementById("ftdiv15").name=room;break;
           case 206:
               $("#ftdiv16").css("background","red");
               $("#fwimg16").css("display","block");
               $("#fwglspan16").html(name);document.getElementById("ftdiv16").value=name;document.getElementById("ftdiv16").name=room;break;
           case 207:
               $("#ftdiv17").css("background","red");
               $("#fwimg17").css("display","block");
               $("#fwglspan17").html(name);document.getElementById("ftdiv17").value=name;document.getElementById("ftdiv17").name=room;break;
           case 208:
               $("#ftdiv18").css("background","red");
               $("#fwimg18").css("display","block");
               $("#fwglspan18").html(name);document.getElementById("ftdiv18").value=name;document.getElementById("ftdiv18").name=room;break;
           case 209:
               $("#ftdiv19").css("background","red");
               $("#fwimg19").css("display","block");
               $("#fwglspan19").html(name);document.getElementById("ftdiv19").value=name;document.getElementById("ftdiv19").name=room;break;
           case 210:
               $("#ftdiv20").css("background","red");
               $("#fwimg20").css("display","block");
               $("#fwglspan20").html(name);document.getElementById("ftdiv20").value=name;document.getElementById("ftdiv20").name=room;break;
           case 301:
               $("#ftdiv21").css("background","red");
               $("#fwimg21").css("display","block");
               $("#fwglspan21").html(name);document.getElementById("ftdiv21").value=name;document.getElementById("ftdiv21").name=room;break;
           case 302:
               $("#ftdiv22").css("background","red");
               $("#fwimg22").css("display","block");
               $("#fwglspan22").html(name);document.getElementById("ftdiv22").value=name;document.getElementById("ftdiv22").name=room;break;
           case 303:
               $("#ftdiv23").css("background","red");
               $("#fwimg23").css("display","block");
               $("#fwglspan23").html(name);document.getElementById("ftdiv23").value=name;document.getElementById("ftdiv23").name=room;break;
           case 304:
               $("#ftdiv24").css("background","red");
               $("#fwimg24").css("display","block");
               $("#fwglspan24").html(name);document.getElementById("ftdiv24").value=name;document.getElementById("ftdiv24").name=room;break;
           case 305:
               $("#ftdiv25").css("background","red");
               $("#fwimg25").css("display","block");
               $("#fwglspan25").html(name);document.getElementById("ftdiv25").value=name;document.getElementById("ftdiv25").name=room;break;
           case 306:
               $("#ftdiv26").css("background","red");
               $("#fwimg26").css("display","block");
               $("#fwglspan26").html(name);document.getElementById("ftdiv26").value=name;document.getElementById("ftdiv26").name=room;break;
           case 307:
               $("#ftdiv27").css("background","red");
               $("#fwimg27").css("display","block");
               $("#fwglspan27").html(name);document.getElementById("ftdiv27").value=name;document.getElementById("ftdiv27").name=room;break;
           case 308:
               $("#ftdiv28").css("background","red");
               $("#fwimg28").css("display","block");
               $("#fwglspan28").html(name);document.getElementById("ftdiv28").value=name;document.getElementById("ftdiv28").name=room;break;
           case 309:
               $("#ftdiv29").css("background","red");
               $("#fwimg29").css("display","block");
               $("#fwglspan29").html(name);document.getElementById("ftdiv29").value=name;document.getElementById("ftdiv29").name=room;break;
           case 310:
               $("#ftdiv30").css("background","red");
               $("#fwimg30").css("display","block");
               $("#fwglspan30").html(name);document.getElementById("ftdiv30").value=name;document.getElementById("ftdiv30").name=room;break;
           case 401:
               $("#ftdiv31").css("background","red");
               $("#fwimg31").css("display","block");
               $("#fwglspan31").html(name);document.getElementById("ftdiv31").value=name;document.getElementById("ftdiv31").name=room;break;
           case 402:
               $("#ftdiv32").css("background","red");
               $("#fwimg32").css("display","block");
               $("#fwglspan32").html(name);document.getElementById("ftdiv32").value=name;document.getElementById("ftdiv32").name=room;break;
           case 403:
               $("#ftdiv33").css("background","red");
               $("#fwimg33").css("display","block");
               $("#fwglspan33").html(name);document.getElementById("ftdiv33").value=name;document.getElementById("ftdiv33").name=room;break;
           case 404:
               $("#ftdiv34").css("background","red");
               $("#fwimg34").css("display","block");
               $("#fwglspan34").html(name);document.getElementById("ftdiv34").value=name;document.getElementById("ftdiv34").name=room;break;
           case 405:
               $("#ftdiv35").css("background","red");
               $("#fwimg35").css("display","block");
               $("#fwglspan35").html(name);document.getElementById("ftdiv35").value=name;document.getElementById("ftdiv35").name=room;break;
           case 406:
               $("#ftdiv36").css("background","red");
               $("#fwimg36").css("display","block");
               $("#fwglspan36").html(name);document.getElementById("ftdiv36").value=name;document.getElementById("ftdiv36").name=room;break;
           case 407:
               $("#ftdiv37").css("background","red");
               $("#fwimg37").css("display","block");
               $("#fwglspan37").html(name);document.getElementById("ftdiv37").value=name;document.getElementById("ftdiv37").name=room;break;
           case 408:
               $("#ftdiv38").css("background","red");
               $("#fwimg38").css("display","block");
               $("#fwglspan38").html(name);document.getElementById("ftdiv38").value=name;document.getElementById("ftdiv38").name=room;break;
           case 409:
               $("#ftdiv39").css("background","red");
               $("#fwimg39").css("display","block");
               $("#fwglspan39").html(name);document.getElementById("ftdiv39").value=name;document.getElementById("ftdiv39").name=room;break;
           case 410:
               $("#ftdiv40").css("background","red");
               $("#fwimg40").css("display","block");
               $("#fwglspan40").html(name);document.getElementById("ftdiv40").value=name;document.getElementById("ftdiv40").name=room;break;
       }
    }
}