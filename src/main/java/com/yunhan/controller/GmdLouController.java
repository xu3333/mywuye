package com.yunhan.controller;

import com.yunhan.entity.*;
import com.yunhan.service.GmdLouService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Controller
//@Controller：表示一个特定的类作为控制器
public class GmdLouController {
    @Autowired
    //自动注入  自动引用bean里面的对象
    //共同点：@Resource和@Autowired都是做bean的注入时使用，其实@Resource并不是Spring的注解，它的包是javax.annotation.Resource，需要导入，但是Spring支持该注解的注入。
    //不同点：@Autowired为Spring提供的注解，需要导入包org.springframework.beans.factory.annotation.Autowired;只按照byType（类型）注入。
    //两种注入方式  1. 用于字段上  2.用于set方法
    private GmdLouService gmdLouService;
    @RequestMapping("glou")
    //用来表示http请求地址
    public String glou (){
        return "glou";

    }
    @RequestMapping("gloulistDate")
    @ResponseBody  //不需要跳转路径  直接返回json数据  用于异步请求
    public tableResult<com.yunhan.entity.GmdLou> listData(pageCount pageCount, com.yunhan.entity.GmdLou gmdLou){

        tableResult<com.yunhan.entity.GmdLou> result=new tableResult<>();
        List<Map> list=gmdLouService.selectAll(pageCount,gmdLou);
        //设置表格有多少条数据
        int count=gmdLouService.selectCount(gmdLou);
        result.setData(list);
        result.setCount(count);
        return result;
    }

    //  //根据房间id禁用房间信息
    @RequestMapping("/delLou")
    @ResponseBody
    public tableResult<com.yunhan.entity.GmdLou> delLou(Integer buildingid){
        gmdLouService.delLou(buildingid);
        tableResult result=new tableResult();
        result.setMsg("禁用成功");
        return result;
    }

    //  //根据房间id启用房间信息
    @RequestMapping("/delqLou")
    @ResponseBody
    public tableResult<com.yunhan.entity.GmdLou> delqLou(Integer buildingid){
        gmdLouService.delqLou(buildingid);
        tableResult result=new tableResult();
        result.setMsg("启用成功");
        return result;
    }
    @RequestMapping("/addglou")
    public String add(){
        return "addglou";
    }
    @RequestMapping("/addLou")
    @ResponseBody
    public com.yunhan.entity.ResultOne<com.yunhan.entity.GmdLou> addLou(com.yunhan.entity.GmdLou gmdLou, String buildingname){

        int a=gmdLouService.selAddlou(buildingname);
        com.yunhan.entity.ResultOne result=new com.yunhan.entity.ResultOne();
        if(a>0){

            result.setMsg("已存在");
            result.setData(false);
            return  result;

        }else{
            gmdLouService.addLou(gmdLou);
           result.setMsg("添加成功");
            result.setData(true);
            return  result;
        }


    }
    @RequestMapping("/selbuildingid")
    public String selbuildingid(Integer buildingid, Model model){
       com.yunhan.entity.GmdLou gl=gmdLouService.selbuildingid(buildingid);
        model.addAttribute("gl",gl);
        return "gupdatelou";
    }
        //修改
    @RequestMapping("upLou")
    @ResponseBody
    public com.yunhan.entity.ResultOne<com.yunhan.entity.GmdLou> upLou(com.yunhan.entity.GmdLou gmdLou, String buildingname){
        com.yunhan.entity.ResultOne result=new com.yunhan.entity.ResultOne();

            gmdLouService.upLou(gmdLou);
            result.setMsg("修改成功");
            result.setData(true);
            return  result;



    }






}
