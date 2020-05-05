package com.yunhan.service.impl;

import com.yunhan.entity.RoomType;
import com.yunhan.mapper.MessageIDMapper;
import com.yunhan.service.MessageIDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MessageIDServiceImpl implements MessageIDService {
    @Autowired
    private MessageIDMapper messageIDMapper;

    @Override
    public List<RoomType> selMessageID(Integer MessageID) {
        return messageIDMapper.selMessageID(MessageID);
    }

    @Override
    public List<RoomType> selclientName(Integer clientmessageId) {
        return messageIDMapper.selclientName(clientmessageId);
    }

    @Override
    public List<RoomType> selectMax(Integer practicalID) {
        return messageIDMapper.selectMax(practicalID);
    }
}
