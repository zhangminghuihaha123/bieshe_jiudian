package com.zmh.demo.controller.guanlicenter;

import com.zmh.demo.pojo.Money;
import com.zmh.demo.service.cwglService;
import com.zmh.demo.util.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class Bishe_cwglController {

    @Autowired
    private cwglService cwglService;

    @Autowired
    private ExcelUtil excelUtil;

    @PostMapping("/getmoneycircle")
    public int getmoneycircle(){
        List listRoom=cwglService.getRoommoney();
        int add=0;
        for(int i=0;i<listRoom.size();i++){
            add=add+(int)(listRoom.get(i));
        }
        return add;
    }

    @PostMapping("/getmoneycircles")
    public int getmoneycircles(){
        List listfood=cwglService.getFoodmoney();
        int add=0;
        for(int i=0;i<listfood.size();i++){
            add=add+(int)(listfood.get(i));
        }
        return add;
    }

    @PostMapping("/getzhichu")
    public int getzhichu(){
        List listcost=cwglService.getzhichus();
        int add=0;
        for(int i=0;i<listcost.size();i++){
            add=add+(int)(listcost.get(i));
        }
        return add;
    }

    @PostMapping("/cwdown")
    public List<Money> returnMoneylist(int num){
        List<Money> list=cwglService.returnNUmMoney(num);
        return list;
    }

    @GetMapping("/havaday")
    public void havaday(HttpServletResponse response) throws IOException {
        List<Money> list=cwglService.getMOneyDay();
        String fileName="当日酒店营销信息表";
        /*设置格式为excel*/
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition","attachment;filename="+java.net.URLEncoder.encode(fileName, "UTF-8")+".xlsx");
        excelUtil.writeExcel(response,list);
    }

    @GetMapping("/havaago")
    public void havaago(HttpServletResponse response) throws IOException{
        List<Money> list=cwglService.getMOneyAgo();
        String fileName="酒店营销信息表";
        /*设置格式为excel*/
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition","attachment;filename="+java.net.URLEncoder.encode(fileName, "UTF-8")+".xlsx");
        excelUtil.writeExcel(response,list);
    }

}
