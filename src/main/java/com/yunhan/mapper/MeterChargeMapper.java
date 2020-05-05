package com.yunhan.mapper;

import com.yunhan.entity.MeterCharge;

import java.util.List;
import java.util.Map;

public interface MeterChargeMapper {
    List<Map> selAll(Map<String,Object> map);
    int selCount(MeterCharge meterCharge);
    void update_do(Integer meterID);
    void updateAll_do(Integer[] meterID);
    void updateReAudit_do(Integer meterID);
    void update_true(Integer meterID);
    void update_false(Integer meterID);
}
