package cn.edu.nsu.greywolf.mapper;

import cn.edu.nsu.greywolf.pojo.Organizers;
import cn.edu.nsu.greywolf.pojo.OrganizersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizersMapper {
    long countByExample(OrganizersExample example);

    int deleteByExample(OrganizersExample example);

    int deleteByPrimaryKey(Integer orgManagerId);

    int insert(Organizers record);

    int insertSelective(Organizers record);

    List<Organizers> selectByExample(OrganizersExample example);

    Organizers selectByPrimaryKey(Integer orgManagerId);

    int updateByExampleSelective(@Param("record") Organizers record, @Param("example") OrganizersExample example);

    int updateByExample(@Param("record") Organizers record, @Param("example") OrganizersExample example);

    int updateByPrimaryKeySelective(Organizers record);

    int updateByPrimaryKey(Organizers record);
}