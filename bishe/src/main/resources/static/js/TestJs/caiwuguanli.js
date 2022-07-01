var page=0;

function drawCircle(canvasId, data_arr, color_arr, text_arr)
{
    var c = document.getElementById(canvasId);
    var ctx = c.getContext("2d");

    var radius = c.height / 2 - 20; //半径
    var ox = radius + 20, oy = radius + 20; //圆心

    var width = 30, height = 10; //图例宽和高
    var posX = ox * 2 + 20, posY = 30;   //
    var textX = posX + width + 5, textY = posY + 10;

    var startAngle = 0; //起始弧度
    var endAngle = 0;   //结束弧度
    for (var i = 0; i < data_arr.length; i++)
    {
        //绘制饼图
        endAngle = endAngle + data_arr[i] * Math.PI * 2; //结束弧度
        ctx.fillStyle = color_arr[i];
        ctx.beginPath();
        ctx.moveTo(ox, oy); //移动到到圆心
        ctx.arc(ox, oy, radius, startAngle, endAngle, false);
        ctx.closePath();
        ctx.fill();
        startAngle = endAngle; //设置起始弧度

        //绘制比例图及文字
        ctx.fillStyle = color_arr[i];
        ctx.fillRect(posX, posY + 20 * i, width, height);
        ctx.moveTo(posX, posY + 20 * i);
        ctx.font = 'bold 12px 微软雅黑';    //斜体 30像素 微软雅黑字体
        ctx.fillStyle = color_arr[i]; //"#000000";
        var percent = text_arr[i] + "：" + 100 * data_arr[i] + "%";
        ctx.fillText(percent, textX, textY + 20 * i);
    }
}

function init() {
    var room=0;
    var food=0;
    var cost=0;
    $.ajax({
        url: "getmoneycircle",
        async: false,
        type: "POST",
        success: function (data) {
           room=data;
        }
    })
    $.ajax({
        url: "getmoneycircles",
        async: false,
        type: "POST",
        success: function (data) {
           food=data;
        }
    })
    $.ajax({
        url: "getzhichu",
        async: false,
        type: "POST",
        success: function (data) {
            cost=data;
        }
    })
    $("#cwp03").html(food+room+cost+'元');
    $("#cwp04").html(food+room+'元');
    $("#cwp05").html((-(cost))+'元');
    //绘制饼图
    //比例数据和颜色
    var data_arr = [room/(room+food), food/(room+food)];
    var color_arr = ["#00FF21", "#FFAA00"];
    var text_arr = ["房间收入占比", "商品收入占比"];

    drawCircle("canvas_circle", data_arr, color_arr, text_arr);
}

//页面加载时执行init()函数
window.onload = function () {
   init();
}

function todowns() {
    page++;
    var number=$("#cwp02").html().slice(2,$("#cwp02").html().length-3);
    number=number/12;
    if(page>number){
        page=page-1;
    }
    var item;
    $.ajax({
        url: "/cwdown",
        type: "POST",
        async: false,
        data: {"num":page},
        success: function (data) {
            $.each(data, function (i,result) {
                item +="<tr>"+
                    "<td>"+result['things']+"</td>"+
                    "<td>"+result['cost']+"</td>"+
                    "<td>"+result['lasttime']+"</td>"+
                    "<td>"+result['money']+"</td>"+
                    "</tr>";
            })
            $(".cwt01").html("<th>物品</th><th>价格/（收入/支出）</th><th>交易时间</th><th>当前酒店余额</th>");
            $(".cwt01").append(item);
        }
    })
}

function toups() {
    page--;
    if(page<0){
        page=0;
    }
    var item;
    $.ajax({
        url: "/cwdown",
        type: "POST",
        async: false,
        data: {"num":page},
        success: function (data) {
            $.each(data, function (i,result) {
                item +="<tr>"+
                    "<td>"+result['things']+"</td>"+
                    "<td>"+result['cost']+"</td>"+
                    "<td>"+result['lasttime']+"</td>"+
                    "<td>"+result['money']+"</td>"+
                    "</tr>";
            })
            $(".cwt01").html("<th>物品</th><th>价格/（收入/支出）</th><th>交易时间</th><th>当前酒店余额</th>");
            $(".cwt01").append(item);
        }
    })
}

function today() {
    $.ajax({
        url: "havaday",
        type: "GET",
        async: false,
        success: function () {
          window.location.href="/havaday";
        }
    })
}

function toago() {
    $.ajax({
        url: "havaago",
        type: "GET",
        async: false,
        success: function () {
            window.location.href="/havaago";
        }
    })
}