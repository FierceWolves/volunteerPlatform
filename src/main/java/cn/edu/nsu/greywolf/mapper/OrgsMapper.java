package cn.edu.nsu.greywolf.mapper;

import cn.edu.nsu.greywolf.pojo.Orgs;
import cn.edu.nsu.greywolf.pojo.OrgsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrgsMapper {
    long countByExample(OrgsExample example);

    int deleteByExample(OrgsExample example);

    int deleteByPrimaryKey(Integer orgId);

    int insert(Orgs record);

    int insertSelective(Orgs record);

    List<Orgs> selectByExample(OrgsExample example);

    Orgs selectByPrimaryKey(Integer orgId);

    int updateByExampleSelective(@Param("record") Orgs record, @Param("example") OrgsExample example);

    int updateByExample(@Param("record") Orgs record, @Param("example") OrgsExample example);

    int updateByPrimaryKeySelective(Orgs record);

    int updateByPrimaryKey(Orgs record);
}