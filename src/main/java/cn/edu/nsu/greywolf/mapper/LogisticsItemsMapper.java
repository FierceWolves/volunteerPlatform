package cn.edu.nsu.greywolf.mapper;

import cn.edu.nsu.greywolf.pojo.LogisticsItems;
import cn.edu.nsu.greywolf.pojo.LogisticsItemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogisticsItemsMapper {
    long countByExample(LogisticsItemsExample example);

    int deleteByExample(LogisticsItemsExample example);

    int deleteByPrimaryKey(Integer logisticsItemId);

    int insert(LogisticsItems record);

    int insertSelective(LogisticsItems record);

    List<LogisticsItems> selectByExample(LogisticsItemsExample example);

    LogisticsItems selectByPrimaryKey(Integer logisticsItemId);

    int updateByExampleSelective(@Param("record") LogisticsItems record, @Param("example") LogisticsItemsExample example);

    int updateByExample(@Param("record") LogisticsItems record, @Param("example") LogisticsItemsExample example);

    int updateByPrimaryKeySelective(LogisticsItems record);

    int updateByPrimaryKey(LogisticsItems record);
}