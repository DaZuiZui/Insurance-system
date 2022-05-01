package com.example.baoxian.serivce.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.example.baoxian.mapper.ResofuserMapper;
import com.example.baoxian.pojo.Resofuser;
import com.example.baoxian.serivce.ResofuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springfox.documentation.spring.web.json.Json;

import java.util.List;

@Service
public class ResofuserServiceImpl  implements ResofuserService {
    @Autowired
    ResofuserMapper resofuserMapper ;
    @Override
    public String addResofuser(Resofuser resofuser) {
        int i = resofuserMapper.addResofuser(resofuser);
        if (i>=1){
            return JSON.toJSONString(true);
        }else {
            return JSON.toJSONString(false);
        }
    }

    public String addResofuser2(Resofuser resofuser) {
        System.out.println("into");
        int i = resofuserMapper.addResofuser2(resofuser);
        if (i>=1){
            return JSON.toJSONString(true);
        }else {
            return JSON.toJSONString(false);
        }
    }

    @Override
    public String updateResofuser(Resofuser resofuser) {
        int i = resofuserMapper.updateResofuser(resofuser);

        if (i>=1){
            return JSON.toJSONString(true);
        }else {
            return JSON.toJSONString(false);
        }
    }

    @Override
    public String delResofuserById(Integer id) {
        int i = resofuserMapper.delResofuserById(id);
        if (i>=1){
            return JSON.toJSONString(true);
        }else {
            return JSON.toJSONString(false);
        }
    }

    @Override
    public String delResofuserByinsuredld(Integer id) {
        int i = resofuserMapper.delResofuserByinsuredld(id);
        if (i>=1){
            return JSON.toJSONString(true);
        }else {
            return JSON.toJSONString(false);
        }
    }

    @Override
    public String selectById(Integer id) {
        Resofuser resofuser = resofuserMapper.selectById(id);
        return JSON.toJSONString(resofuser);
    }

    @Override
    public String selectAll() {
        List<Resofuser> resofusers = resofuserMapper.selectAll();
        return JSON.toJSONString(resofusers);
    }

    @Override
    public String getALllist(String insuredId) {
        return JSONArray.toJSONString(resofuserMapper.selectthedatebyid(insuredId));
    }

    @Override
    public String getALllist2(String insuredId) {
        return JSONArray.toJSONString(resofuserMapper.selectthedatebyid2(insuredId));
    }
}
