/**
  * Copyright (C), 2015-2018 
  * FileName: UserMapperTest 
  * Author:   r  
  * Date:     2018/10/31 8:40 PM 
  */

import cn.edu.nsu.greywolf.mapper.UsersMapper;
import cn.edu.nsu.greywolf.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 〈UserMapper测试〉
 * @author  r
 * @date    2018/10/31
 * @version 1.0.0
 */
/**

 * 推荐spring的项目通过spring的单元测试进行测试
 * 1、导入spring-test包
 * 2、@ContextConfiguration指定spring的配置文件位置
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class UserMapperTest {
    public UsersMapper usersMapper;


    @Test
    public void selectByTelTest(){
        Users users = usersMapper.selectByTel("15182839862");
        System.out.println(users.toString());
    }

    /**
     * @param usersMapper usersMapper
     * @Description Sets the usersMapper
     */
    @Autowired
    public void setUsersMapper(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }
}
