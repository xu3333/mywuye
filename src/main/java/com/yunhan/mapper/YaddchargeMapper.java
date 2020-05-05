package com.yunhan.mapper;

import com.yunhan.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface YaddchargeMapper {
    public void addcharge(Ycharge ycharge);
    public  void  updatecharge(Arrearage arrearage);
    public int selroomid(String roomno);
}
