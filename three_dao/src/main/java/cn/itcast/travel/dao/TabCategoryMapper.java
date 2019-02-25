package cn.itcast.travel.dao;

import cn.itcast.travel.pojo.TabCategory;
import cn.itcast.travel.pojo.TabCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TabCategoryMapper {
    int countByExample(TabCategoryExample example);

    int deleteByExample(TabCategoryExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(TabCategory record);

    int insertSelective(TabCategory record);

    List<TabCategory> selectByExample(TabCategoryExample example);

    TabCategory selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") TabCategory record, @Param("example") TabCategoryExample example);

    int updateByExample(@Param("record") TabCategory record, @Param("example") TabCategoryExample example);

    int updateByPrimaryKeySelective(TabCategory record);

    int updateByPrimaryKey(TabCategory record);
}