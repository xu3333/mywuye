package com.yunhan.mapper;

import com.yunhan.entity.MeterCharge;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;



@Mapper
@Repository
public interface BillMappper {
    void  add_bill(@Param("roomID")Integer roomID, @Param("meterReadTime")String meterReadTime, @Param("patitemsName")String patitemsName, @Param("utility")Integer utility, @Param("payitemsmoney")Integer payitemsmoney, @Param("remark")String remark);
    MeterCharge find_bill(@Param("roomID")Integer roomID,@Param("patitemsName")String patitemsName);
    void up_bill(MeterCharge patitemsName);
}
