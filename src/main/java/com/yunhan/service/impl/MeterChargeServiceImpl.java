package com.yunhan.service.impl;

import com.yunhan.entity.MeterCharge;
import com.yunhan.entity.pageCount;
import com.yunhan.mapper.MeterChargeMapper;
import com.yunhan.service.MeterChargeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
@Transactional
public class MeterChargeServiceImpl implements MeterChargeService {
    @Resource
    private MeterChargeMapper meterChargeMapper;
    @Override
    public List<Map> selAll(pageCount pageCount,MeterCharge meterCharge) {
        int begin =pageCount.getLimit()*(pageCount.getPage()-1);
        int end=pageCount.getLimit()*pageCount.getPage()-begin;
        Map<String,Object> map=new HashMap<>();
        map.put("begin",begin);
        map.put("end",end);
        map.put("clientName",meterCharge.getClientName());
        return meterChargeMapper.selAll(map);
    }

    @Override
    public int selCount(MeterCharge meterCharge) {
        return meterChargeMapper.selCount(meterCharge);
    }

    @Override
    public void update_do(Integer meterID) {
        meterChargeMapper.update_do(meterID);
    }

    @Override
    public void updateAll_do(Integer[] meterID) {
        meterChargeMapper.updateAll_do(meterID);
    }

    @Override
    public void updateReAudit_do(Integer meterID) {
        meterChargeMapper.updateReAudit_do(meterID);
    }

    @Override
    public void update_true(Integer meterID) {
        meterChargeMapper.update_true(meterID);
    }

    @Override
    public void update_false(Integer meterID) {
        meterChargeMapper.update_false(meterID);
    }
}
