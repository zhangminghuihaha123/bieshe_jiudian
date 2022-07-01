package com.zmh.demo.util.returns;
import com.zmh.demo.service.panduanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class returnAdminList_name {

    @Autowired
    private panduanService panduanService;

    //存在一样的name返回false，不一样就为true
    public boolean panduan(String name){
        boolean b=true;
        int n=panduanService.returnAdminList_name().size();
        for(int i=0;i<n;i++){
            if((panduanService.returnAdminList_name().get(i)).equals(name)){
                b=false;
                break;
            }
        }
        return b;
    }
}
