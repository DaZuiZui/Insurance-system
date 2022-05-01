package com.example.baoxian.serivce.impl;

import com.alibaba.fastjson.JSON;
import com.example.baoxian.mapper.ReasonTextMapper;
import com.example.baoxian.pojo.ReasonText;
import com.example.baoxian.serivce.ReasonTextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReasonTextServiceImpl implements ReasonTextService {
    @Autowired
    ReasonTextMapper reasonTextMapper ;

    @Override
    public String addReasonText(ReasonText reasonText) {
        int i = reasonTextMapper.addReasonText(reasonText);

        if (i >=1 ){
            return JSON.toJSONString(true);
        }else {
            return JSON.toJSONString(false);
        }
    }

    @Override
    public String delReasonTextById(Integer id) {
        int i = reasonTextMapper.delReasonTextById(id);
        if (i >=1 ){
            return JSON.toJSONString(true);
        }else {
            return JSON.toJSONString(false);
        }
    }

    @Override
    public String updateReasonText(ReasonText reasonText) {
        int i = reasonTextMapper.updateReasonText(reasonText);
        if (i >=1 ){
            return JSON.toJSONString(true);
        }else {
            return JSON.toJSONString(false);
        }
    }

    @Override
    public String setlectReasonTextById(int id) {

        return JSON.toJSONString(reasonTextMapper.setlectReasonTextById(id));
    }

    @Override
    public String selectAll() {
        return JSON.toJSONString(reasonTextMapper.selectAll());
    }
}
