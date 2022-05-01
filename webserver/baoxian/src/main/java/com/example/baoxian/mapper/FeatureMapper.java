package com.example.baoxian.mapper;

import com.example.baoxian.pojo.Feature;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface FeatureMapper {
    //    Integer id ;
    //    String value ;
    //    int holderId;
    //    String holderName;
    //    String imageUrl;
    //    Date createTime ;
    //    Date updateTime ;
    @Insert("insert into feature values(null,#{value},#{holderId},#{holderName},#{imageUrl},#{createTime},#{updateTime})")
    public int addFeature(Feature feature);
    @Delete("delete from feature where id =#{id}")
    public int delFeature(Integer id);

    @Update("update feature set value=#{value},holder_id=#{holderId},holder_name=#{holderName},image_url=#{imageUrl},update_time=#{updateTime} where id=#{id}")
    public int updateFeature(Feature feature);
    @Select("select * from feature where id =#{id}")
    public Feature selectFeatureById(Integer id) ;

    @Select("select * from feature")
    public List<Feature> selectAll();





}
