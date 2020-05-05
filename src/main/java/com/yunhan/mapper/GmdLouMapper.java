package com.yunhan.mapper;

import com.yunhan.entity.GmdCar;
import com.yunhan.entity.GmdLou;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface GmdLouMapper {
    //查询楼层所有信息
    public List<Map> selectAll(Map<String,Object> map);
    //查询总条数
    public int selectCount(GmdLou gmdLou);
    //根据id禁用楼层信息
    public int delLou(Integer buildingid);
    //根据id启用楼层信息
    public int delqLou(Integer buildingid);
    //添加楼盘与楼层
    public int addLou(GmdLou gmdLou);
    //添加时判断单元号是否存在
    public int selAddlou(String buildingname);
    //修改时通过id查询一条数据
    public GmdLou selbuildingid(Integer buildingid);
    //通过id 修改一条数据
    public  int upLou(GmdLou gmdLou);


}
