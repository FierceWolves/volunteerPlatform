package cn.edu.nsu.greywolf.mapper;

import cn.edu.nsu.greywolf.pojo.OrderItems;
import cn.edu.nsu.greywolf.pojo.OrderItemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderItemsMapper {
    long countByExample(OrderItemsExample example);

    int deleteByExample(OrderItemsExample example);

    int deleteByPrimaryKey(Integer orderItemId);

    int insert(OrderItems record);

    int insertSelective(OrderItems record);

    List<OrderItems> selectByExample(OrderItemsExample example);

    OrderItems selectByPrimaryKey(Integer orderItemId);

    int updateByExampleSelective(@Param("record") OrderItems record, @Param("example") OrderItemsExample example);

    int updateByExample(@Param("record") OrderItems record, @Param("example") OrderItemsExample example);

    int updateByPrimaryKeySelective(OrderItems record);

    int updateByPrimaryKey(OrderItems record);
}