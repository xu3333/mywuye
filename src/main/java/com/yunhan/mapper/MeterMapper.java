package com.yunhan.mapper;

import com.yunhan.entity.Meter;
import java.util.List;
import java.util.Map;


public interface MeterMapper {
     List<Map> selectAll(Map<String,Object> map);
     int selectCount(Meter meter);
     void add_do(Meter meter);
     Meter selectMetersById(Integer meterID);
     void update_do(Meter meter);
     void delete(Integer meterID);
}
