package com.example.baoxian.controller;

import com.alibaba.fastjson.JSONArray;
import com.example.baoxian.pojo.User;
import com.example.baoxian.serivce.UserServse;
import com.example.baoxian.tuils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
    //插入修改   post
    @Autowired
    UserServse userServse ;

    @PostMapping("/UpdateTheUser")
    public String updateUserDate(@RequestBody User user){
        userServse.updateUser(user);
        return "true";
    }


    @GetMapping("/selectAllUser")
    public String selectAll(){
        return JSONArray.toJSONString(userServse.selectAll());
    }

    @GetMapping("/deleleTheUser")
    public String deleteUserByUsername(@RequestParam("username") String username){
        System.out.println(username);
        userServse.deleteUserByUsername(username);
        return "true";
    }
    /**
     * 生成jwt  登入的时候使用
     * @param user
     * @return
     *
     * out
     */
    @PostMapping("/user/login")
    public String creaJwt(@RequestBody User user){
        String jwt = JwtUtil.createJWT(user);
        return jwt;
    }

    /**
     * 通过token解析出来的username
     * @param token
     * @return
     */
    @GetMapping("/jiexiJWT")
    public String jwixijwt(@RequestParam("token") String token){
        String username = JwtUtil.analysisJWT(token);
        return username;
    }

    @GetMapping("/jiexiJWTforid")
    public String jwixijwtforid(@RequestParam("token") String token){
        String username = JwtUtil.analysisJWT(token);
        return username;
    }


    @PostMapping("/adduser")
    public String addUser(@RequestBody User user){
        System.out.println(user.getName());
        try {
            int i = userServse.addUser(user.getUsername(), user.getPassword(),"user", user.getEmail(), user.getName());
            System.err.println("Asd");
            return "true";
        } catch (Exception e) {
            return "false";
        }

    }
    @PostMapping("/login")
    public String login(@RequestBody User user){
        System.out.println(user);
       return userServse.selectUserByUsernameAndPassword(user.getUsername(),user.getPassword());
    }


    @GetMapping("/getUser")
    public String getUser(@RequestParam String username){
        return userServse.SelectUserByUsername(username);
    }
}

