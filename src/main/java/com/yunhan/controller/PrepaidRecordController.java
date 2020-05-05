package com.yunhan.controller;

import com.yunhan.entity.PrepaidRecord;
import com.yunhan.entity.pageCount;
import com.yunhan.entity.tableResult;
import com.yunhan.service.PrepaidRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class PrepaidRecordController {
    @Autowired
    private PrepaidRecordService prepaidRecordService;
    @RequestMapping("prepaidRecord")
    public String meter(){
        return "prepaidRecord";
    }
//    查询数据
   @RequestMapping("listData3")
   @ResponseBody
    public tableResult<Map> listData(pageCount pageCount, PrepaidRecord prepaidRecord){

       tableResult<Map> result=new tableResult<>();
       List<Map> list=prepaidRecordService.selectAll(pageCount,prepaidRecord);
       //设置表格有多少条数据
       int count=prepaidRecordService.selectCount(prepaidRecord);
       result.setData(list);
       result.setCount(count);
       return result;
    }
}
