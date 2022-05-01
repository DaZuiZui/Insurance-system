package com.example.baoxian.mapper;

import com.example.baoxian.pojo.ReasonText;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface ReasonTextMapper {
    // 增删改查
    //public class ReasonText {
    //    Integer id ;
    //    String resontext;
    //    Integer insuredID;
    //}
    @Insert("insert into reasontext values(null,#{resontext},#{insuredID});")
    public int addReasonText(ReasonText reasonText);

    @Delete("delete from reasontext where id = #{id};")
    public int delReasonTextById(Integer id);
    @Update("update reasontext set resontext=#{resontext} ,insuredID =#{insuredID} where id =#{id};")
    public  int updateReasonText(ReasonText reasonText);




    @Select("select * from reasontext where id = #{id}")
    public ReasonText setlectReasonTextById(int id) ;


    @Select("select * from reasontext ")
    public List<ReasonText> selectAll() ;



}
