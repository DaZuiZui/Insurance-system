package com.example.baoxian;

import com.example.baoxian.mapper.FeatureMapper;
import com.example.baoxian.pojo.Feature;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
public class test03 {
    @Autowired
    FeatureMapper featureMapper ;
    @Test
    public void selectAll(){
        List<Feature> features = featureMapper.selectAll();
        for (Feature feature : features) {
            System.out.println(feature);
        }
    }

    @Test
    public void addFeature(){
        Feature feature = new Feature(1, "2", 2, "2", "2", new Date(), new Date());
        featureMapper.addFeature(feature);
    }

    @Test
    public void delFeature(){
        featureMapper.delFeature(3);
    }

    @Test
    public  void  updateFeature(){
        Feature feature = new Feature(1, "9090", 2, "2", "2", new Date(), new Date());
        featureMapper.updateFeature(feature);
    }

    @Test
    public  void  selectFeature(){
        Feature feature = featureMapper.selectFeatureById(1);
        System.out.println(feature);
    }

    @Test
    public void test222(){

    }
}
