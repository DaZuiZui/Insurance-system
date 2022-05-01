package com.example.baoxian;

import com.example.baoxian.mapper.InsureTableMapper;
import com.example.baoxian.pojo.InsureTable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Test02 {
    @Autowired
    InsureTableMapper insureTableMapper;
    @Test
    public void testSelectAll(){
        for (InsureTable table : insureTableMapper.selectAll()) {
            System.out.println(table);
        }
    }



}
