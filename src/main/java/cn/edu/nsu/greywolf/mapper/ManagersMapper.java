package cn.edu.nsu.greywolf.mapper;

import cn.edu.nsu.greywolf.pojo.Managers;
import cn.edu.nsu.greywolf.pojo.ManagersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManagersMapper {
    long countByExample(ManagersExample example);

    int deleteByExample(ManagersExample example);

    int deleteByPrimaryKey(Integer managerId);

    int insert(Managers record);

    int insertSelective(Managers record);

    List<Managers> selectByExample(ManagersExample example);

    Managers selectByPrimaryKey(Integer managerId);

    int updateByExampleSelective(@Param("record") Managers record, @Param("example") ManagersExample example);

    int updateByExample(@Param("record") Managers record, @Param("example") ManagersExample example);

    int updateByPrimaryKeySelective(Managers record);

    int updateByPrimaryKey(Managers record);
}