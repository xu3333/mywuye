package com.yunhan.service.impl;

import com.yunhan.entity.Arrearage;
import com.yunhan.entity.Ycharge;
import com.yunhan.mapper.YaddchargeMapper;
import com.yunhan.service.YaddchargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class YaddchargeServiceImpl implements YaddchargeService {
    @Autowired
    private YaddchargeMapper yaddchargeMapper;

    @Override
    public void addcharge(Ycharge ycharge) {
        yaddchargeMapper.addcharge(ycharge);
    }

    @Override
    public void updatecharge(Arrearage arrearage) {
        yaddchargeMapper.updatecharge(arrearage);
    }

    @Override
    public int selroomid(String roomno) {
        return yaddchargeMapper.selroomid(roomno);
    }
}
