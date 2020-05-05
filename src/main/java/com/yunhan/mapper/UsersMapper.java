package com.yunhan.mapper;

import com.yunhan.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface UsersMapper {
    List<Map> selectAll(Map<String,Object> map);
    int selectCount(Users users);
    void add_do(Users users);
    Users selectUsersById(Integer id);
    void update_do (Users users);
    void delete(Integer id);
}
