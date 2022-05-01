package com.example.baoxian.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.example.baoxian.pojo.InsureTable;
import com.example.baoxian.serivce.InsureTableServse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/insuretable")
public class InsureTableController {
    @Autowired
    InsureTableServse insureTableServse ;

    @GetMapping("/deletethedateindb")
    public String deltethedb(@RequestParam("idcard")String idcard){
        System.out.println(idcard);
        return insureTableServse.deltethedb(idcard);
    }

    @GetMapping("/selectlastdate")
    public String selectmaxdata(@RequestParam("idcard") String idcard){
        return JSONArray.toJSONString(insureTableServse.selectmaxdata(idcard));
    }

    @GetMapping("/selectAllbeibao")
    public String chaxunquanbubeibaoren(){
        return JSONArray.toJSONString(insureTableServse.chaxunquanbubeibaoren());
    }

    /**
     * 通过id查询指定数据
     * @param id
     * @return
     */
    @GetMapping("/querytheDateOfinsuredById")
    public String querytheDateOfinsuredById(@RequestParam("id") String id){
        return insureTableServse.querytheDateOfinsuredById(id);
    }

    @PostMapping("/add")
    public boolean addInsureTable(@RequestBody InsureTable insureTable){
        String str = insureTable.getTimes().substring(0,4);
        int year = Integer.valueOf(str) +1 ;
        insureTable.setTimes(year+""+insureTable.getTimes().substring(4,10));
        System.out.println(insureTable);
        try {
            return insureTableServse.addInsureTable(insureTable) >= 1;
        }catch (Exception e){
            return false;
        }
    }
    @GetMapping("/del")
    public boolean deleteInsureTable(@RequestParam Integer id){
        try {
            return insureTableServse.deleteInsureTable(id)>=1;
        }catch (Exception e){
            return false;
        }
    }

    @PostMapping("/update")
    public boolean updateInsureTableById(@RequestBody InsureTable insureTable){
        try {
            return insureTableServse.updateInsureTableById(insureTable)>=1;
        }catch (Exception e){
            return  false;
        }
    }

    @GetMapping("/selectId")
    public String  selectByid(@RequestParam String username){
        return JSON.toJSONString(insureTableServse.selectInsureTableById(username));
    }


    @GetMapping("/selectAll")
    public String  selectAll(){
        List<InsureTable> insureTables = insureTableServse.selectAll();
        System.out.println(insureTables);
        return JSON.toJSONString(insureTables);
    }

    @GetMapping("/updatestate")
    public String updateState(Integer id , String state){

    try {
        return  insureTableServse.UpdateState(id, state);
    }catch (Exception e){
        return JSON.toJSONString(false);
    }
    }


}
