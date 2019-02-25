package cn.itcast.travel.dao;

import cn.itcast.travel.pojo.TabSeller;
import cn.itcast.travel.pojo.TabSellerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TabSellerMapper {
    int countByExample(TabSellerExample example);

    int deleteByExample(TabSellerExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(TabSeller record);

    int insertSelective(TabSeller record);

    List<TabSeller> selectByExample(TabSellerExample example);

    TabSeller selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") TabSeller record, @Param("example") TabSellerExample example);

    int updateByExample(@Param("record") TabSeller record, @Param("example") TabSellerExample example);

    int updateByPrimaryKeySelective(TabSeller record);

    int updateByPrimaryKey(TabSeller record);
}