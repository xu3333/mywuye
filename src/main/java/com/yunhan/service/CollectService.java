package com.yunhan.service;

import com.yunhan.entity.Collectreport;

import java.util.List;
import java.util.Map;
import com.yunhan.entity.pageCount;

public interface CollectService {
    //查询欠费报表
public List<Map> selcol(pageCount pageCount,Collectreport collectreport);
//查询总数据
    public int selcolCount(Collectreport collectreport);
}
