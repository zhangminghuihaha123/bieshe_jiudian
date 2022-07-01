var page3=0;

function kc01() {
    $("#kcdiv03").css("background","gray");
}
function kc02() {
    $("#kcdiv03").css("background","#c1c1c1");
}
function kc03() {
    $("#kcdiv04").css("background","gray");
}
function kc04() {
    $("#kcdiv04").css("background","#c1c1c1");
}
function kc05() {
    $("#kcdiv05").css("background","gray");
}
function kc06() {
    $("#kcdiv05").css("background","#c1c1c1");
}
function kc07() {
    window.location.href="/guanlicenter_index";
}

function kc08() {
    $("#kcspan05").html("进货");
    $("#kcdiv06").css("display","block");
    $("#kcdiv08").css("display","none");
    $("#kcdiv09").css("display","none");
}
function kc09() {
    $("#kcspan05").html("卖货");
    $("#kcdiv06").css("display","none");
    $("#kcdiv08").css("display","none");
    $("#kcdiv09").css("display","block");
}
function kc10() {
    $("#kcspan05").html("库存");
    $("#kcdiv06").css("display","none");
    $("#kcdiv08").css("display","block");
    $("#kcdiv09").css("display","none");
}

function kc11(data) {
    var n=$(".kcbuttons").index(data);
    var num=$(".kcinputs").eq(n).val();
    var food=$(".kcps01").eq(n).html().slice(5,$(".kcps01").eq(n).html().length);
    $.ajax({
        url: "/kcin",
        type: "POST",
        async: false,
        data: {"food":food,"num":num},
        success: function () {
           alert("录入成功!");
        }
    })
}

function kc12() {
    var item;
    $.ajax({
        url: "getkcstyle",
        type: "POST",
        async: false,
        data: {"food":$("#kcinput").val()},
        success: function (data) {
            $.each(data, function (i,result) {
                item +="<tr>"+
                    "<td>"+result['food']+"</td>"+
                    "<td>"+result['foodkc']+"</td>"+
                    "</tr>";
            })
            $(".kct02").html("<th>商品类型</th><th>商品库存数量</th>");
            $(".kct02").append(item);
        }
    })
}


function todown3() {
    page3++;
    var number=$("#kcspan06").html().slice(1,$("#kcspan06").html().length-1);
    if(page3==number){
        page3=page3-1;
    }
    $("#kcspan07").html("第"+(page3+1)+"页");
    var item;
    $.ajax({
        url: "/kctouchs",
        type: "POST",
        async: false,
        data: {"num":page3},
        success: function (data) {
            $.each(data, function (i,result) {
                item +="<tr>"+
                    "<td>"+result['food']+"</td>"+
                    "<td>"+result['foodkc']+"</td>"+
                    "</tr>";
            })
            $(".kct02").html("<th>商品类型</th><th>商品库存数量</th>");
            $(".kct02").append(item);
        }
    })
}

function toup3() {
    page3--;
    if (page3<0){
        page3=0;
    }
    $("#kcspan07").html("第"+(page3+1)+"页");
    var item;
    $.ajax({
        url: "/kctouchs",
        type: "POST",
        async: false,
        data: {"num":page3},
        success: function (data) {
            $.each(data, function (i,result) {
                item +="<tr>"+
                    "<td>"+result['food']+"</td>"+
                    "<td>"+result['foodkc']+"</td>"+
                    "</tr>";
            })
            $(".kct02").html("<th>商品类型</th><th>商品库存数量</th>");
            $(".kct02").append(item);
        }
    })
}

function kc13() {
   var food=$("#kcselect").find("option:selected").text();
   $.ajax({
       url: "getfoodimg",
       async: false,
       type: "POST",
       data: {"food":food},
       success: function (data) {
           $("#kcimg04").attr("src",data);
       }
   })
   $.ajax({
       url: "getfoodmoney",
       async: false,
       type: "POST",
       data: {"food":food},
       success: function (data) {
           $("#kcspan09").html('￥:'+data+'元');
       }
   })
}

function kc14() {
   var food=$("#kcselect").find("option:selected").text();
   var number=$("#kcinput01").val();
   $.ajax({
       url: "tosellFood",
       async: false,
       type: "POST",
       data: {"food":food,"num":number},
       success: function () {
         alert("结算成功!");
       }
   })
}