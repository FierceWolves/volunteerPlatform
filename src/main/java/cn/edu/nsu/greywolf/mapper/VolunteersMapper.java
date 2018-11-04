package cn.edu.nsu.greywolf.mapper;

import cn.edu.nsu.greywolf.pojo.Volunteers;
import cn.edu.nsu.greywolf.pojo.VolunteersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VolunteersMapper {
    long countByExample(VolunteersExample example);

    int deleteByExample(VolunteersExample example);

    int deleteByPrimaryKey(Integer volunteerId);

    int insert(Volunteers record);

    int insertSelective(Volunteers record);

    List<Volunteers> selectByExample(VolunteersExample example);

    Volunteers selectByPrimaryKey(Integer volunteerId);

    int updateByExampleSelective(@Param("record") Volunteers record, @Param("example") VolunteersExample example);

    int updateByExample(@Param("record") Volunteers record, @Param("example") VolunteersExample example);

    int updateByPrimaryKeySelective(Volunteers record);

    int updateByPrimaryKey(Volunteers record);
}