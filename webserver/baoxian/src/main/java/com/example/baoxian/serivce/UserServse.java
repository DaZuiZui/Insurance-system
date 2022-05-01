package com.example.baoxian.serivce;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.example.baoxian.mapper.UserMapper;
import com.example.baoxian.pojo.User;
import com.example.baoxian.tuils.JwtUtil;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServse {
    @Autowired
    UserMapper userMapper ;


    //添加一条记录
    public int addUser(String username,String password,String role,String email,String name){
        System.out.println("Asd");
        return userMapper.addUser(username,password,role,email,name);
    }

    //修改密码
    public int updateUserPassword(String password,String username){
        return userMapper.updateUserPassword(password,username);
    }

    //修改 邮箱
    public int updateUserEmail(String email,String username){
        return userMapper.updateUserEmail(email,username);
    }

    //修改 用户名称

    public int updateUser(User user){
        return userMapper.updateUserName(user);
    }

    // 查询列表

    public List<User> selectAll(){
        return userMapper.selectAll();
    }

    public List<User> selectUserByUsername(String username){
        return userMapper.selectUserByUsername(username);
    }

    public String selectUserByUsernameAndPassword(String username ,String password){
        User user = userMapper.selectUserByUsernameAndPassword(username, password);
        if (user == null) {
            return "false";
        }
        String jwt = JwtUtil.createJWT(user);
        return JSONArray.toJSONString(jwt);


    }


    public int deleteUserByUsername(String username){
        return userMapper.deleteUserByUsername(username);
    }


    public String SelectUserByUsername(String username){
        User user = userMapper.selectUserByUserName(username);
        return   JSON.toJSONString(user);
    }

}
