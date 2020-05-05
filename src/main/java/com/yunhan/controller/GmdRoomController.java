package com.yunhan.controller;

import com.yunhan.entity.*;
import com.yunhan.service.GmdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
//@Controller：表示一个特定的类作为控制器
public class GmdRoomController {
    @Autowired  //自动注入  自动引用bean里面的对象

    private GmdService gmdService;
    @RequestMapping("groom")  //用来表示http请求地址
    public String  meter(){
        return "groom";
    }
//   查询数据
    @RequestMapping("glistData")
    @ResponseBody //不需要跳转路径  直接返回json数据  用于异步请求
    public tableResult<Map> listData(pageCount pageCount, com.yunhan.entity.GmdRoom gmdRoom){

        tableResult<Map> result=new tableResult<>();
        List<Map> list=gmdService.selectAll(pageCount,gmdRoom);
        //设置表格有多少条数据
        int count=gmdService.selectCount(gmdRoom);
        result.setData(list);
        result.setCount(count);
        return result;
    }
//    //  //根据房间id删除房间信息
//    @RequestMapping("/delRoom")
//    @ResponseBody
//    public tableResult<com.yunhan.entity.GmdRoom> delRoom(Integer roomid){
//        gmdService.delRoom(roomid);
//        tableResult result=new tableResult();
//        result.setMsg("删除成功");
//        return result;
//    }
    //跳转添加页面
    @RequestMapping("/addroom")
    public String add(com.yunhan.entity.GmdRoom gmdRoom, Model model){
        List<com.yunhan.entity.GmdRoom> sb=gmdService.selB(gmdRoom);
        model.addAttribute("sb",sb);
        return "addgroom";
    }
    //根据单元号id查询楼层
    @RequestMapping("selBs")
    @ResponseBody
    public com.yunhan.entity.ResultOne<com.yunhan.entity.GmdRoom> selBs(Integer buildingid, com.yunhan.entity.GmdRoom gmdRoom){
        List<com.yunhan.entity.GmdRoom> gg=gmdService.selBs(buildingid);
        com.yunhan.entity.ResultOne result=new com.yunhan.entity.ResultOne();
         int loucengcount=gg.get(0).getLoucengcount();
        result.setData(loucengcount);
        return result;

    }

    //执行添加
    @RequestMapping("addRoom")
    @ResponseBody
    public com.yunhan.entity.ResultOne<com.yunhan.entity.GmdRoom> addRoom(com.yunhan.entity.GmdRoom gmdRoom){
        int a=gmdService.selAddr(gmdRoom);
        com.yunhan.entity.ResultOne result=new com.yunhan.entity.ResultOne();
        if(a>0){
            result.setMsg("已存在");
            result.setData(false);

        }else{
            gmdService.addLoucy(gmdRoom);
            gmdService.addRoom(gmdRoom);
            result.setMsg("添加成功");
            result.setData(true);

        }
        return  result;
    }
    //修改时查询
    @RequestMapping("upSel")

    public String upSelRoom(com.yunhan.entity.GmdRoom gmdRoom, Model model){
        //查询楼宇信息
        List<com.yunhan.entity.GmdRoom> gs=gmdService.selB(gmdRoom);
//        //查询楼层信息
//       List<GmdRoom> gu= gmdService.upSelly(gmdRoom);
        //查询房间信息
        List<com.yunhan.entity.GmdRoom> gr=gmdService.upSelRoom(gmdRoom);
        model.addAttribute("gs",gs);
//        model.addAttribute("gu",gu);
        model.addAttribute("gr",gr);
        return "upgroom";

    }
    //执行修改
    @RequestMapping("upRoom")
    @ResponseBody
    public com.yunhan.entity.ResultOne<com.yunhan.entity.GmdRoom> upRoom(com.yunhan.entity.GmdRoom gmdRoom){
        int a=gmdService.selAddr(gmdRoom);
        com.yunhan.entity.ResultOne result=new com.yunhan.entity.ResultOne();
        if(a>0){
            result.setMsg("已存在");
            result.setData(false);

        }else{
//           gmdService.upRlc(gmdRoom);
           gmdService.upRoom(gmdRoom);
            result.setMsg("修改成功");
            result.setData(true);

        }
        return  result;
    }
    //添加时查询单元号楼层号和客户信息
    @RequestMapping("addSel")
    public String addSel(com.yunhan.entity.GmdRoom gmdRoom, Model Model){
        //添加时查询的单元号和楼层号
       List<com.yunhan.entity.GmdRoom>ga= gmdService.addSellr(gmdRoom);
        //添加时查询客户姓名
        List<com.yunhan.entity.GmdRoom> gc=gmdService.addSelc(gmdRoom);
        Model.addAttribute("ga",ga);
        Model.addAttribute("gc",gc);
        return "addgbtnroom";

    }

    //执行添加并修改房间状态
    @RequestMapping("addBtnRoom")
    @ResponseBody
    public com.yunhan.entity.ResultOne<com.yunhan.entity.GmdRoom> addBtnRoom(com.yunhan.entity.GmdRoom gmdRoom){
        gmdService.addBtnroom(gmdRoom);
        com.yunhan.entity.ResultOne result=new com.yunhan.entity.ResultOne();
        result.setMsg("添加户主成功");
        return  result;

    }

}
