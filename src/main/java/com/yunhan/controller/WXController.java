package com.yunhan.controller;

import com.yunhan.service.WXPriceService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/WX")
public class WXController {
    @Autowired
    WXPriceService wxPriceService;
    @GetMapping("/searchList")
    public Object searchList(String roomNo){
        return wxPriceService.searchList(roomNo);
    }
    @GetMapping("updateFee")
    public Object updateFee(@Param("roomID") Integer roomID, @Param("payproject") String payproject){
        return wxPriceService.updateFee(roomID, payproject);
    }
    @RequestMapping("addPayType")
    public Object addPayType(@Param("clientname") String clientname,@Param("assessment") double assessment){
        return wxPriceService.addPayType(clientname, assessment);
    }
}
