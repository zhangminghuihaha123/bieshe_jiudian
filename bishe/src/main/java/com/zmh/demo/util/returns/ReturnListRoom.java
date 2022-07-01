package com.zmh.demo.util.returns;

import com.zmh.demo.pojo.Room;
import com.zmh.demo.service.fwglService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ReturnListRoom {

    @Autowired
    private fwglService fwglService;

    public List<String> ReturnListRoom(){
        String room1=fwglService.returnlistRoom(101);
        String room01="101"+"   "+room1;
        String room2=fwglService.returnlistRoom(102);
        String room02="102"+"  "+room2;
        String room3=fwglService.returnlistRoom(103);
        String room03="103"+"  "+room3;
        String room4=fwglService.returnlistRoom(104);
        String room04="104"+"  "+room4;
        String room5=fwglService.returnlistRoom(105);
        String room05="105"+"  "+room5;
        String room6=fwglService.returnlistRoom(106);
        String room06="106"+"  "+room6;
        String room7=fwglService.returnlistRoom(107);
        String room07="107"+"  "+room7;
        String room8=fwglService.returnlistRoom(108);
        String room08="108"+"  "+room8;
        String room9=fwglService.returnlistRoom(109);
        String room09="109"+"  "+room9;
        String room10=fwglService.returnlistRoom(110);
        String room010="110"+"  "+room10;
        String room11=fwglService.returnlistRoom(201);
        String room011="201"+"  "+room11;
        String room12=fwglService.returnlistRoom(202);
        String room012="202"+"  "+room12;
        String room13=fwglService.returnlistRoom(203);
        String room013="203"+"  "+room13;
        String room14=fwglService.returnlistRoom(204);
        String room014="204"+"  "+room14;
        String room15=fwglService.returnlistRoom(205);
        String room015="205"+"  "+room15;
        String room16=fwglService.returnlistRoom(206);
        String room016="206"+"  "+room16;
        String room17=fwglService.returnlistRoom(207);
        String room017="207"+"  "+room17;
        String room18=fwglService.returnlistRoom(208);
        String room018="208"+"  "+room18;
        String room19=fwglService.returnlistRoom(209);
        String room019="209"+"  "+room19;
        String room20=fwglService.returnlistRoom(210);
        String room020="210"+"  "+room20;
        String room21=fwglService.returnlistRoom(301);
        String room021="301"+"  "+room21;
        String room22=fwglService.returnlistRoom(302);
        String room022="302"+"  "+room22;
        String room23=fwglService.returnlistRoom(303);
        String room023="303"+"  "+room23;
        String room24=fwglService.returnlistRoom(304);
        String room024="304"+"  "+room24;
        String room25=fwglService.returnlistRoom(305);
        String room025="305"+"  "+room25;
        String room26=fwglService.returnlistRoom(306);
        String room026="306"+"  "+room26;
        String room27=fwglService.returnlistRoom(307);
        String room027="307"+"  "+room27;
        String room28=fwglService.returnlistRoom(308);
        String room028="308"+"  "+room28;
        String room29=fwglService.returnlistRoom(309);
        String room029="309"+"  "+room29;
        String room30=fwglService.returnlistRoom(310);
        String room030="310"+"  "+room30;
        String room31=fwglService.returnlistRoom(401);
        String room031="401"+"  "+room31;
        String room32=fwglService.returnlistRoom(402);
        String room032="402"+"  "+room32;
        String room33=fwglService.returnlistRoom(403);
        String room033="403"+"  "+room33;
        String room34=fwglService.returnlistRoom(404);
        String room034="404"+"  "+room34;
        String room35=fwglService.returnlistRoom(405);
        String room035="405"+"  "+room35;
        String room36=fwglService.returnlistRoom(406);
        String room036="406"+"  "+room36;
        String room37=fwglService.returnlistRoom(407);
        String room037="407"+"  "+room37;
        String room38=fwglService.returnlistRoom(408);
        String room038="408"+"  "+room38;
        String room39=fwglService.returnlistRoom(409);
        String room039="409"+"  "+room39;
        String room40=fwglService.returnlistRoom(410);
        String room040="410"+"  "+room40;
        List<String> list=new ArrayList<>();
        list.add(room01);list.add(room02);list.add(room03);list.add(room04);list.add(room05);list.add(room06);list.add(room07);list.add(room08);list.add(room09);list.add(room010);
        list.add(room011);list.add(room012);list.add(room013);list.add(room014);list.add(room015);list.add(room016);list.add(room017);list.add(room018);list.add(room019);list.add(room020);
        list.add(room021);list.add(room022);list.add(room023);list.add(room024);list.add(room025);list.add(room026);list.add(room027);list.add(room028);list.add(room029);list.add(room030);
        list.add(room031);list.add(room032);list.add(room033);list.add(room034);list.add(room035);list.add(room036);list.add(room037);list.add(room038);list.add(room039);list.add(room040);
        return list;
    }
}
