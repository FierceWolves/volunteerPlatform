/**
 * Copyright (C), 2015-2018
 * FileName: UsersService
 * Author:   r
 * Date:     2018/10/29 8:11 PM
 */
package cn.edu.nsu.greywolf.services;

import cn.edu.nsu.greywolf.mapper.UsersMapper;
import cn.edu.nsu.greywolf.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 〈用户相关的事务管理〉
 * 〈用户service层〉
 * @author r
 * @date 2018/10/29
 * @version 1.0.0
 */
@Service
public class UsersService {

    UsersMapper usersMapper;

    /**
     * @return cn.edu.nsu.greywolf.pojo.Users
     * @Author r
     * @Description 根据用户id查询用户
     */
    public Users findUserById() {
        return usersMapper.selectByPrimaryKey(1);
    }

    /**
     * @param volTel 用户电话号码
     * @return cn.edu.nsu.greywolf.pojo.Users
     * @Author r
     * @Description 根据用户号码查询用户
     */
    public Users findUserByTel(String volTel) {

        return usersMapper.selectByTel(volTel);
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
