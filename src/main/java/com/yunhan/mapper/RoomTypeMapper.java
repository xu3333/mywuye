package com.yunhan.mapper;

import com.yunhan.entity.RoomType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface RoomTypeMapper {
    List<RoomType> findRoom();
}
