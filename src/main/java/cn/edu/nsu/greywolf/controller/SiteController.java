/**
 * Copyright (C), 2015-2018
 * FileName: SiteController
 * Author:   r
 * Date:     2018/10/30 4:21 PM
 */
package cn.edu.nsu.greywolf.controller;

import cn.edu.nsu.greywolf.pojo.Advices;
import cn.edu.nsu.greywolf.services.AdvicesService;
import cn.edu.nsu.greywolf.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 〈负责页面跳转,不处理数据〉
 * 〈页面跳转〉
 *
 * @author r
 * @version 1.0.0
 * @date 2018/10/30
 */
@Controller
@RequestMapping("/site")
public class SiteController {

    private AdvicesService advicesService;

    //*****************导航栏跳转控制********************
    //跳转到主页
    @RequestMapping(value = "/home")
    public String toHome() {
        return "site/home";
    }

    //跳转到活动页面
    @RequestMapping(value = "/activity")
    public String toActivity() {
        return "site/activity";
    }

    //跳转到组织页面
    @RequestMapping(value = "/org")
    public String toOrg() {
        return "site/org";
    }

    //跳转到资讯页面
    @RequestMapping(value = "/information")
    public String toInformation() {
        return "site/information";
    }

    //跳转到商城页面
    @RequestMapping(value = "/shop")
    public String toCreditShop() {
        return "shop/creditShop";
    }


    //跳转到意见反馈页面
    @RequestMapping(value = "/advice")
    public String toAdvice() {
        return "site/advice";
    }

    //*****************导航栏跳转控制结束*****************

    /**
     * @return java.lang.String
     * @Author r
     * @Description 打开注册页面
     */
    @RequestMapping(value = "/register")
    public String toRegister() {
        return "site/register";
    }

    /**
     * @return java.lang.String
     * @Author r
     * @Description
     */
    @RequestMapping(value = "/volunteerShould")
    public String toVolunteerShould(){
        return "site/volunteerShould";
    }


    /**
     * @param activityId 活动id
     * @return java.lang.String
     * @Author r
     * @Description 活动详情
     */
    @RequestMapping(value = "/activityDetail/{id}", method = RequestMethod.GET)
    public String toActivityDetail(@PathVariable("id") Integer activityId) {
        return "site/activityDetail";
    }

    /**
     * @param orgId 组织id
     * @return java.lang.String
     * @Author r
     * @Description 组织详情
     */
    @RequestMapping(value = "/orgDetail/{id}", method = RequestMethod.GET)
    public String toOrgDetail(@PathVariable("id") Integer orgId) {

        return "site/oryDetail";
    }

    /**
     * @param informationId 资讯id
     * @return java.lang.String
     * @Author r
     * @Description 资讯详情
     */
    @RequestMapping(value = "/informationDetail/{id}", method = RequestMethod.GET)
    public String toInformationDetail(@PathVariable("id") Integer informationId) {
        return "site/informationDetail";
    }

    //==========================意见建议功能==============================

    /**
     * @param advices 意见对象
     * @return cn.edu.nsu.greywolf.utils.JsonData
     * @Author r
     * @Description 提交意见
     */
    @ResponseBody
    @RequestMapping(value = "/doAdvice", method = RequestMethod.PUT)
    public JsonData doAdvice(Advices advices) {
        advicesService.addAdvice(advices);
        return JsonData.success("提交成功");
    }
    //==========================意见建议功能结束============================

    /**
     * @param advicesService advicesService
     * @Description Sets the advicesService
     */
    @Autowired
    public void setAdvicesService(AdvicesService advicesService) {
        this.advicesService = advicesService;
    }
}
