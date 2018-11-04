/**
 * Copyright (C), 2015-2018
 * FileName: OrgController
 * Author:   r
 * Date:     2018/10/31 8:43 AM
 */
package cn.edu.nsu.greywolf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 〈处理与组织相关的请求〉
 * 〈组织控制层〉
 *
 * @author r
 * @version 1.0.0
 * @date 2018/10/31
 */
@RequestMapping("/org")
@Controller
public class OrgController {

    /**
     * @return java.lang.String
     * @Author r
     * @Description 打开登录页面
     */
    @RequestMapping("/login")
    public String orgLogin() {
        return "/group/LoginOrRegister/loginOrg";
    }


    /**
     * @return java.lang.String
     * @Author r
     * @Description 打开注册页面
     */
    @RequestMapping("/register")
    public String orgRegister() {
        return "/group/LoginOrRegister/registerOrg";
    }

    /**
     * @return java.lang.String
     * @Author r
     * @Description 打开密码找回页面
     */
    @RequestMapping("/forget")
    public String toForget() {
        return "/group/LoginOrRegister/forget";
    }

}
