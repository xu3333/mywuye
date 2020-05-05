package com.yunhan.mapper;

import com.yunhan.entity.Building;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface BuildingMapper {
    List<Building> queryBuildingName();
}
