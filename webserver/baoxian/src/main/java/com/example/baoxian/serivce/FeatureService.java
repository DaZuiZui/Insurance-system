package com.example.baoxian.serivce;

import com.example.baoxian.pojo.Feature;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface FeatureService {

    public String  addFeature(Feature feature);

    public String  delFeature(Integer id);

    public String updateFeature(Feature feature);

    public String selectFeatureById(Integer id) ;

    public String selectAll();
}
