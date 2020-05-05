package com.yunhan.service.impl;
import com.yunhan.entity.Receivable;
import com.yunhan.entity.pageCount;
import com.yunhan.mapper.ReceivableMapper;
import com.yunhan.service.ReceivableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class ReceivableServiceImpl implements ReceivableService {
    @Autowired
    private ReceivableMapper receivableMapper;

//实现分页与模糊查询
    @Override
    public List<Map> selectAll(pageCount pageCount, Receivable receivable) {
        int begin=pageCount.getLimit()*(pageCount.getPage()-1);
        int end=pageCount.getLimit()*pageCount.getPage()-begin;
        Map<String,Object> map=new HashMap<>();
        map.put("begin",begin);
        map.put("end",end);
        map.put("precinct",receivable.getPrecinct());
        return receivableMapper.selectAll(map);
    }


    //查找数据总条数1
    @Override
    public int selectCount(Receivable receivable) {
        return receivableMapper.selectCount(receivable);
    }
}
