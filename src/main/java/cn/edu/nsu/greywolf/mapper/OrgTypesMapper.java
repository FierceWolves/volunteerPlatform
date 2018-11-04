package cn.edu.nsu.greywolf.mapper;

import cn.edu.nsu.greywolf.pojo.OrgTypes;
import cn.edu.nsu.greywolf.pojo.OrgTypesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrgTypesMapper {
    long countByExample(OrgTypesExample example);

    int deleteByExample(OrgTypesExample example);

    int deleteByPrimaryKey(Integer orgTypeId);

    int insert(OrgTypes record);

    int insertSelective(OrgTypes record);

    List<OrgTypes> selectByExample(OrgTypesExample example);

    OrgTypes selectByPrimaryKey(Integer orgTypeId);

    int updateByExampleSelective(@Param("record") OrgTypes record, @Param("example") OrgTypesExample example);

    int updateByExample(@Param("record") OrgTypes record, @Param("example") OrgTypesExample example);

    int updateByPrimaryKeySelective(OrgTypes record);

    int updateByPrimaryKey(OrgTypes record);
}