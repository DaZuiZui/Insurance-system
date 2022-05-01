package com.example.baoxian.serivce;

import com.example.baoxian.pojo.Resofuser;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface ResofuserService{
    public String getALllist2(String insuredId);
    public String addResofuser2(Resofuser resofuser);

    public String addResofuser(Resofuser resofuser);

    public String  updateResofuser(Resofuser resofuser);

    public String delResofuserById(Integer id );

    public String delResofuserByinsuredld(Integer id );

    public String selectById(Integer id );

    public String  selectAll();

    public String getALllist(String insuredId);
}
