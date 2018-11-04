package cn.edu.nsu.greywolf.mapper;

import cn.edu.nsu.greywolf.pojo.Notices;
import cn.edu.nsu.greywolf.pojo.NoticesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NoticesMapper {
    long countByExample(NoticesExample example);

    int deleteByExample(NoticesExample example);

    int deleteByPrimaryKey(Integer noticeId);

    int insert(Notices record);

    int insertSelective(Notices record);

    List<Notices> selectByExample(NoticesExample example);

    Notices selectByPrimaryKey(Integer noticeId);

    int updateByExampleSelective(@Param("record") Notices record, @Param("example") NoticesExample example);

    int updateByExample(@Param("record") Notices record, @Param("example") NoticesExample example);

    int updateByPrimaryKeySelective(Notices record);

    int updateByPrimaryKey(Notices record);
}