function tocent(data) {
   var num=$(".lybs").index(data);
   var user=$("#lyuser").html().slice(7,$("#lyuser").html().length);
   var roomstyle=$(".lyps01").eq(num).html();
   var calls=$(".lytext").eq(num).val();
   $.ajax({
       url: "tolyx",
       type: "POST",
       async: false,
       data: {"user":user,"rooms":roomstyle,"call":calls},
       success: function () {
          alert("评价成功!");
       }
   })
}