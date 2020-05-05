package com.yunhan.service;

import com.yunhan.entity.RoomType;

import java.util.List;

public interface MessageIDService {
    List<RoomType> selMessageID(Integer MessageID);
    List<RoomType> selclientName(Integer clientmessageId);
    List<RoomType>selectMax(Integer practicalID);
}
