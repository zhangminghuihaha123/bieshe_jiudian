var page=0;
var page2=0;

function scxx(data) {
   var room=data.value;
   var n=$(".xxbs").index(data);
   var message=$(".xxp03").eq(n).html().slice(5,$(".xxp03").eq(n).html().length);
   $.ajax({
       url: "/toscxx",
       type: "POST",
       async: false,
       data: {"room":room,"message":message},
       success: function () {
           alert("删除成功！");
           window.location.href="/xxy";
       }
   })
}

function xx01() {
   $("#yhxx").css("display","block");
   $("#yhrz").css("display","none");
   $("#xtrz").css("display","none");
}
function xx02() {
    $("#yhxx").css("display","none");
    $("#yhrz").css("display","block");
    $("#xtrz").css("display","none");
}
function xx03() {
    $("#yhxx").css("display","none");
    $("#yhrz").css("display","none");
    $("#xtrz").css("display","block");
}

function xx04() {
    var item;
    $.ajax({
        url: "/xxys",
        type: "POST",
        async: false,
        data: {"user":$("#xxinput01").val()},
        success: function (data) {
            $.each(data, function (i,result) {
                item +="<tr>"+
                    "<td>"+result['username']+"</td>"+
                    "<td>"+result['roomnum']+"</td>"+
                    "<td>"+result['cost']+"</td>"+
                    "<td>"+result['starttime']+"</td>"+
                    "<td>"+result['endtime']+"</td>"+
                    "</tr>";
            })
            $(".xxt01").html("<th>用户名</th><th>房间号</th><th>花费</th><th>入住时间</th><th>截至时间</th>");
            $(".xxt01").append(item);
        }
    })
}


function xx05() {
    var item;
    $.ajax({
        url: "/xxys2",
        type: "POST",
        async: false,
        data: {"status":$("#xxinput02").val()},
        success: function (data) {
            $.each(data, function (i,result) {
                item +="<tr>"+
                    "<td>"+result['status']+"</td>"+
                    "<td>"+result['message']+"</td>"+
                    "<td>"+result['event']+"</td>"+
                    "<td>"+result['time']+"</td>"+
                    "</tr>";
            })
            $(".xxt02").html("<th>状态号</th><th>方法信息</th><th>状态Common/Null/error</th><th>方法时间</th>");
            $(".xxt02").append(item);
        }
    })
}

function todown() {
    page++;
    var number=$("#xxspan01").html().slice(1,$("#xxspan01").html().length-1);
    if(page==number){
        page=page-1;
    }
    $("#xxspan03").html("第"+(page+1)+"页");
    var item;
    $.ajax({
        url: "/xxysdown",
        type: "POST",
        async: false,
        data: {"num":page,"user":$("#xxinput01").val()},
        success: function (data) {
            $.each(data, function (i,result) {
                item +="<tr>"+
                    "<td>"+result['username']+"</td>"+
                    "<td>"+result['roomnum']+"</td>"+
                    "<td>"+result['cost']+"</td>"+
                    "<td>"+result['starttime']+"</td>"+
                    "<td>"+result['endtime']+"</td>"+
                    "</tr>";
            })
            $(".xxt01").html("<th>用户名</th><th>房间号</th><th>花费</th><th>入住时间</th><th>截至时间</th>");
            $(".xxt01").append(item);
        }
    })
}

function toup() {
    page--;
    if (page<0){
        page=0;
    }
    $("#xxspan03").html("第"+(page+1)+"页");
    var item;
    $.ajax({
        url: "/xxysup",
        type: "POST",
        async: false,
        data: {"num":page,"user":$("#xxinput01").val()},
        success: function (data) {
            $.each(data, function (i,result) {
                item +="<tr>"+
                    "<td>"+result['username']+"</td>"+
                    "<td>"+result['roomnum']+"</td>"+
                    "<td>"+result['cost']+"</td>"+
                    "<td>"+result['starttime']+"</td>"+
                    "<td>"+result['endtime']+"</td>"+
                    "</tr>";
            })
            $(".xxt01").html("<th>用户名</th><th>房间号</th><th>花费</th><th>入住时间</th><th>截至时间</th>");
            $(".xxt01").append(item);
        }
    })
}












function todown2() {
    page2++;
    var number=$("#xxspan02").html().slice(1,$("#xxspan02").html().length-1);
    if(page2==number){
        page2=page2-1;
    }
    $("#xxspan04").html("第"+(page2+1)+"页");
    var item;
    $.ajax({
        url: "/xxysdown2",
        type: "POST",
        async: false,
        data: {"num":page2,"status":$("#xxinput02").val()},
        success: function (data) {
            $.each(data, function (i,result) {
                item +="<tr>"+
                    "<td>"+result['status']+"</td>"+
                    "<td>"+result['message']+"</td>"+
                    "<td>"+result['event']+"</td>"+
                    "<td>"+result['time']+"</td>"+
                    "</tr>";
            })
            $(".xxt02").html("<th>状态号</th><th>方法信息</th><th>状态Common/Null/error</th><th>方法时间</th>");
            $(".xxt02").append(item);
        }
    })
}

function toup2() {
    page2--;
    if (page2<0){
        page2=0;
    }
    $("#xxspan04").html("第"+(page2+1)+"页");
    var item;
    $.ajax({
        url: "/xxysup2",
        type: "POST",
        async: false,
        data: {"num":page2,"status":$("#xxinput02").val()},
        success: function (data) {
            $.each(data, function (i,result) {
                item +="<tr>"+
                    "<td>"+result['status']+"</td>"+
                    "<td>"+result['message']+"</td>"+
                    "<td>"+result['event']+"</td>"+
                    "<td>"+result['time']+"</td>"+
                    "</tr>";
            })
            $(".xxt02").html("<th>状态号</th><th>方法信息</th><th>状态Common/Null/error</th><th>方法时间</th>");
            $(".xxt02").append(item);
        }
    })
}