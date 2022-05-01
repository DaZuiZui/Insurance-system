package com.example.baoxian;

import com.example.baoxian.mapper.ReasonTextMapper;
import com.example.baoxian.pojo.ReasonText;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class test04 {
    @Autowired
    ReasonTextMapper reasonTextMapper ;
    @Test
    public void test101P(){
        List<ReasonText> reasonTexts = reasonTextMapper.selectAll();
        reasonTexts.forEach(System.out::println);
    }

    @Test
    public void test02(){
        Integer integer = reasonTextMapper.addReasonText(new ReasonText(null, "4", 4));
    }

    @Test
    public void test03(){
        Integer integer = reasonTextMapper.delReasonTextById(3);
    }
    @Test
    public void test04(){
        Integer lisi= reasonTextMapper.updateReasonText(new ReasonText(2, "李四", 3));
        if (lisi >=  1){
            System.out.println(lisi);
            return;
        }
        System.out.println("更新失败");
    }


}
