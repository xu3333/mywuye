package com.yunhan.mapper;

import com.yunhan.entity.Payment;
import com.yunhan.entity.pageCount;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
@Mapper
public interface PaymentMapper {
    //查询
    public List<Map> sell(Map<String,Object> map);
    //查询总数据
    int sellCount(Payment payment);
    //查询一条数据
    public Payment selOne(Integer roomid);
    //进行修改
    public int updates(Payment payment);
}
