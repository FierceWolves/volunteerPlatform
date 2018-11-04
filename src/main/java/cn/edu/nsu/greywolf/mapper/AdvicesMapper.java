package cn.edu.nsu.greywolf.mapper;

import cn.edu.nsu.greywolf.pojo.Advices;
import cn.edu.nsu.greywolf.pojo.AdvicesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdvicesMapper {
    long countByExample(AdvicesExample example);

    int deleteByExample(AdvicesExample example);

    int deleteByPrimaryKey(Integer adviceId);

    int insert(Advices record);

    int insertSelective(Advices record);

    List<Advices> selectByExample(AdvicesExample example);

    Advices selectByPrimaryKey(Integer adviceId);

    int updateByExampleSelective(@Param("record") Advices record, @Param("example") AdvicesExample example);

    int updateByExample(@Param("record") Advices record, @Param("example") AdvicesExample example);

    int updateByPrimaryKeySelective(Advices record);

    int updateByPrimaryKey(Advices record);
}