package com.yunhan.mapper;

import com.yunhan.entity.Arrearage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
@Mapper
public interface ArreaMapper {
    //查询
    public List<Map> selArea(Map<String,Object> map);
    //查询总数据
    int selCount(Arrearage arrearage);
}
