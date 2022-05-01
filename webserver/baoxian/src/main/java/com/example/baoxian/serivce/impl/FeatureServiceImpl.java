package com.example.baoxian.serivce.impl;

import com.alibaba.fastjson.JSON;
import com.example.baoxian.mapper.FeatureMapper;
import com.example.baoxian.pojo.Feature;
import com.example.baoxian.serivce.FeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public class FeatureServiceImpl  implements FeatureService {
    @Autowired
    FeatureMapper featureMapper ;


    @Override
    public String addFeature(@RequestBody Feature feature) {
        int i = featureMapper.addFeature(feature);
        if (i>=1){
            return JSON.toJSONString(true);
        }else {
            return JSON.toJSONString(false);
        }
    }

    @Override
    public String delFeature(Integer id) {
        int i = featureMapper.delFeature(id);
        if (i>=1){
            return JSON.toJSONString(true);
        }else {
            return JSON.toJSONString(false);
        }
    }

    @Override
    public String updateFeature(Feature feature) {
        int i = featureMapper.updateFeature(feature);
        if (i>=1){
            return JSON.toJSONString(true);
        }else {
            return JSON.toJSONString(false);
        }
    }

    @Override
    public String selectFeatureById(Integer id) {
        Feature feature = featureMapper.selectFeatureById(id);
        return JSON.toJSONString(feature);
    }

    @Override
    public String selectAll() {
        return JSON.toJSONString(featureMapper.selectAll());
    }
}
