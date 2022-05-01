package com.example.baoxian.controller;

import com.example.baoxian.pojo.ReasonText;

public interface ReasonTextController {
    public String addReasonText(ReasonText reasonText);
    public String delReasonTextById(Integer id);
    public  String updateReasonText(ReasonText reasonText);
    public String  setlectReasonTextById(int id) ;
    public String selectAll() ;
}
