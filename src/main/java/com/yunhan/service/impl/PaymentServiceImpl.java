package com.yunhan.service.impl;

import com.yunhan.entity.Payment;
import com.yunhan.entity.pageCount;
import com.yunhan.mapper.PaymentMapper;
import com.yunhan.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentMapper paymentMapper;
    public List<Map> sell(pageCount pageCount, Payment payment) {
        int begin=pageCount.getLimit()*(pageCount.getPage()-1);
        int end=pageCount.getLimit()*pageCount.getPage()-begin;
        Map<String,Object> map=new HashMap<>();
        map.put("begin",begin);
        map.put("end",end);
        map.put("clientname",payment.getClientname());
        return paymentMapper.sell(map);
    }
    public int sellCount(Payment payment) {

        return paymentMapper.sellCount(payment);
    }
    @Override
    public Payment selOne(Integer roomid) {
        return paymentMapper.selOne(roomid);
    }
    @Override
    public int updates(Payment payment) {
        return paymentMapper.updates(payment);
    }
}
