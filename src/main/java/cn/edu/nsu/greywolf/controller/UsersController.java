/**
 * Copyright (C), 2015-2018
 * FileName: UsersController
 * Author:   r
 * Date:     2018/10/29 11:12 AM
 */
package cn.edu.nsu.greywolf.controller;

import cn.edu.nsu.greywolf.pojo.Users;
import cn.edu.nsu.greywolf.services.UsersService;
import cn.edu.nsu.greywolf.utils.JsonData;
import cn.edu.nsu.greywolf.utils.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;


/**
 * 〈处理与用户相关的请求〉
 * 〈用户控制层〉
 * @author r
 * @date 2018/10/29
 * @version 1.0.0
 */
@Controller
@RequestMapping("/user")
public class UsersController {

    UsersService usersService;

    /**
     * @return java.lang.String
     * @Author r
     * @Description 打开登录窗口
     */
    @RequestMapping("/login")
    public String openLogin() {
        return "user/LoginOrRegister/login";
    }

    /**
     * @param session
     * @return cn.edu.nsu.greywolf.utils.JsonData
     * @Author r
     * @Description 校验用户是否登录
     */
    @ResponseBody
    @RequestMapping(value = "/checkLogin")
    public JsonData checkLogin(HttpSession session) {
        if (session.getAttribute("user") != null) {
            return JsonData.success("已登录");
        }
        return JsonData.success("未登录");

    }

    @ResponseBody
    @RequestMapping(value = "/doLogin", method = RequestMethod.PUT)
    public JsonData login(HttpSession session, @RequestParam String volTel, @RequestParam String volPassword, @RequestParam String captcha_code) {
        //定义正则表达式
        String telRegular = "^1(3|4|5|7|8)\\d{9}$";
        //校验数据
        if (!volTel.matches(telRegular)) {
            return JsonData.fail("手机号码格式错误");
        }
        //获取验证码，并校验
        String code = (String) session.getAttribute("verifyCode");
        if (!(captcha_code.toLowerCase()).equals(code)) {
            return JsonData.fail("验证码错误");
        }
        //调用service方法查询用户密码
        Users users = usersService.findUserByTel(volTel);
        String md5Psd = MD5.encrypByMd5(users.getPassword() + "greywolf");
        //校验密码
        if (!volPassword.equals(md5Psd)) {
            return JsonData.fail("密码错误");
        }
        //将用户登录的id存放到session会话中
        session.setAttribute("user", users);
        return JsonData.success("登录成功").add("loginId", users.getUserID());

    }

    /**
     * @return java.lang.String
     * @Author r
     * @Description 打开注册页面
     */
    @RequestMapping(value = "register")
    public String openRegister() {
        return "user/LoginOrRegister/registerPerson";
    }

    /**
     * @return java.lang.String
     * @Author r
     * @Description 打开密码找回页面
     */
    @RequestMapping("/forgetPsd")
    public String receivePsd() {
        return "/user/LoginOrRegister/forgetpsd";
    }

    /**
     * @return java.lang.String
     * @Author r
     * @Description 打开用户主页
     */
    @RequestMapping("/homepage")
    public String toHomePage() {
        return "/user/personalHomepage";
    }

    /**
     * @param usersService usersService
     * @Description Sets the usersService
     */
    @Autowired
    public void setUsersService(UsersService usersService) {
        this.usersService = usersService;
    }
}

