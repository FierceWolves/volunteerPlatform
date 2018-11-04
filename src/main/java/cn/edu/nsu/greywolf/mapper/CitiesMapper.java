package cn.edu.nsu.greywolf.mapper;

import cn.edu.nsu.greywolf.pojo.Cities;
import cn.edu.nsu.greywolf.pojo.CitiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CitiesMapper {
    long countByExample(CitiesExample example);

    int deleteByExample(CitiesExample example);

    int deleteByPrimaryKey(Integer cityId);

    int insert(Cities record);

    int insertSelective(Cities record);

    List<Cities> selectByExample(CitiesExample example);

    Cities selectByPrimaryKey(Integer cityId);

    int updateByExampleSelective(@Param("record") Cities record, @Param("example") CitiesExample example);

    int updateByExample(@Param("record") Cities record, @Param("example") CitiesExample example);

    int updateByPrimaryKeySelective(Cities record);

    int updateByPrimaryKey(Cities record);
}