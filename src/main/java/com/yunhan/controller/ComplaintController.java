package com.yunhan.controller;


import com.yunhan.entity.*;
import com.yunhan.service.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class ComplaintController {
    @Autowired
    private ComplaintService complaintService;
    @RequestMapping("complaintSuggestion")
    public String meter(){
        return "complaintSuggestion";
    }
//    查询数据
   @RequestMapping("listData2")
   @ResponseBody
    public tableResult<Map> listData2(pageCount pageCount, ComplaintSuggestion complaintSuggestion){

       tableResult<Map> result=new tableResult<>();
       List<Map> list=complaintService.selectAll(pageCount,complaintSuggestion);
       //设置表格有多少条数据
       int count=complaintService.selectCount(complaintSuggestion);
       result.setData(list);
       result.setCount(count);
       return result;
    }

    //添加数据
    @RequestMapping("/addComplaint")
    public String addComplaint(ComplaintSuggestion complaintSuggestion,Model model){

        List<ComplaintSuggestion> rcs=complaintService.cselRooms(complaintSuggestion);
        model.addAttribute("rcs",rcs);
        return "addComplaint";
    }
    @RequestMapping("/add_do2")
    @ResponseBody
    public tableResult<ComplaintSuggestion> add_do2(ComplaintSuggestion complaintSuggestion){
        complaintService.add_do2(complaintSuggestion);
        tableResult result = new tableResult();
        //添加成功页面显示
        result.setMsg("添加成功");
        return result;
    }
    //页面回显

    @RequestMapping("/selectComplaintSuggestionById")
    public String selectComplaintSuggestionById(Integer complaintSuggestionId, Model model){
        ComplaintSuggestion complaintSuggestion=complaintService.selectComplaintSuggestionById(complaintSuggestionId);
        model.addAttribute("complaintSuggestion",complaintSuggestion);
        List<ComplaintSuggestion> nName=complaintService.selectUser(complaintSuggestion);
        model.addAttribute("nName",nName);
        return "updateComplaint";
    }
    @RequestMapping("/updateComplaint")
    @ResponseBody
    public tableResult<ComplaintSuggestion> updateComplaint(ComplaintSuggestion complaintSuggestion){
        complaintService.updateComplaint(complaintSuggestion);
        tableResult result=new tableResult();
        //修改成功页面显示
        result.setMsg("修改成功！");
        return result;
    }

    @RequestMapping("/selectComplaintSuggestionById2")
    public String selectComplaintSuggestionById2(Integer complaintSuggestionId, Model model){
        ComplaintSuggestion complaintSuggestion=complaintService.selectComplaintSuggestionById2(complaintSuggestionId);
        model.addAttribute("complaintSuggestion",complaintSuggestion);
        List<ComplaintSuggestion> nName=complaintService.selectUser(complaintSuggestion);
        model.addAttribute("nName",nName);
        return "updateComplaint2";
    }
    @RequestMapping("/updateComplaint2")
    @ResponseBody
    public tableResult<ComplaintSuggestion> updateComplaint2(ComplaintSuggestion complaintSuggestion){
        complaintService.updateComplaint2(complaintSuggestion);
        tableResult result=new tableResult();
        //修改成功页面显示
        result.setMsg("修改成功！");
        return result;
    }

    @RequestMapping("/delete2")
    @ResponseBody
    public tableResult<ComplaintSuggestion> delete2 (Integer complaintSuggestionId){
        complaintService.delete2(complaintSuggestionId);
        tableResult result=new tableResult();
        //删除提示
        result.setMsg("删除成功！");
        return  result;
    }
}
