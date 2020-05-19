package com.yunhan.controller;

import com.yunhan.entity.Payment;
import com.yunhan.entity.pageCount;
import com.yunhan.entity.tableResult;
import com.yunhan.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @RequestMapping("jiaofei")
    public String meter(){
        return "payment";
    }
    @RequestMapping("sell")
    @ResponseBody
    public tableResult<Map> sell(pageCount pageCount, Payment Payment){
        tableResult<Map> result=new tableResult<>();
        List<Map> list=paymentService.sell(pageCount,Payment);
        //设置表格有多少条数据
        int count=paymentService.sellCount(Payment);
        result.setData(list);
        result.setCount(count);
        return result;
    }
    @RequestMapping("/selOne")
    public String selOne(Integer roomid, Model model){
        Payment payment=paymentService.selOne(roomid);
        model.addAttribute("payment",payment);
        return "updates";
    }
    @RequestMapping("/updates")
    @ResponseBody
    public tableResult<Payment> update(Payment payment){
        paymentService.updates(payment);
        tableResult result=new tableResult();
        //修改成功页面显示
        result.setMsg("修改成功！");
        return result;
    }
}
