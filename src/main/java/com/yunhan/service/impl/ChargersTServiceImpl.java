package com.yunhan.service.impl;

import com.yunhan.entity.PayItemsT;
import com.yunhan.mapper.ChargesTMapper;
import com.yunhan.service.ChargersTService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class  ChargersTServiceImpl implements ChargersTService {
    @Resource
    private ChargesTMapper chargesTMapper;

    @Override
    public List<PayItemsT> findAll() {
        return chargesTMapper.findAll();
    }
}
