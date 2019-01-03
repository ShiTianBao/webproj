package com.shitianbao.webproj.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class FileUpload {

    /**
     * @function  单文件上传
     * @return
     */ public static String fileOne(MultipartFile file, String saveUrl, String fileName){

        String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
         String newUrl = saveUrl+"\\"+"cover\\"+fileName + suffix;
         System.out.println("文件路径：" + newUrl);
         File saveFile = new File(newUrl);
         if(!saveFile.getParentFile().exists()){
             saveFile.getParentFile().mkdirs();
         }
         try {
             file.transferTo(saveFile);
         } catch (IOException e) {
             e.printStackTrace();
             return "上传失败！";
         }
         return newUrl;
     }

}
