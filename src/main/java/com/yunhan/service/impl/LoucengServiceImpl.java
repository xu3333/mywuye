package com.yunhan.service.impl;

import com.yunhan.entity.Louceng;
import com.yunhan.mapper.LoucengMapper;
import com.yunhan.service.LoucengService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class LoucengServiceImpl implements LoucengService {
    @Autowired
    private LoucengMapper loucengMapper;

    @Override
    public List<Louceng> queryLoucengNo(Integer buildingID) {
        return loucengMapper.queryLoucengNo(buildingID);
    }
}
