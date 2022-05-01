package com.example.baoxian.mapper;

import com.example.baoxian.pojo.Resofuser;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Mapper
@Component
public interface ResofuserMapper {
    //public class Resofuser  implements Serializable {
    //    Integer id ;
    //    Integer insuredId ;
    //    String imageurl;
    //}
    @Insert("insert into resofuser values(null,#{insuredId},#{imageurl})")
    public int addResofuser(Resofuser resofuser);

    @Insert("insert into reso values(null,#{insuredId},#{imageurl})")
    public int addResofuser2(Resofuser resofuser);

    @Update("update resofuser set insuredId=#{insuredId} ,imageurl=#{imageurl} where id =#{id};")
    public int updateResofuser(Resofuser resofuser);
    @Delete("delete from resofuser where id =#{id} ;")
    public int delResofuserById(Integer id );
    @Delete("delete from resofuser where insuredId =#{id} ;")
    public int delResofuserByinsuredld(Integer id );

    @Select("select (imageurl) from resofuser where insuredId = #{insuredId}")
    public ArrayList<String> selectthedatebyid(@Param("insuredId")String insuredId);

    @Select("select (imageurl) from reso where insuredId = #{insuredId}")
    public ArrayList<String> selectthedatebyid2(@Param("insuredId")String insuredId);

    @Select("select * from resofuser where id = #{id}")
    public Resofuser selectById( Integer id );
    @Select("select * from resofuser")
    public List<Resofuser> selectAll();
}
