package com.example.baoxian.serivce;

import com.example.baoxian.pojo.ReasonText;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ReasonTextService {
    public String addReasonText(ReasonText reasonText);
    public String delReasonTextById(Integer id);
    public  String updateReasonText(ReasonText reasonText);
    public String  setlectReasonTextById(int id) ;
    public String selectAll() ;

}
