package com.yunhan.controller;
import com.yunhan.entity.Collectreport;
import com.yunhan.entity.tableResult;
import com.yunhan.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.yunhan.entity.pageCount;
import java.util.List;
import java.util.Map;

@Controller
//@Controller：表示一个特定的类作为控制器
public class CollectController {
    @Autowired
    //自动注入  自动引用bean里面的对象
    private CollectService collectService;
    @RequestMapping("feereports")
    //用来表示http请求地址
    public String meter(){
        return "feereport";
    }
    @RequestMapping("selcol")
    @ResponseBody
    //不需要跳转路径  直接返回json数据  用于异步请求
    public tableResult<Map> selcol(pageCount pageCount,Collectreport collectreport){
        tableResult<Map> result=new tableResult<>();
        String aaa=collectreport.getTesth();
        String Cbegin="";
        String Cend="";
        if(aaa!="" && aaa!=null){
            String arr[]= aaa.split("~");
            Cbegin=arr[0];
            Cend=arr[1];
        }
        collectreport.setCbegin(Cbegin);
        collectreport.setCend(Cend);
        List<Map> listcol=collectService.selcol(pageCount,collectreport);
        int colcount=collectService.selcolCount(collectreport);
        result.setData(listcol);
        result.setCount(colcount);
        return result;
    }
}
