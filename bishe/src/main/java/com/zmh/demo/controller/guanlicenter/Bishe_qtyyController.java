package com.zmh.demo.controller.guanlicenter;

import com.zmh.demo.pojo.Foods;
import com.zmh.demo.pojo.Friends;
import com.zmh.demo.pojo.Rooms;
import com.zmh.demo.service.qtyyService;
import com.zmh.demo.util.FileCopy;
import com.zmh.demo.util.GetImgName;
import com.zmh.demo.util.returns.returnFoodList;
import com.zmh.demo.util.returns.returnRoomsList;
import com.zmh.demo.util.returns.returnfriendstyle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.List;

@RestController
public class Bishe_qtyyController {

    @Autowired
    private FileCopy fileCopy;

    @Autowired
    private GetImgName getImgName;

    @Autowired
    private qtyyService qtyyService;

    @Autowired
    private returnRoomsList returnRoomsList;

    @Autowired
    private returnFoodList returnFoodList;

    @Autowired
    private returnfriendstyle returnfriendstyle;

    @PostMapping("/image")
    public String InImage(File file,String roomstyle,String moneys){
        /*C:\Users\zhangminghui\Pictures\bishe*/
        String message="";
        if (roomstyle.equals("")||roomstyle==null){
            message="房间类型不能为空";
        }else {
            List<String> list=qtyyService.returnroomstyle();
            boolean b=returnRoomsList.returnroomslist(list,roomstyle);
            if(b){
                message="提交成功";
                String noPath=file.getAbsolutePath();
                StringBuilder stringBuilder=getImgName.returnStringBuilder(noPath);
                String Path="../static/UserImage/"+stringBuilder.toString();/*数据库文件路径*/
                String RealPath="C:\\Users\\zhangminghui\\IdeaProjects\\bishe\\src\\main\\resources\\static\\UserImage\\"+stringBuilder.toString();
                String fromPath="C:\\Users\\zhangminghui\\Pictures\\bishe\\"+stringBuilder.toString();
                fileCopy.copy(new File(fromPath),RealPath);
                qtyyService.setroomStyle(new Rooms(roomstyle,Integer.valueOf(moneys),Path));
            }else {
                message="存在该房型，请不要继续录入";
            }
        }
        return message;
    }

    @PostMapping("/updateimage")
    public String updateimage(File file,String roomstyle){
        String message="";
        if (roomstyle.equals("")||roomstyle==null){
            message="房间类型不能为空";
        }else {
            List<String> list=qtyyService.returnroomstyle();
            boolean b=returnRoomsList.returnroomslist(list,roomstyle);
            if(b){
                message="不存在该类型房间";
            }else {
                message="修改成功";
                String noPath = file.getAbsolutePath();
                StringBuilder stringBuilder = getImgName.returnStringBuilder(noPath);
                String Path = "../static/UserImage/" + stringBuilder.toString();/*数据库文件路径*/
                String RealPath = "C:\\Users\\zhangminghui\\IdeaProjects\\bishe\\src\\main\\resources\\static\\UserImage\\" + stringBuilder.toString();
                String fromPath = "C:\\Users\\zhangminghui\\Pictures\\bishe\\" + stringBuilder.toString();
                fileCopy.copy(new File(fromPath), RealPath);
                qtyyService.updateroomStyle(Path, roomstyle);
            }
        }
        return message;
    }

    @PostMapping("/panduanfang")
    public String panduanfang(String roomstyle){
        List<String> list=qtyyService.returnroomstyle();
        String message="";
        if(roomstyle.equals("")||roomstyle==null){
            message="房间类型不能为空";
        }else {
        /*如果不存在一样的，返回true，否则false*/
        boolean b=returnRoomsList.returnroomslist(list,roomstyle);
        if(b){
            message="不存在该类型房间";
        }else {
            message="查询成功";
        }
        }
        return message;
    }

    @PostMapping("/panduanfood")
    public String panduanfood(String foodstyle){
        List<String> list=qtyyService.returnfoodstyle();
        String message="";
        if(foodstyle.equals("")||foodstyle==null){
            message="商品类型不能为空";
        }else {
            /*如果不存在一样的，返回true，否则false*/
            boolean b=returnFoodList.returnfoodslist(list,foodstyle);
            if(b){
                message="可以录入";
            }else {
                message="存在该商品，请不要继续录入";
            }
        }
        return message;
    }

    @PostMapping("/panduanfriend")
    public String panduanfriend(String friendname){
        List<String> list=qtyyService.returnfiendsstyle();
        String message="";
        if(friendname.equals("")||friendname==null){
            message="伙伴名字不能为空";
        }else {
            /*如果不存在一样的，返回true，否则false*/
            boolean b=returnfriendstyle.returnfriendslist(list,friendname);
            if(b){
                message="可以录入";
            }else {
                message="存在该伙伴，请不要继续录入";
            }
        }
        return message;
    }

    @PostMapping("/panduanfang02")
    public String panduanfang02(String roomstyle){
        List<String> list=qtyyService.returnroomstyle();
        String message="";
        if(roomstyle.equals("")||roomstyle==null){
            message="房间类型不能为空";
        }else {
            /*如果不存在一样的，返回true，否则false*/
            boolean b=returnRoomsList.returnroomslist(list,roomstyle);
            if(b){
                message="可以录入";
            }else {
                message="存在该房型，请不要继续录入";
            }
        }
        return message;
    }

    @PostMapping("/panduanfood02")
    public String panduanfood02(String foodstyle){
        List<String> list=qtyyService.returnfoodstyle();
        String message="";
        if(foodstyle.equals("")||foodstyle==null){
            message="商品类型不能为空";
        }else {
            /*如果不存在一样的，返回true，否则false*/
            boolean b=returnFoodList.returnfoodslist(list,foodstyle);
            if(b){
                message="不存在该类型商品";
            }else {
                message="查询成功";
            }
        }
        return message;
    }

    @PostMapping("/panduanfriend02")
    public String panduanfriend02(String friendname){
        List<String> list=qtyyService.returnfiendsstyle();
        String message="";
        if(friendname.equals("")||friendname==null){
            message="伙伴名字不能为空";
        }else {
            /*如果不存在一样的，返回true，否则false*/
            boolean b=returnfriendstyle.returnfriendslist(list,friendname);
            if(b){
                message="不存在该伙伴";
            }else {
                message="查询成功";
            }
        }
        return message;
    }

    @PostMapping("/foodin")
    public String foodin(File file,String foodstyle,String foodmoney){
        /*C:\Users\zhangminghui\Pictures\bishe*/
        String message="";
        if (foodstyle.equals("")||foodstyle==null){
            message="商品类型不能为空";
        }else {
            List<String> list=qtyyService.returnfoodstyle();
            boolean b=returnFoodList.returnfoodslist(list,foodstyle);
         if(b){
             message="提交成功";
        String noPath=file.getAbsolutePath();
        StringBuilder stringBuilder=getImgName.returnStringBuilder(noPath);
        String Path="../static/UserImage/"+stringBuilder.toString();/*数据库文件路径*/
        String RealPath="C:\\Users\\zhangminghui\\IdeaProjects\\bishe\\src\\main\\resources\\static\\UserImage\\"+stringBuilder.toString();
        String fromPath="C:\\Users\\zhangminghui\\Pictures\\bishe\\"+stringBuilder.toString();
        fileCopy.copy(new File(fromPath),RealPath);
        qtyyService.setfoodStyle(new Foods(Path,foodstyle,Integer.valueOf(foodmoney)));
            }else {
                message="存在该商品，请不要继续录入";
            }
        }
        return message;
    }


    @PostMapping("/friendin")
    public String friendin(File file,String friendstyle,String friendmoney){
        /*C:\Users\zhangminghui\Pictures\bishe*/
        String message="";
        if (friendstyle.equals("")||friendstyle==null){
            message="伙伴名字不能为空";
        }else {
            List<String> list=qtyyService.returnfiendsstyle();
            boolean b=returnfriendstyle.returnfriendslist(list,friendstyle);
            if(b){
                message="提交成功";
                String noPath=file.getAbsolutePath();
                StringBuilder stringBuilder=getImgName.returnStringBuilder(noPath);
                String Path="../static/UserImage/"+stringBuilder.toString();/*数据库文件路径*/
                String RealPath="C:\\Users\\zhangminghui\\IdeaProjects\\bishe\\src\\main\\resources\\static\\UserImage\\"+stringBuilder.toString();
                String fromPath="C:\\Users\\zhangminghui\\Pictures\\bishe\\"+stringBuilder.toString();
                fileCopy.copy(new File(fromPath),RealPath);
                qtyyService.setfriendStyle(new Friends(Path,friendstyle,Integer.valueOf(friendmoney)));
            }else {
                message="存在该伙伴，请不要继续录入";
            }
        }
        return message;
    }

    @PostMapping("/foodupdate")
    public String foodupdate(File file,String foodstyle){
        String message="";
        if (foodstyle.equals("")||foodstyle==null){
            message="商品类型不能为空";
        }else {
            List<String> list=qtyyService.returnfoodstyle();
            boolean b=returnFoodList.returnfoodslist(list,foodstyle);
            if(b){
                message="不存在该类型商品";
            }else {
                message="修改成功";
                String noPath = file.getAbsolutePath();
                StringBuilder stringBuilder = getImgName.returnStringBuilder(noPath);
                String Path = "../static/UserImage/" + stringBuilder.toString();/*数据库文件路径*/
                String RealPath = "C:\\Users\\zhangminghui\\IdeaProjects\\bishe\\src\\main\\resources\\static\\UserImage\\" + stringBuilder.toString();
                String fromPath = "C:\\Users\\zhangminghui\\Pictures\\bishe\\" + stringBuilder.toString();
                fileCopy.copy(new File(fromPath), RealPath);
                qtyyService.updatefoodStyle(Path,foodstyle);
            }
        }
        return message;
    }

    @PostMapping("/frienddelete")
    public String frienddelete(String friendname){
        String message="";
        if (friendname.equals("")||friendname==null){
            message="伙伴名字不能为空";
        }else {
            List<String> list=qtyyService.returnfiendsstyle();
            boolean b=returnfriendstyle.returnfriendslist(list,friendname);
            if(b){
                message="不存在该伙伴";
            }else {
                message="删除成功";
                qtyyService.deletefriends(friendname);
            }
        }
        return message;
    }
}
