package com.yunhan.service.impl;

import com.yunhan.entity.GmdPay;
import com.yunhan.entity.pageCount;
import com.yunhan.mapper.GmdPayMapper;
import com.yunhan.service.GmdPayService;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
//@Service 把类当做容器中的一个组件来使用。
//当使用@Autowired注解则是实例化构造器。因为在自动注入时，是一个接口类型，所以要在容器中找到相应的实现类注入。故@Service加到类上
@Transactional
public class GmdPayServiceImpl implements GmdPayService {
    @Autowired
    private GmdPayMapper gmdPayMapper;
    @Override
    public List<Map> selectAll(pageCount pageCount, GmdPay gmdPay) {
        int begin=pageCount.getLimit()*(pageCount.getPage()-1);
        int end=pageCount.getLimit()*pageCount.getPage()-begin;
        Map<String,Object> map=new HashMap<>();
        map.put("begin",begin);
        map.put("end",end);
        map.put("patitemstname",gmdPay.getPatitemstname());
        return gmdPayMapper.selectAll(map);
    }

    @Override
    public int selectCount(GmdPay gmdPay) {
        return gmdPayMapper.selectCount(gmdPay);
    }

    @Override
    public int delPay(Integer payitemsid) {
        return gmdPayMapper.delPay(payitemsid);
    }

    @Override
    public List<GmdPay> selPayitemst(GmdPay gmdPay) {
        return gmdPayMapper.selPayitemst(gmdPay);
    }

    @Override
    public List<GmdPay> selMetert(GmdPay gmdPay) {
        return gmdPayMapper.selMetert(gmdPay);
    }

    @Override
    public List<GmdPay> selItems(GmdPay gmdPay) {
        return gmdPayMapper.selItems(gmdPay);
    }

    @Override
    public int addPay(GmdPay gmdPay) {
        return gmdPayMapper.addPay(gmdPay);
    }

    @Override
    public List<GmdPay> selUp(Integer payitemsid) {
        return gmdPayMapper.selUp(payitemsid);
    }

    @Override
    public int upPay(GmdPay gmdPay) {
        return gmdPayMapper.upPay(gmdPay);
    }

    @Override
    public int selPay(GmdPay gmdPay) {
        return gmdPayMapper.selPay(gmdPay);
    }
}
