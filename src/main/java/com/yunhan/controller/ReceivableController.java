package com.yunhan.controller;
import com.yunhan.entity.*;
import com.yunhan.service.ReceivableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class ReceivableController {
    @Autowired
    private ReceivableService receivableService;
    @RequestMapping("receivable")
    public String meter(){
        return "receivable";
    }
//    查询数据
   @RequestMapping("listDataReceivable")
   @ResponseBody
    public tableResult<Map> listData(pageCount pageCount, Receivable receivable){

       tableResult<Map> result=new tableResult<>();
       List<Map> list=receivableService.selectAll(pageCount,receivable);
       //设置表格有多少条数据
       int count=receivableService.selectCount(receivable);
       result.setData(list);
       result.setCount(count);
       return result;
    }
}
