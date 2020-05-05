package com.yunhan.service.impl;

import com.yunhan.entity.Arrearage;
import com.yunhan.entity.pageCount;
import com.yunhan.mapper.ArreaMapper;
import com.yunhan.service.ArreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class ArreaServiceImpl implements ArreaService {
    @Autowired
    private ArreaMapper arreaMapper;
    public List<Map> selArea(pageCount pageCount, Arrearage arrearage) {
        int begin=pageCount.getLimit()*(pageCount.getPage()-1);
        int end=pageCount.getLimit()*pageCount.getPage()-begin;
        Map<String,Object> map=new HashMap<>();
        map.put("begin",begin);
        map.put("end",end);
        map.put("clientname",arrearage.getClientname());
        return arreaMapper.selArea(map);
    }
   //查询所有数据
    public int selCount(Arrearage arrearage) {
        return arreaMapper.selCount(arrearage);
    }
}
