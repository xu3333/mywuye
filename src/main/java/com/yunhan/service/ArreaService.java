package com.yunhan.service;

import com.yunhan.entity.Arrearage;
import com.yunhan.entity.pageCount;

import java.util.List;
import java.util.Map;

public interface ArreaService {
    //查询
    public List<Map> selArea(pageCount pageCount, Arrearage arrearage);
    //查询总数据
    public int selCount(Arrearage arrearage);
}
