package com.yunhan.service.impl;
import com.yunhan.entity.ChargeInfo;
import com.yunhan.entity.ComplaintSuggestion;
import com.yunhan.entity.RepairList;
import com.yunhan.entity.pageCount;
import com.yunhan.mapper.RepairListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.yunhan.service.RepairService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class RepairServiceImpl implements  RepairService {
    @Autowired
    private RepairListMapper repairListMapper;

//实现分页与模糊查询
    @Override
    public List<Map> selectAll(pageCount pageCount, RepairList repairList) {
        int begin=pageCount.getLimit()*(pageCount.getPage()-1);
        int end=pageCount.getLimit()*pageCount.getPage()-begin;
        Map<String,Object> map=new HashMap<>();
        map.put("begin",begin);
        map.put("end",end);
        map.put("clientname",repairList.getClientname());
        return repairListMapper.selectAll(map);
    }
//查找数据总条数1
    @Override
    public int selectCount(RepairList repairList) {
        return repairListMapper.selectCount(repairList);
    }

//添加
    @Override
    public void addRepairList(RepairList repairList) {
        repairListMapper.addRepairList(repairList);
    }

    @Override
    public RepairList selectRepairListById(Integer repairListId) {
        return repairListMapper.selectRepairListById(repairListId);
    }

    @Override
    public RepairList selectRepairListById2(Integer repairListId) {
        return repairListMapper.selectRepairListById2(repairListId);
    }

    @Override
    public RepairList selectRepairListById3(Integer repairListId) {
        return repairListMapper.selectRepairListById3(repairListId);
    }

    @Override
    public RepairList selectRepairListById4(Integer repairListId) {
        return repairListMapper.selectRepairListById4(repairListId);
    }

    @Override
    public List<ChargeInfo> selectCharge() {
        return repairListMapper.selectCharge();
    }

    @Override
    public void updateSl(RepairList repairList) {
        repairListMapper.updateSl(repairList);
    }

    @Override
    public void updateSf(RepairList repairList) {
        repairListMapper.updateSf(repairList);
    }

    @Override
    public void updateYwwc(RepairList repairList) {
        repairListMapper.updateYwwc(repairList);
    }

    @Override
    public void deleteRepairList(Integer repairListId) {
        repairListMapper.deleteRepairList(repairListId);
    }

    @Override
    public List<RepairList> cselRoom(RepairList repairList) {
        return repairListMapper.cselRoom(repairList);
    }

    @Override
    public List<RepairList> cselC(Integer roomid) {
        return repairListMapper.cselC(roomid);
    }

    @Override
    public List<ComplaintSuggestion> selectUser(ComplaintSuggestion complaintSuggestion) {
        return repairListMapper.selectUser(complaintSuggestion);
    }

}
