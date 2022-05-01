package com.example.baoxian;

import com.example.baoxian.mapper.UserMapper;
import com.example.baoxian.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BaoxianApplicationTests {
    @Autowired
    UserMapper userMapper ;
    @Test
    void contextLoads() {
        List<User> asd = userMapper.selectAll();
        for (User user : asd) {
            System.out.println(user);
        }
    }
    @Test
    void contextLoads1() {
        List<User> asd = userMapper.selectUserByUsername("123456");
        for (User user : asd) {
            System.out.println(user);
        }
    }
    @Test
    void contextLoads3() {
        int n = userMapper.deleteUserByUsername("12345");
        System.out.println(n);
    }
    @Test
    void contextLoads4() {
        int n =userMapper.addUser("2","2","2","2","2");
        System.out.println(n);
    }

    @Test
    void contextLoads5() {
        int i = userMapper.updateUserPassword("123", "1");
        System.out.println(i);
    }

    @Test
    void contextLoads6() {
        int i = userMapper.updateUserEmail("20506@qq.com", "1");
        System.out.println(i);
    }

}
