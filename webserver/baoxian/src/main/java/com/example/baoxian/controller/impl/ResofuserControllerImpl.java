package com.example.baoxian.controller.impl;

import com.alibaba.fastjson.JSON;
import com.example.baoxian.controller.ResofuserController;
import com.example.baoxian.mapper.ResofuserMapper;
import com.example.baoxian.pojo.Resofuser;
import com.example.baoxian.serivce.ResofuserService;
import com.example.baoxian.util.OSSUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.spring.web.json.Json;

import java.io.InputStream;


@CrossOrigin
@RestController
@RequestMapping("/resofuser")
public class ResofuserControllerImpl  implements ResofuserController {
    @Autowired
    ResofuserService resofuserService ;
    @Autowired
    OSSUtil ossUtil ;

    @PostMapping("/addimg2")
    public String addImage2(@RequestParam("files") MultipartFile files , @RequestParam("id") String  id){
        try {
            String fileName = files.getName() +".png";
            InputStream inputStream = files.getInputStream();
            String url = ossUtil.addOSS(inputStream, id+"lp", fileName);
            System.out.println("Asd"+id);
            this.addResofuser2(new Resofuser(null,Integer.parseInt(id),url));
            return JSON.toJSONString(url);
        }catch (Exception e){
            return JSON.toJSONString(false);
        }
    }

    @PostMapping("/addimg")
    public String addImage(@RequestParam("files") MultipartFile files , @RequestParam("id") String  id){
        try {
            String fileName = files.getName() +".png";
            InputStream inputStream = files.getInputStream();
            String url = ossUtil.addOSS(inputStream, id, fileName);
            this.addResofuser(new Resofuser(null,Integer.parseInt(id),url));
            return JSON.toJSONString(url);
        }catch (Exception e){
            return JSON.toJSONString(false);
        }
    }

    @Override
    @PostMapping("/updateimg")
    public String updateResofuser(@RequestParam("files")  MultipartFile files, @RequestParam("id") Integer id,@RequestParam("bxid")Integer bxid) {
       try {
           Resofuser resofuser = resofuserMapper.selectById(id);
           ossUtil.delOSS(resofuser.getImageurl());

           String fileName = files.getName() +".png";
           InputStream inputStream = files.getInputStream();
           String url = ossUtil.addOSS(inputStream, bxid+"", fileName);
           return resofuserService.updateResofuser(new Resofuser(id,bxid,url));
       }catch (Exception e){
           return JSON.toJSONString(false);
       }
    }


    @Override
    @PostMapping("/add")
    public String addResofuser(@RequestBody Resofuser resofuser) {
      try {
          return  resofuserService.addResofuser(resofuser);
      }catch (Exception e){
          return JSON.toJSONString(false);
      }
    }


    @PostMapping("/add2")
    public String addResofuser2(@RequestBody Resofuser resofuser) {
        try {
            return  resofuserService.addResofuser2(resofuser);
        }catch (Exception e){
            return JSON.toJSONString(false);
        }
    }


    @Autowired
    ResofuserMapper resofuserMapper ;
    @Override
    @GetMapping("/del")
    public String delResofuserById(@RequestParam("id") Integer id) {
        try {
            Resofuser resofuser = resofuserMapper.selectById(id);
            ossUtil.delOSS(resofuser.getImageurl());
            return resofuserService.delResofuserById(id);
        }catch (Exception e){
            return JSON.toJSONString(false);
        }
    }

    @Override
    @GetMapping("/delresofuserbyinsuredld")
    public String delResofuserByinsuredld(@RequestParam("id") Integer id) {
        try {
            return resofuserService.delResofuserByinsuredld(id);
        }catch (Exception e){
            return JSON.toJSONString(false);
        }
    }

    @Override
    @GetMapping("/getById")
    public String selectById(@RequestParam("id") Integer id) {
        try {
            return resofuserService.selectById(id);
        }catch (Exception e){
            return JSON.toJSONString(false);
        }
    }

    @Override
    @GetMapping("/getAll")
    public String selectAll() {
       try {
           return resofuserService.selectAll();
       }catch (Exception e){
           return JSON.toJSONString(false);
       }
    }

    @GetMapping("/getalllist")
    public String getALllist(String insuredId){
        return resofuserService.getALllist(insuredId);
    }

    @GetMapping("/getalllist2")
    public String getALllist2(String insuredId){
        return resofuserService.getALllist(insuredId);
    }
}
