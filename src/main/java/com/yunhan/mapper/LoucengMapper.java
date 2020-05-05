package com.yunhan.mapper;

import com.yunhan.entity.Louceng;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LoucengMapper {
    List<Louceng> queryLoucengNo(Integer buildingID);
}
