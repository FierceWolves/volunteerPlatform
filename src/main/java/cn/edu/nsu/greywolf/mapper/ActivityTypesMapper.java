package cn.edu.nsu.greywolf.mapper;

import cn.edu.nsu.greywolf.pojo.ActivityTypes;
import cn.edu.nsu.greywolf.pojo.ActivityTypesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityTypesMapper {
    long countByExample(ActivityTypesExample example);

    int deleteByExample(ActivityTypesExample example);

    int deleteByPrimaryKey(Integer activityTypeId);

    int insert(ActivityTypes record);

    int insertSelective(ActivityTypes record);

    List<ActivityTypes> selectByExample(ActivityTypesExample example);

    ActivityTypes selectByPrimaryKey(Integer activityTypeId);

    int updateByExampleSelective(@Param("record") ActivityTypes record, @Param("example") ActivityTypesExample example);

    int updateByExample(@Param("record") ActivityTypes record, @Param("example") ActivityTypesExample example);

    int updateByPrimaryKeySelective(ActivityTypes record);

    int updateByPrimaryKey(ActivityTypes record);
}