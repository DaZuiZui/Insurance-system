package com.example.baoxian.mapper;

import com.example.baoxian.pojo.InsureTable;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
@Mapper
@Component
public interface InsureTableMapper {
    @Delete("delete from insuretable where idcardoftheinsunred = #{idcard}")
    public void deltethedb(@Param("idcard") String idcard);

    @Select("SELECT (id) from insuretable where idcard =  #{idcard} order by id desc limit 1")
    public int selectmaxdata(@Param("idcard")String idcard);

    @Select("select *from insuretable where id = #{id}")
    public InsureTable querytheDateOfinsuredById(@Param("id") String id);

    @Insert("insert into insuretable values (null,#{demo},#{name},#{idcard},#{phoneNumber},#{email},#{city},#{phoneofnumber},#{idcardoftheinsunred},#{nameoftheinsured},#{benameoftheinsured},#{socialsecurity},#{times},#{username},#{money},'客户取消');")
    public int addInsureTable(InsureTable insureTable);

    @Delete("delete from insuretable where id =#{id}")
    public int deleteInsureTable(Integer id);

    // 通过id 修改 这条数据
    @Update("update insuretable  set demo = #{demo},name=#{name},idcard=#{idcard},phoneNumber=#{phoneNumber},email=#{email},city=#{city},phoneofnumber=#{phoneofnumber},idcardoftheinsunred=#{idcardoftheinsunred},benameoftheinsured=#{benameoftheinsured},socialsecurity=#{socialsecurity} where id =#{id}")
    public int updateInsureTableById(InsureTable insureTable);

    // 通过id 修改 这条数据
    @Update("update insuretable  set  state=#{state}  where id =#{id}")
    public int updateStateInsureTableById(@Param("state")String state,@Param("id")int id);

    @Select("select * from insuretable")
    public List<InsureTable> selectAll();

    @Select("select * from insuretable where username = #{username}")
    public ArrayList<InsureTable> selectInsureTableById(String username);

    @Update("update insuretable set state='已过期' where times < #{times}")
    public void guoqi(@Param("times") String times);

    @Select("select * from insuretable a where not exists (select * from insuretable b where b.idcard = a.idcard and a.id < b.id)")
    public ArrayList<InsureTable> chaxunquanbubeibaoren();
}
