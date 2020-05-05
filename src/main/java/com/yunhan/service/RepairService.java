package com.yunhan.service;

import com.yunhan.entity.ChargeInfo;
import com.yunhan.entity.ComplaintSuggestion;
import com.yunhan.entity.RepairList;
import com.yunhan.entity.pageCount;

import java.util.List;
import java.util.Map;

public interface RepairService {
    List<Map> selectAll(pageCount pageCount, RepairList repairList);
    int selectCount(RepairList repairList);
    void addRepairList(RepairList repairList);
    RepairList selectRepairListById(Integer repairListId);
    List<ChargeInfo> selectCharge();
    void updateSl(RepairList repairList);
    RepairList selectRepairListById2(Integer repairListId);
    void updateSf(RepairList repairList);
    RepairList selectRepairListById3(Integer repairListId);
    RepairList selectRepairListById4(Integer repairListId);
    void updateYwwc(RepairList repairList);
    void deleteRepairList(Integer repairListId);

    //查询房间
    public List<RepairList> cselRoom(RepairList repairList);
    //通过客户id查询房间
    public List<RepairList> cselC(Integer roomid);
    //查询管理员
    public List<ComplaintSuggestion> selectUser(ComplaintSuggestion complaintSuggestion);
}
