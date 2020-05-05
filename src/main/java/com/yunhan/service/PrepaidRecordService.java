package com.yunhan.service;

import com.yunhan.entity.PrepaidRecord;
import com.yunhan.entity.pageCount;

import java.util.List;
import java.util.Map;

public interface PrepaidRecordService {
    List<Map> selectAll(pageCount pageCount, PrepaidRecord prepaidRecord);
    int selectCount(PrepaidRecord prepaidRecord);
}
