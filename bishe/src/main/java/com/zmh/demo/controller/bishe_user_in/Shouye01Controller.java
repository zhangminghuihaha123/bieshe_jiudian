package com.zmh.demo.controller.bishe_user_in;

import com.zmh.demo.pojo.Money;
import com.zmh.demo.service.shouyeService;
import com.zmh.demo.util.FileCopy;
import com.zmh.demo.util.GetImgName;
import com.zmh.demo.util.returns.returnCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class Shouye01Controller {

    @Autowired
    private GetImgName getImgName;

    @Autowired
    private FileCopy fileCopy;

    @Autowired
    private shouyeService shouyeService;

    @Autowired
    private returnCard returnCard;

    @PostMapping("/syimage")
    public void images(File file, HttpSession session){
        String name= (String) session.getAttribute("key");
        String noPath=file.getAbsolutePath();
        StringBuilder stringBuilder=getImgName.returnStringBuilder(noPath);
        String Path="../static/UserImage/"+stringBuilder.toString();/*数据库文件路径*/
        String RealPath="C:\\Users\\zhangminghui\\IdeaProjects\\bishe\\src\\main\\resources\\static\\UserImage\\"+stringBuilder.toString();
        String fromPath="C:\\Users\\zhangminghui\\Pictures\\bishe\\"+stringBuilder.toString();
        fileCopy.copy(new File(fromPath),RealPath);
        shouyeService.inuserimages(name,Path);
    }

    @PostMapping("/topay")
    public String topay(String yhk,String password,String roomstyle,String user,String start,String end,HttpSession session){
        String message="";
        if(yhk ==null||yhk.equals("")||password == null||password.equals("")){
            message="账号或密码不能为空!";
        }else {
            List<String> list=shouyeService.returnzh();
            /*如果不存在一样的，返回true，否则false*/
            if(returnCard.returnCard(list,yhk)){
                message="该银行卡不存在，请重新输入";
            }else {
                if(shouyeService.retrunmm(yhk).equals(password)){
                    int money=shouyeService.yhktotal(yhk);
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    long m = 0;
                    try {
                        m = sdf.parse(end).getTime() - sdf.parse(start).getTime();
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    int times;
                    if((int)(m/(1000 * 60 * 60 * 24))==0){
                        times=1;
                    }else {
                        times=(int)(m/(1000 * 60 * 60 * 24));
                    }
                    int cost=shouyeService.roomsale(roomstyle) * times;
                    if(money>=cost){
                        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        try {
                            end=end+" 00:00:00";
                            Date date1 = sdf.parse(start);
                            Date date2 = sf.parse(end);
                            int roomnum=shouyeService.returnRoomNum(roomstyle);
                            shouyeService.updateRooms(user,date1,date2,roomnum,yhk);
                            shouyeService.updateMoney(yhk,cost);
                            shouyeService.logUser(user,roomnum,cost,date1,date2);
                            session.setAttribute("names",user);
                            message="恭喜您支付成功！您的房间号为"+roomnum;

                            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                            String time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
                            Date timess=null;
                            int moneys=shouyeService.returnMoney1();
                            try {
                                timess=simpleDateFormat.parse(time);
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                            shouyeService.inMoney1(new Money(moneys+cost,timess,roomstyle,cost));
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                    }else {
                        message="银行卡余额不足，无法交易";
                    }
                }else {
                    message="密码错误!";
                }
            }
        }
        return message;
    }

    @PostMapping("/gituser")
    public void gituser(String user,HttpSession session){
        session.setAttribute("names",user);
    }
}
