package com.example.baoxian.serivce;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.example.baoxian.mapper.InsureTableMapper;
import com.example.baoxian.pojo.InsureTable;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
@Service
public class InsureTableServse {
    @Autowired
    InsureTableMapper insureTableMapper ;
    public String deltethedb( String idcard){
        insureTableMapper.deltethedb(idcard);
            return "true";
    }

    public int addInsureTable(InsureTable insureTable){
       return insureTableMapper.addInsureTable(insureTable);
    }

    public int selectmaxdata(String idcard){
       return insureTableMapper.selectmaxdata(idcard);
    }

    public int deleteInsureTable(Integer id){
        return insureTableMapper.deleteInsureTable(id);
    }

    // 通过id 修改 这条数据
   public int updateInsureTableById(InsureTable insureTable){
        return insureTableMapper.updateInsureTableById(insureTable);
   }

   public List<InsureTable> selectAll(){
        return insureTableMapper.selectAll();
   }


    public ArrayList<InsureTable> selectInsureTableById(String username){

        return insureTableMapper.selectInsureTableById(username);
    }


    public ArrayList<InsureTable> chaxunquanbubeibaoren(){
        return insureTableMapper.chaxunquanbubeibaoren();
    }

    /**
     * 通过id查询指定数据
     * @param id
     * @return
     */
    public String querytheDateOfinsuredById(@RequestParam("id") String id){
        return JSONArray.toJSONString(insureTableMapper.querytheDateOfinsuredById(id));
    }

    public String UpdateState(Integer id , String state){
        int i = insureTableMapper.updateStateInsureTableById(state,id);
        if (i>=1){
            return JSON.toJSONString(true);
        }else {
            return JSON.toJSONString(false);
        }
    }


}
