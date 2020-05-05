package com.yunhan.mapper;

import com.yunhan.entity.Collectreport;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface CollectMapper {
    //查询欠费报表
public List<Map> selcol(Map<String,Object> map);
//查询总条数
public int selcolCount(Collectreport collectreport);
 }