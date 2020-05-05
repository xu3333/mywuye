package com.yunhan.service.impl;

import com.yunhan.entity.RoomType;
import com.yunhan.mapper.RoomTypeMapper;
import com.yunhan.service.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class RoomTypeServiceImpl implements RoomTypeService {
    @Autowired
    private RoomTypeMapper roomTypeMapper;
    @Override
    public List<RoomType> findRoom() {
        return roomTypeMapper.findRoom();
    }
}
