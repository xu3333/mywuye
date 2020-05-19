package com.yunhan.controller;

import com.yunhan.entity.*;
import com.yunhan.service.GmdClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;


@Controller
//@Controller：表示一个特定的类作为控制器
public class GmdClientController {
    @Autowired
    //自动注入  自动引用bean里面的对象
    //共同点：@Resource和@Autowired都是做bean的注入时使用，其实@Resource并不是Spring的注解，它的包是javax.annotation.Resource，需要导入，但是Spring支持该注解的注入。
    //不同点：@Autowired为Spring提供的注解，需要导入包org.springframework.beans.factory.annotation.Autowired;只按照byType（类型）注入。
    //两种注入方式  1. 用于字段上  2.用于set方法
    private GmdClientService gmdClientService;
    @RequestMapping("gclient")
    //用来表示http请求地址
    public String meter(){
        return  "gclient";
    }
    //   查询数据
    @RequestMapping("gclistData")
    @ResponseBody //不需要跳转路径  直接返回json数据  用于异步请求
    public tableResult<Map> listData(pageCount pageCount, com.yunhan.entity.GmdClient gmdClient){

        tableResult<Map> result=new tableResult<>();
        List<Map> list=gmdClientService.selectAll(pageCount,gmdClient);
        //设置表格有多少条数据
        int count=gmdClientService.selectCount(gmdClient);
        result.setData(list);
        result.setCount(count);
        return result;
    }

    @RequestMapping("addgclient")
    public String addgclient(com.yunhan.entity.GmdClient gmdClient, Model model){
       List<com.yunhan.entity.GmdClient> ed= gmdClientService.seleducation(gmdClient);
       model.addAttribute("ed",ed);
        return "addgclient";
    }

    //执行添加
    @RequestMapping("/addClient")
    @ResponseBody
    public com.yunhan.entity.ResultOne<com.yunhan.entity.GmdClient> addClient(com.yunhan.entity.GmdClient gmdClient){
        com.yunhan.entity.ResultOne result=new com.yunhan.entity.ResultOne();
       int a= gmdClientService.selAddc(gmdClient);
        if(a>0){
            result.setMsg("用户已存在");
            result.setData(false);

        }else {
            gmdClientService.addBank(gmdClient);
            gmdClientService.addClient(gmdClient);
            gmdClientService.addRelat(gmdClient);

            result.setMsg("添加成功");
            result.setData(true);
        }
        return result;
    }

//    @RequestMapping("/delClient")
//    @ResponseBody
//    public tableResult<com.yunhan.entity.GmdClient> delClient(Integer clientmessageid){
//        gmdClientService.delClient(clientmessageid);
//        tableResult result=new tableResult();
//        result.setMsg("删除成功");
//        return result;
//
//    }

    //修改时查询
    @RequestMapping("/selUpClient")
    public String selUpClient(Integer clientmessageid, Model model, com.yunhan.entity.GmdClient gmdClient){
        List<com.yunhan.entity.GmdClient> gc= gmdClientService.selUpClient(clientmessageid);
        List<com.yunhan.entity.GmdClient> ge= gmdClientService.seleducation(gmdClient);
        List<com.yunhan.entity.GmdClient>gb=gmdClientService.selBank(gmdClient);
        model.addAttribute("gc",gc);
        model.addAttribute("ge",ge);
        model.addAttribute("gb",gb);
        return "gupdateclient";

    }
    //修改时查询
    @RequestMapping("/selxqClient")
    public String selxqClient(Integer clientmessageid, Model model, com.yunhan.entity.GmdClient gmdClient){
        List<com.yunhan.entity.GmdClient> gc= gmdClientService.selUpClient(clientmessageid);
        List<com.yunhan.entity.GmdClient> ge= gmdClientService.seleducation(gmdClient);
        List<com.yunhan.entity.GmdClient>gb=gmdClientService.selBank(gmdClient);
        model.addAttribute("gc",gc);
        model.addAttribute("ge",ge);
        model.addAttribute("gb",gb);
        return "gclientxq";

    }
    //执行修改
    @RequestMapping("upClient")
    @ResponseBody
    public com.yunhan.entity.ResultOne<com.yunhan.entity.GmdClient> upClient(com.yunhan.entity.GmdClient gmdClient){
        com.yunhan.entity.ResultOne result=new com.yunhan.entity.ResultOne();
        int a= gmdClientService.selAddc(gmdClient);

            gmdClientService.upRelation(gmdClient);
            gmdClientService.upClient(gmdClient);
            result.setMsg("修改成功");
            result.setData(true);

        return result;

    }



}
