package com.yunhan.service.impl;

import com.yunhan.entity.GmdClient;
import com.yunhan.entity.pageCount;
import com.yunhan.mapper.GmdClientMapper;
import com.yunhan.service.GmdClientService;
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
public class GmdClientServiceImpl implements GmdClientService {
    @Autowired
    private GmdClientMapper gmdClientMapper;
    @Override
    public List<Map> selectAll(pageCount pageCount, GmdClient gmdClient) {
        int begin=pageCount.getLimit()*(pageCount.getPage()-1);
        int end=pageCount.getLimit()*pageCount.getPage()-begin;
        Map<String,Object> map=new HashMap<>();
        map.put("begin",begin);
        map.put("end",end);
        map.put("clientname",gmdClient.getClientname());
        return gmdClientMapper.selectAll(map);
    }

    @Override
    public int selectCount(GmdClient gmdClient) {
        return gmdClientMapper.selectCount(gmdClient);
    }

    @Override
    public List<GmdClient> seleducation(GmdClient gmdClient) {
        return gmdClientMapper.seleducation(gmdClient);
    }

    @Override
    public int addClient(GmdClient gmdClient) {
        return gmdClientMapper.addClient(gmdClient);
    }

    @Override
    public int addRelat(GmdClient gmdClient) {
        return gmdClientMapper.addRelat(gmdClient);
    }

    @Override
    public int addBank(GmdClient gmdClient) {
        return gmdClientMapper.addBank(gmdClient);
    }

    @Override
    public int delClient(Integer clientmessageid) {
        return gmdClientMapper.delClient(clientmessageid);
    }

    @Override
    public List<GmdClient> selUpClient(Integer clientmessageid) {
        return gmdClientMapper.selUpClient(clientmessageid);
    }

    @Override
    public int upClient(GmdClient gmdClient) {
        return gmdClientMapper.upClient(gmdClient);
    }

    @Override
    public List<GmdClient> selBank(GmdClient gmdClient) {
        return gmdClientMapper.selBank(gmdClient);
    }

    @Override
    public int upRelation(GmdClient gmdClient) {
        return gmdClientMapper.upRelation(gmdClient);
    }

    @Override
    public int selAddc(GmdClient gmdClient) {
        return gmdClientMapper.selAddc(gmdClient);
    }


}
