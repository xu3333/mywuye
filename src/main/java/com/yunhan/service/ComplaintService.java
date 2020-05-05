package com.yunhan.service;


import com.yunhan.entity.ComplaintSuggestion;

import com.yunhan.entity.pageCount;

import java.util.List;
import java.util.Map;

public interface ComplaintService {
    List<Map> selectAll(pageCount pageCount, ComplaintSuggestion complaintSuggestion);
    int selectCount(ComplaintSuggestion complaintSuggestion);
    void add_do2(ComplaintSuggestion complaintSuggestion);
    ComplaintSuggestion selectComplaintSuggestionById(Integer complaintSuggestionId);
    void updateComplaint(ComplaintSuggestion complaintSuggestion);
    ComplaintSuggestion selectComplaintSuggestionById2(Integer complaintSuggestionId);
    void updateComplaint2(ComplaintSuggestion complaintSuggestion);
    void delete2(Integer complaintSuggestionId);
    //查询房间
    public List<ComplaintSuggestion> cselRooms(ComplaintSuggestion complaintSuggestion);
    //查询管理员
    public List<ComplaintSuggestion> selectUser(ComplaintSuggestion complaintSuggestion);
}
