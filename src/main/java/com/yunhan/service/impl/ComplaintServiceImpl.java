package com.yunhan.service.impl;
import com.yunhan.entity.ComplaintSuggestion;
import com.yunhan.entity.pageCount;
import com.yunhan.mapper.ComplaintMapper;
import com.yunhan.service.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class ComplaintServiceImpl implements  ComplaintService {
    @Autowired
    private ComplaintMapper complaintMapper;

//实现分页与模糊查询
    @Override
    public List<Map> selectAll(pageCount pageCount, ComplaintSuggestion complaintSuggestion) {
        int begin=pageCount.getLimit()*(pageCount.getPage()-1);
        int end=pageCount.getLimit()*pageCount.getPage()-begin;
        Map<String,Object> map=new HashMap<>();
        map.put("begin",begin);
        map.put("end",end);
        map.put("complainant",complaintSuggestion.getComplainant());
        return complaintMapper.selectAll(map);
    }


    //查找数据总条数1
    @Override
    public int selectCount(ComplaintSuggestion complaintSuggestion) {
        return complaintMapper.selectCount(complaintSuggestion);
    }
//添加
    @Override
    public void add_do2(ComplaintSuggestion complaintSuggestion) {
        complaintMapper.add_do2(complaintSuggestion);
    }

   @Override
    public ComplaintSuggestion selectComplaintSuggestionById(Integer complaintSuggestionId) {
        return complaintMapper.selectComplaintSuggestionById(complaintSuggestionId);
    }

    @Override
    public void updateComplaint(ComplaintSuggestion complaintSuggestion) {
        complaintMapper.updateComplaint(complaintSuggestion);
    }

    @Override
    public ComplaintSuggestion selectComplaintSuggestionById2(Integer complaintSuggestionId) {
        return complaintMapper.selectComplaintSuggestionById2(complaintSuggestionId);
    }

    @Override
    public void updateComplaint2(ComplaintSuggestion complaintSuggestion) {
        complaintMapper.updateComplaint2(complaintSuggestion);
    }


    @Override
    public void delete2(Integer complaintSuggestionId) {
        complaintMapper.delete2(complaintSuggestionId);
    }

    @Override
    public List<ComplaintSuggestion> cselRooms(ComplaintSuggestion complaintSuggestion) {
        return complaintMapper.cselRooms(complaintSuggestion);
    }

    @Override
    public List<ComplaintSuggestion> selectUser(ComplaintSuggestion complaintSuggestion) {
        return complaintMapper.selectUser(complaintSuggestion);
    }
}
