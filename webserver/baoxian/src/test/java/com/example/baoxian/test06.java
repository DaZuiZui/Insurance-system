package com.example.baoxian;

import com.example.baoxian.mapper.ResofuserMapper;
import com.example.baoxian.pojo.Resofuser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class test06 {
    @Autowired
    ResofuserMapper resofuserMapper ;
    @Test
    public void test01(){
        List<Resofuser> resofusers = resofuserMapper.selectAll();
        resofusers.forEach(System.out::println);
    }

    @Test
    public void test02(){
        for (int i = 0; i <25 ; i++) {
            resofuserMapper.addResofuser(new Resofuser(null,8,"aacc"));
        }
    }
    @Test
    public void test03(){
        resofuserMapper.updateResofuser(new Resofuser(1,3,"woshizhaojia"));
    }
    @Test
    public void test04(){
        int i = resofuserMapper.delResofuserById(2);
        System.out.println(i);
    }

    @Test
    public void test05(){
        int i = resofuserMapper.delResofuserByinsuredld(3);
        System.out.println(i);
    }

    @Test
    public void test06(){
        System.out.println(resofuserMapper.selectById(40));
    }
}
