package com.yunhan.mapper;

import com.yunhan.entity.RoomType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MessageIDMapper {
    //查找用户id
    List<RoomType> selMessageID(Integer MessageID);
    //匹配用户名
    List<RoomType> selclientName(Integer clientmessageId);
    //查找最大用量
    List<RoomType>selectMax(Integer practicalID);
}
