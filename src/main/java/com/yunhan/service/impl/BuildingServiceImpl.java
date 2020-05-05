package com.yunhan.service.impl;

import com.yunhan.entity.Building;
import com.yunhan.mapper.BuildingMapper;
import com.yunhan.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class BuildingServiceImpl implements BuildingService {
    @Autowired
    private BuildingMapper buildingMapper;
    @Override
    public List<Building> queryBuildingName() {
        return buildingMapper.queryBuildingName();
    }
}
