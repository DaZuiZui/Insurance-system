package com.example.baoxian.controller;



import com.example.baoxian.pojo.Feature;
import com.example.baoxian.serivce.FeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public interface FeatureController {

    public String  addFeature(Feature feature);

    public String  delFeature(Integer id);

    public String updateFeature(Feature feature);

    public String selectFeatureById(Integer id) ;

    public String selectAll();


}
