package com.example.baoxian.serivce.impl;

import com.example.baoxian.mapper.InsureTableMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ScheduedServiceImpl {
    @Autowired
    private InsureTableMapper insureTableMapper;
    //秒 分 日 月 星期几
    @Scheduled(cron = "* * * * * ?")
    public void hello(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(date);
        insureTableMapper.guoqi(format.substring(0, 10));
    }
}
