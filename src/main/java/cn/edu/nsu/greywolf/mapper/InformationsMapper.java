package cn.edu.nsu.greywolf.mapper;

import cn.edu.nsu.greywolf.pojo.Informations;
import cn.edu.nsu.greywolf.pojo.InformationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InformationsMapper {
    long countByExample(InformationsExample example);

    int deleteByExample(InformationsExample example);

    int deleteByPrimaryKey(Integer informationId);

    int insert(Informations record);

    int insertSelective(Informations record);

    List<Informations> selectByExampleWithBLOBs(InformationsExample example);

    List<Informations> selectByExample(InformationsExample example);

    Informations selectByPrimaryKey(Integer informationId);

    int updateByExampleSelective(@Param("record") Informations record, @Param("example") InformationsExample example);

    int updateByExampleWithBLOBs(@Param("record") Informations record, @Param("example") InformationsExample example);

    int updateByExample(@Param("record") Informations record, @Param("example") InformationsExample example);

    int updateByPrimaryKeySelective(Informations record);

    int updateByPrimaryKeyWithBLOBs(Informations record);

    int updateByPrimaryKey(Informations record);
}