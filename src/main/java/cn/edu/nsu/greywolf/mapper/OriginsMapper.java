package cn.edu.nsu.greywolf.mapper;

import cn.edu.nsu.greywolf.pojo.Origins;
import cn.edu.nsu.greywolf.pojo.OriginsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OriginsMapper {
    long countByExample(OriginsExample example);

    int deleteByExample(OriginsExample example);

    int deleteByPrimaryKey(Integer originId);

    int insert(Origins record);

    int insertSelective(Origins record);

    List<Origins> selectByExample(OriginsExample example);

    Origins selectByPrimaryKey(Integer originId);

    int updateByExampleSelective(@Param("record") Origins record, @Param("example") OriginsExample example);

    int updateByExample(@Param("record") Origins record, @Param("example") OriginsExample example);

    int updateByPrimaryKeySelective(Origins record);

    int updateByPrimaryKey(Origins record);
}