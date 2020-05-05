package com.yunhan.mapper;

import com.yunhan.entity.GmdPay;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface GmdPayMapper {
    //查询所有收费项目
    public List<Map> selectAll(Map<String,Object> map);
    //查询总条数
    public int selectCount(GmdPay gmdPay);
    //根据项目id删除一条信息
    public int delPay(Integer payitemsid);
    //查询项目类型表
    public List<GmdPay> selPayitemst(GmdPay gmdPay);
    //查询仪表信息
    public List<GmdPay> selMetert(GmdPay gmdPay);
    //查询标准方案
    public List<GmdPay> selItems(GmdPay gmdPay);
    //添加项目信息
    public int addPay(GmdPay gmdPay);
    //修改时查询
    public List<GmdPay> selUp(Integer payitemsid);
    //执行修改
    public int upPay(GmdPay gmdPay);

    //添加时查询收费名称是否存在
    public int selPay(GmdPay gmdPay);


}
