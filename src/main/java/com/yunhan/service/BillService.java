package com.yunhan.service;
import com.yunhan.entity.MeterCharge;
import org.apache.ibatis.annotations.Param;
public interface BillService {
    void  add_bill(@Param("roomID")Integer roomID, @Param("meterReadTime")String meterReadTime, @Param("patitemsName")String patitemsName, @Param("utility")Integer utility, @Param("payitemsmoney")Integer payitemsmoney, @Param("remark")String remark);
    MeterCharge find_bill(@Param("roomID")Integer roomID,@Param("patitemsName")String patitemsName);
    void up_bill(MeterCharge meterCharge);
}
