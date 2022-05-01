package com.example.baoxian.controller;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.InputStream;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("/img")
public class ImgController {

    @PostMapping("/upload")
    public  String upload(MultipartFile file, HttpServletRequest httpRequest){

        String url  = httpRequest.getServletContext().getRealPath("");
        String originalFilename = file.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        String newFilename = uuid +  originalFilename ;
        File image = new File(url,newFilename);
        try {
            file.transferTo(image);
            return newFilename;

        }catch (Exception e){
            e.printStackTrace();
            return "null";
        }
    }
}
