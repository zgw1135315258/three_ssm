package cn.itcast.travel.dao;

import cn.itcast.travel.pojo.TabFavorite;
import cn.itcast.travel.pojo.TabFavoriteExample;
import cn.itcast.travel.pojo.TabFavoriteKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TabFavoriteMapper {
    int countByExample(TabFavoriteExample example);

    int deleteByExample(TabFavoriteExample example);

    int deleteByPrimaryKey(TabFavoriteKey key);

    int insert(TabFavorite record);

    int insertSelective(TabFavorite record);

    List<TabFavorite> selectByExample(TabFavoriteExample example);

    TabFavorite selectByPrimaryKey(TabFavoriteKey key);

    int updateByExampleSelective(@Param("record") TabFavorite record, @Param("example") TabFavoriteExample example);

    int updateByExample(@Param("record") TabFavorite record, @Param("example") TabFavoriteExample example);

    int updateByPrimaryKeySelective(TabFavorite record);

    int updateByPrimaryKey(TabFavorite record);
}