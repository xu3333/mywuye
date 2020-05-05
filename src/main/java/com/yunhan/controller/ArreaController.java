package com.yunhan.controller;

import com.yunhan.entity.Arrearage;
import com.yunhan.entity.Users;
import com.yunhan.entity.pageCount;
import com.yunhan.entity.tableResult;
import com.yunhan.service.ArreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
@Controller
//@Controller：表示一个特定的类作为控制器
public class ArreaController {
    @Autowired
    //自动注入  自动引用bean里面的对象
    private ArreaService arreaService;
    @RequestMapping("arrearages")
    //用来表示http请求地址
    public String meter(){
        return "arreareport";
    }
    //查询数据
    @RequestMapping("selArea")
    @ResponseBody
    //不需要跳转路径  直接返回json数据  用于异步请求
    public tableResult<Map> listData(pageCount pageCount, Arrearage arrearage){
        tableResult<Map> result=new tableResult<>();
        List<Map> list=arreaService.selArea(pageCount,arrearage);
        //设置表格有多少条数据
        int count=arreaService.selCount(arrearage);
        result.setData(list);
        result.setCount(count);
        return result;
    }
}