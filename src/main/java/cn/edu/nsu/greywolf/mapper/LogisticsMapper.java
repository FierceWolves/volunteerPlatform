package cn.edu.nsu.greywolf.mapper;

import cn.edu.nsu.greywolf.pojo.Logistics;
import cn.edu.nsu.greywolf.pojo.LogisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogisticsMapper {
    long countByExample(LogisticsExample example);

    int deleteByExample(LogisticsExample example);

    int deleteByPrimaryKey(Integer logisticsId);

    int insert(Logistics record);

    int insertSelective(Logistics record);

    List<Logistics> selectByExample(LogisticsExample example);

    Logistics selectByPrimaryKey(Integer logisticsId);

    int updateByExampleSelective(@Param("record") Logistics record, @Param("example") LogisticsExample example);

    int updateByExample(@Param("record") Logistics record, @Param("example") LogisticsExample example);

    int updateByPrimaryKeySelective(Logistics record);

    int updateByPrimaryKey(Logistics record);
}