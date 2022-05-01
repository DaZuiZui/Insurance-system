package com.example.baoxian.controller;

import com.example.baoxian.pojo.Resofuser;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.multipart.MultipartFile;

public interface ResofuserController {

    public String addResofuser(Resofuser resofuser);

    public String  updateResofuser(MultipartFile file ,Integer id ,Integer bxid);

    public String delResofuserById(Integer id );

    public String delResofuserByinsuredld(Integer id );

    public String selectById(Integer id );

    public String  selectAll();
}
