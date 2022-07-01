package com.zmh.demo.util;

import org.springframework.stereotype.Component;

import java.io.*;

@Component
public class FileCopy {

    public void copy(File file,String path){
        File file1=new File(path);
        if(!file1.exists()){
            try {
                file1.createNewFile();
                try {
                    FileInputStream fileInputStream=new FileInputStream(file);
                    FileOutputStream fileOutputStream=new FileOutputStream(file1);
                    try {
                        byte[] bytes=new byte[fileInputStream.available()];
                        fileInputStream.read(bytes);
                        fileOutputStream.write(bytes);
                        fileInputStream.close();
                        fileOutputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
