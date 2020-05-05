package com.yunhan.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yunhan.entity.Menu;
import java.util.List;
import java.util.Map;

import com.yunhan.entity.ShowMenuVo;
public interface MenuMapper extends BaseMapper<Menu> {

    List<ShowMenuVo> selectShowMenuByUser(Map<String,Object> map);

    List<Menu> getMenus(Map<String,Object> map);
}