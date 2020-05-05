package com.yunhan.controller;
import com.yunhan.entity.*;
import com.yunhan.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class RepairController {
    @Autowired
    private RepairService repairService;
    @RequestMapping("repairList")
    public String meter(){
        return "repairList";
    }
//    查询数据
       @RequestMapping("listDataRepair")
   @ResponseBody
    public tableResult<Map> listData(pageCount pageCount, RepairList repairList){

       tableResult<Map> result=new tableResult<>();
       List<Map> list=repairService.selectAll(pageCount,repairList);
       //设置表格有多少条数据
       int count=repairService.selectCount(repairList);
       result.setData(list);
       result.setCount(count);
       return result;
    }
    //添加数据
    @RequestMapping("/addRepair")
    public String add(RepairList repairList,Model model){
        List<RepairList> rc=repairService.cselRoom(repairList);
        model.addAttribute("rc",rc);
        return "addRepair";
    }
    @RequestMapping("/addRepairList")
    @ResponseBody
    public tableResult<RepairList> addRepairList(RepairList repairList){
        repairService.addRepairList(repairList);
        tableResult result = new tableResult();
        //添加成功页面显示
        result.setMsg("添加成功");
        return result;
    }


    //页面回显
    @RequestMapping("/selectRepairListById")
    public String selectRepairListById(Integer repairListId, Model model,ComplaintSuggestion complaintSuggestion){
        RepairList repairList=repairService.selectRepairListById(repairListId);
        model.addAttribute("repairList",repairList);
        List<ComplaintSuggestion> nname=repairService.selectUser(complaintSuggestion);
        model.addAttribute("nname",nname);
        return "repairSl";
    }
    @RequestMapping("/updateSl")
    @ResponseBody
    public tableResult<RepairList> updateSl(RepairList repairList){
        repairService.updateSl(repairList);
        tableResult result=new tableResult();
        //修改成功页面显示
        result.setMsg("修改成功！");
        return result;
    }
    //页面回显
    @RequestMapping("/selectRepairListById2")
    public String selectRepairListById2(Integer repairListId, Model model,ComplaintSuggestion complaintSuggestion){
        RepairList repairList=repairService.selectRepairListById2(repairListId);
        model.addAttribute("repairList",repairList);
        List<ComplaintSuggestion> nname=repairService.selectUser(complaintSuggestion);
        model.addAttribute("nname",nname);
        return "repairSf";
    }
    @RequestMapping("/updateSf")
    @ResponseBody
    public tableResult<RepairList> updateSf(RepairList repairList){
        repairService.updateSf(repairList);
        tableResult result=new tableResult();
        //修改成功页面显示
        result.setMsg("修改成功！");
        return result;
    }
    //页面回显
    @RequestMapping("/selectRepairListById3")
    public String selectRepairListById3(Integer repairListId, Model model,ComplaintSuggestion complaintSuggestion){
        RepairList repairList=repairService.selectRepairListById3(repairListId);
        model.addAttribute("repairList",repairList);
        List<ComplaintSuggestion> nname=repairService.selectUser(complaintSuggestion);
        model.addAttribute("nname",nname);
        return "repairYwwc";
    }
    @RequestMapping("/updateYwwc")
    @ResponseBody
    public tableResult<RepairList> updateYwwc(RepairList repairList){
        repairService.updateYwwc(repairList);
        tableResult result=new tableResult();
        //修改成功页面显示
        result.setMsg("修改成功！");
        return result;
    }
    //页面回显
    @RequestMapping("/selectRepairListById4")
    public String selectRepairListById4(Integer repairListId, Model model){
        RepairList repairList=repairService.selectRepairListById4(repairListId);
        model.addAttribute("repairList",repairList);
        return "repairXq";
    }
    @RequestMapping("/repairXq")
    @ResponseBody
    public tableResult<RepairList> repairXq(RepairList repairList){
        repairService.updateYwwc(repairList);
        tableResult result=new tableResult();
        //修改成功页面显示
        result.setMsg("修改成功！");
        return result;
    }
    @RequestMapping("/deleteRepairList")
    @ResponseBody
    public tableResult<RepairList> deleteRepairList (Integer repairListId){
        repairService.deleteRepairList(repairListId);
        tableResult result=new tableResult();
        //删除提示
        result.setMsg("删除成功！");
        return  result;
    }



    //车位绑定时通过房间查询客户
    @RequestMapping("cselC")
    @ResponseBody
    public ResultOne<RepairList> cselC(RepairList repairList,Integer roomid,Model model){
       RepairList repairList1=new RepairList();
        List<RepairList> gc=repairService.cselC(roomid);
        String clientname= gc.get(0).getClientname();
        System.out.print(clientname);
        ResultOne result=new ResultOne();
        result.setData(clientname);
        return result;
    }



}
