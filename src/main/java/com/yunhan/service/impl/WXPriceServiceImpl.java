package com.yunhan.service.impl;

import com.yunhan.entity.WXPrice;
import com.yunhan.mapper.WXPriceMapper;
import com.yunhan.service.WXPriceService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class WXPriceServiceImpl implements WXPriceService {
    @Resource
    private WXPriceMapper wxPriceMapper;
    @Override
    public List<WXPrice> searchList(String roomNo) {
        return wxPriceMapper.searchList(roomNo);
    }

    @Override
    public int updateFee(Integer roomID, String payProject) {
        return wxPriceMapper.updateFee(roomID,payProject);
    }

    @Override
    public int addPayType(String clientname, double assessment) {
        return wxPriceMapper.addPayType(clientname,assessment);
    }

}
