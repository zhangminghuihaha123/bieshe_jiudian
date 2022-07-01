package com.zmh.demo.util;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.zmh.demo.pojo.Money;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Component
public class ExcelUtil {

    public void writeExcel(HttpServletResponse response, List<Money> list) throws IOException {
        ExcelWriter excelWriter= EasyExcel.write(response.getOutputStream()).build();
        WriteSheet sheet=EasyExcel.writerSheet(0,"sheet").head(Money.class).build();
        excelWriter.write(list,sheet);
        excelWriter.finish();
    }
}
