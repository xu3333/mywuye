package com.yunhan.mapper;

import com.yunhan.entity.WXPrice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface WXPriceMapper {
    List<WXPrice> searchList(String roomNo);
    int updateFee(@Param("roomID") Integer roomID, @Param("payproject") String payproject);
    int addPayType(@Param("clientname") String clientname,@Param("assessment") double assessment);
}
