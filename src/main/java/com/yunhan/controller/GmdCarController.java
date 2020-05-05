package com.yunhan.controller;


import com.yunhan.entity.GmdCar;
import com.yunhan.entity.pageCount;
import com.yunhan.entity.tableResult;
import com.yunhan.service.GmdCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;
import java.util.Map;

@Controller
//@Controller：表示一个特定的类作为控制器
public class GmdCarController {
    @Autowired
    //自动注入  自动引用bean里面的对象
    //共同点：@Resource和@Autowired都是做bean的注入时使用，其实@Resource并不是Spring的注解，它的包是javax.annotation.Resource，需要导入，但是Spring支持该注解的注入。
    //不同点：@Autowired为Spring提供的注解，需要导入包org.springframework.beans.factory.annotation.Autowired;只按照byType（类型）注入。
    //两种注入方式  1. 用于字段上  2.用于set方法
    private GmdCarService gmdCarService;

    @RequestMapping("/gcar")
    //用来表示http请求地址
    public String gcar(){
        return "gcar";
    }

    @RequestMapping("gcarlistDate")
    @ResponseBody //不需要跳转路径  直接返回json数据  用于异步请求
    public tableResult<GmdCar> listData(pageCount pageCount, com.yunhan.entity.GmdCar gmdCar){
        tableResult<GmdCar> result=new tableResult<>();
        List<Map> list=gmdCarService.selectAllcar(pageCount,gmdCar);
        //设置表格有多少条数据
        int count=gmdCarService.selectCountcar(gmdCar);
        result.setData(list);
        result.setCount(count);
        return result;
    }

    //  //根据房间id禁用信息
    @RequestMapping("/delCar")
    @ResponseBody
    public tableResult<GmdCar> delCar(Integer carportid){
        gmdCarService.delRoom(carportid);
        tableResult result=new tableResult();
        result.setMsg("禁用成功");
        return result;
    }
    //  //根据房间id启用房间信息
    @RequestMapping("/delqCar")
    @ResponseBody
    public tableResult<GmdCar> delqCar(Integer carportid){
        gmdCarService.delqCar(carportid);
        tableResult result=new tableResult();
        result.setMsg("启用成功");
        return result;
    }
    //查询车位信息表
    @RequestMapping("selCarportT")
    public String selCarportT(com.yunhan.entity.GmdCar gmdCar, Model model){
        List<com.yunhan.entity.GmdCar> gc=gmdCarService.selCarportT(gmdCar);
        model.addAttribute("gc",gc);
        return "addgcar";
    }
    //添加车位信息
    @RequestMapping("/addCar")
    @ResponseBody
    public com.yunhan.entity.ResultOne<com.yunhan.entity.GmdCar> addCar(com.yunhan.entity.GmdCar gmdCar, String carportno){
        int a= gmdCarService.selAddcar(carportno);
        System.out.print(a);
        com.yunhan.entity.ResultOne result=new com.yunhan.entity.ResultOne();


       if(a>0){
           result.setMsg("车位已存在");
           result.setData(false);
           return  result;
       }
        else {
           gmdCarService.addCar(gmdCar);
           result.setMsg("添加成功");
           result.setData(true);
           return result;
       }
    }
    //修改时查询
    @RequestMapping("selcUp")
    public String selcUp(com.yunhan.entity.GmdCar gmdCar, Model model, Integer carportid){
        List<com.yunhan.entity.GmdCar> ss=gmdCarService.selCarportT(gmdCar);
       List<com.yunhan.entity.GmdCar> sc= gmdCarService.selcUp(carportid);
        model.addAttribute("sc",sc);
        model.addAttribute("ss",ss);
        return "gupdatecar";

    }
    //执行修改
    @RequestMapping("UpCar")
    @ResponseBody
    public com.yunhan.entity.ResultOne<com.yunhan.entity.GmdCar> UpCar(com.yunhan.entity.GmdCar gmdCar, String carportno){
        com.yunhan.entity.ResultOne result=new com.yunhan.entity.ResultOne();
        int a=gmdCarService.selAddcar(carportno);
        if(a>0){
            result.setMsg("已存在无法修改");
            result.setData(false);
            return result;
        }else {
            gmdCarService.UpCar(gmdCar);
            result.setMsg("修改成功");
            result.setData(true);
            return  result;
        }

    }
    //跳转车位绑定页面  查询车位类型表
    //查询车位编号与车位类型
    @RequestMapping("addgbtncar")
    public String addgbtncar(com.yunhan.entity.GmdCar gmdCar, Model model, Integer carportid){
        List<com.yunhan.entity.GmdCar> gsb=gmdCarService.selBtncar(carportid);
        List<com.yunhan.entity.GmdCar> gsc=gmdCarService.selCarportT(gmdCar);
        List<com.yunhan.entity.GmdCar> rc=gmdCarService.selRc(gmdCar);
        model.addAttribute("gsb",gsb);
        model.addAttribute("gsc",gsc);
        model.addAttribute("rc",rc);
        return "addgbtncar";
    }
//车位绑定时通过房间查询客户
    @RequestMapping("selC")
    @ResponseBody
    public com.yunhan.entity.ResultOne<com.yunhan.entity.GmdCar> selC(com.yunhan.entity.GmdCar gmdCar, String roomno, Model model){
        com.yunhan.entity.GmdCar gmdCar1=new com.yunhan.entity.GmdCar();
        List<com.yunhan.entity.GmdCar> gc=gmdCarService.selC(roomno);
        String clientname= gc.get(0).getClientname();
        com.yunhan.entity.ResultOne result=new com.yunhan.entity.ResultOne();
        result.setData(clientname);
        return result;
    }
    //执行车位绑定
    @RequestMapping("upBtn")
    @ResponseBody
    public com.yunhan.entity.ResultOne<com.yunhan.entity.GmdCar> upBtn(com.yunhan.entity.GmdCar gmdCar, Integer carportid){
        gmdCarService.upWei(gmdCar);
        gmdCarService.upBtncar(gmdCar);
        gmdCarService.upcCarp(gmdCar);
        gmdCarService.upBtn(gmdCar);
        gmdCarService.upCarp(carportid);

        com.yunhan.entity.ResultOne result=new com.yunhan.entity.ResultOne();
        result.setMsg("修改成功");
        return  result;
    }


}
