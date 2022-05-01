package com.example.baoxian.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InsureTable implements Serializable {
    int id ;
    String demo ;
    String times;
    String username;
    double money;
    String name ;
    String state;
    //身份证号
    String idcard;
//手机号
    String phoneNumber;
//投保人邮箱
    String email ;
//投保人常驻城市
    String city ;
//被投保人手机号
    String phoneofnumber;
//被投保人身份证
    String idcardoftheinsunred;
//被投保人姓名
    String nameoftheinsured;
//为谁投保
    String benameoftheinsured;
///是否拥有社保
    String socialsecurity;
}
