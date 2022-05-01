package com.example.baoxian.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.baoxian.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserMapper{


    //添加一条记录
    @Insert("insert into userS value (#{username},#{password},#{role},#{email},#{name})")
    public int addUser(String username,String password,String role,String email,String name);

    //修改密码
    @Update("update userS set password=#{password} where username =#{username}")
    public int updateUserPassword(String password,String username);

    //修改 邮箱
    @Update("update userS set email=#{email} where username =#{username}")
    public int updateUserEmail(String email,String username);

    //修改 用户名称
    @Update("update userS set name=#{name},role=#{role},email=#{email},password=#{password} where username =#{username}")
    public int updateUserName(User user);

    // 查询列表
    @Select("select * from userS")
    public List<User> selectAll();
    @Select("select * from userS where username = #{username}")
    public List<User> selectUserByUsername(String username);
    @Select("select * from userS where username = #{username} and password =#{password}")
    public User selectUserByUsernameAndPassword(String username ,String password);

    @Delete("delete  from userS where username = #{username}")
    public int deleteUserByUsername(@Param("username") String username);

    @Select("select * from userS where username = #{username}")
    public User selectUserByUserName(String username);


}
