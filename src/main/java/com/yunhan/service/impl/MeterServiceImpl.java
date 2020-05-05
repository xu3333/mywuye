package com.yunhan.service.impl;

import com.yunhan.entity.Meter;
import com.yunhan.entity.pageCount;
import com.yunhan.mapper.MeterMapper;
import com.yunhan.service.MeterService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
@Transactional
public class MeterServiceImpl implements MeterService {
    @Resource
    private MeterMapper meterMapper;
    @Override
    public List<Map> selectAll(pageCount pageCount, Meter meter) {
        int begin =pageCount.getLimit()*(pageCount.getPage()-1);
        int end=pageCount.getLimit()*pageCount.getPage()-begin;
        Map<String,Object> map=new HashMap<>();
        map.put("begin",begin);
        map.put("end",end);
        map.put("RoomNO",meter.getRoomNO());
        return meterMapper.selectAll(map);
    }

    @Override
    public int selectCount(Meter meter) {
        return meterMapper.selectCount(meter);
    }

    @Override
    public void add_do(Meter meter) {
        meterMapper.add_do(meter);
    }

    @Override
    public Meter selectMetersById(Integer meterID) {
        return meterMapper.selectMetersById(meterID);
    }

    @Override
    public void update_do(Meter meter) {
        meterMapper.update_do(meter);
    }

    @Override
    public void delete(Integer meterID) {
        meterMapper.delete(meterID);
    }
}
