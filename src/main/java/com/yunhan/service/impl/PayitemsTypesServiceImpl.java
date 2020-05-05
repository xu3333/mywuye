package com.yunhan.service.impl;

import com.yunhan.entity.Payitems;
import com.yunhan.mapper.PayitemsTypesMapper;
import com.yunhan.service.PayitemsTypesService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class PayitemsTypesServiceImpl implements PayitemsTypesService {
    @Resource
    private PayitemsTypesMapper payitemsTypesMapper;

    @Override
    public List<Payitems> findAll() {
        return payitemsTypesMapper.findAll();
    }
}
