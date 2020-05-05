package com.yunhan.mapper;

import com.yunhan.entity.ComplaintSuggestion;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface ComplaintMapper {
    List<Map> selectAll(Map<String, Object> map);
    int selectCount(ComplaintSuggestion complaintSuggestion);
    void add_do2(ComplaintSuggestion complaintSuggestion);
    ComplaintSuggestion selectComplaintSuggestionById(Integer complaintSuggestionId);
    void updateComplaint(ComplaintSuggestion complaintSuggestion);
    ComplaintSuggestion selectComplaintSuggestionById2(Integer complaintSuggestionId);
    void updateComplaint2(ComplaintSuggestion complaintSuggestion);
    void delete2(Integer complaintsuggestionid);
    //查询房间
    public List<ComplaintSuggestion> cselRooms(ComplaintSuggestion complaintSuggestion);
    //查询管理员
    public List<ComplaintSuggestion> selectUser(ComplaintSuggestion complaintSuggestion);
}
