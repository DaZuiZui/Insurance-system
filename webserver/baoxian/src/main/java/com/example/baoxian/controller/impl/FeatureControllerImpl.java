package com.example.baoxian.controller.impl;

import com.alibaba.fastjson.JSON;
import com.example.baoxian.controller.FeatureController;
import com.example.baoxian.pojo.Feature;
import com.example.baoxian.serivce.FeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@CrossOrigin
@RestController
@RequestMapping("/feature")
public class FeatureControllerImpl  implements FeatureController {
    @Autowired
    FeatureService featureService;

    @Override
    @PostMapping("/add")
    public String addFeature(Feature feature) {

        if (feature.getCreateTime() == null){
            feature.setCreateTime(new Date());
        }
        if (feature.getUpdateTime() == null){
            feature.setUpdateTime(new Date());
        }
        try{
            return featureService.addFeature(feature);
        }catch (Exception e){
            return JSON.toJSONString(false);
        }

    }

    @Override
    @GetMapping("del")
    public String delFeature(Integer id) {
        try {
            return featureService.delFeature(id);
        }catch (Exception e){
            return JSON.toJSONString(false);
        }

    }

    @Override
    @PostMapping("/update")
    public String updateFeature(Feature feature) {
        //update
        feature.setUpdateTime(new Date());
        try {
            return featureService.updateFeature(feature);
        }catch (Exception e){
            return  JSON.toJSONString(false);
        }
    }

    @Override
    @GetMapping("/selectById")
    public String selectFeatureById(Integer id) {
        try {
            return featureService.selectFeatureById(id);
        }catch (Exception e){
            return JSON.toJSONString(false);
        }
    }

    @Override
    @GetMapping("/getAll")
    public String selectAll() {
        try {
            return JSON.toJSONString(featureService.selectAll());
        }catch (Exception e){
            return JSON.toJSONString(false);
        }

    }
}
