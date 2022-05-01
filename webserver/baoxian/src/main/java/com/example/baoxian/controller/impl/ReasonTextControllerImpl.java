package com.example.baoxian.controller.impl;

import com.alibaba.fastjson.JSON;
import com.example.baoxian.controller.ReasonTextController;
import com.example.baoxian.pojo.ReasonText;
import com.example.baoxian.serivce.ReasonTextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/reasontext")
public class ReasonTextControllerImpl implements ReasonTextController {
    @Autowired
    ReasonTextService reasonTextService ;
    @Override
    @PostMapping("/add")
    public String addReasonText(@RequestBody ReasonText reasonText) {
        System.out.println(reasonText);
            return reasonTextService.addReasonText(reasonText);

    }

    @Override
    @GetMapping("/del")
    public String delReasonTextById(Integer id) {
        try {
            return reasonTextService.delReasonTextById(id);
        }catch (Exception e){
            return JSON.toJSONString(false);
        }

    }

    @Override
    @PostMapping("/update")
    public String updateReasonText(ReasonText reasonText) {
        try {
            return reasonTextService.updateReasonText(reasonText);
        }catch (Exception e){
            return JSON.toJSONString(false);
        }

    }

    @Override
    @GetMapping("/selectbyid")
    public String setlectReasonTextById(int id) {

           return reasonTextService.setlectReasonTextById(id);


    }

    @Override
    @GetMapping("/getAll")
    public String selectAll() {
        try {
            return reasonTextService.selectAll();
        }catch (Exception e){
            return JSON.toJSONString(false);
        }

    }
}
