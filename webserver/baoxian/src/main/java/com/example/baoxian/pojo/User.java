package com.example.baoxian.pojo;



import lombok.Data;

import java.io.Serializable;
@Data
public class User implements Serializable
{
    //id

    private int id;
    //账号
    private String username;
    //密码
    private String password;
    private String role;
    //Email
    private String email;
    //昵称
    private String name;
    //角色


}
