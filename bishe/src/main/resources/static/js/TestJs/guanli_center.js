
var r=0;
var n=0;

function glydldc() {
   window.location.href="/guanliyuan_denglu";
}

function glydldb() {
    window.location.href="/guanlicenter_index";
}

function glydlda() {
    if($("#glydldiv03").css("display")=="none"){
        $("#glydldiv03").css("display","inline");
    }else {
        $("#glydldiv03").css("display","none");
    }
}

function glydldd() {
   r+=180;
   $("#glydlimg04").css("transform",'rotate('+r+'deg)');
   if(n%2==0){
       $("#glydldiv04").css("left","-8%");
   }else {
       $("#glydldiv04").css("left","0%");
   }
   n++;
}

function glydlde() {
    window.location.href="/index";
}

function glydldf() {
    window.location.href="/qiantaiyingye";
}

function glydldg() {
   window.location.href="/fangwuguanli";
}

function glydldh() {
    window.location.href="/xxy";
}

function glydldi() {
    window.location.href="/kcgls";
}

function glydldj() {
    window.location.href="/yxgl";
}

function glydldk() {
    window.location.href="/cwgl";
}

function tofwdh() {
  window.location.href="/fwdh";
}
