package com.yunhan.service;

import com.yunhan.entity.Meter;
import com.yunhan.entity.pageCount;

import java.util.List;
import java.util.Map;

public interface MeterService {
     List<Map>selectAll(pageCount pageCount, Meter meter);
     int selectCount(Meter meter);
     void add_do(Meter meter);
     Meter selectMetersById(Integer meterID);
     void update_do(Meter meter);
     void delete(Integer meterID);
}
