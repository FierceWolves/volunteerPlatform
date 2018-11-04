package cn.edu.nsu.greywolf.mapper;

import cn.edu.nsu.greywolf.pojo.Provinces;
import cn.edu.nsu.greywolf.pojo.ProvincesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProvincesMapper {
    long countByExample(ProvincesExample example);

    int deleteByExample(ProvincesExample example);

    int deleteByPrimaryKey(Integer provinceId);

    int insert(Provinces record);

    int insertSelective(Provinces record);

    List<Provinces> selectByExample(ProvincesExample example);

    Provinces selectByPrimaryKey(Integer provinceId);

    int updateByExampleSelective(@Param("record") Provinces record, @Param("example") ProvincesExample example);

    int updateByExample(@Param("record") Provinces record, @Param("example") ProvincesExample example);

    int updateByPrimaryKeySelective(Provinces record);

    int updateByPrimaryKey(Provinces record);
}