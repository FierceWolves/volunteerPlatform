/**
  * Copyright (C), 2015-2018 
  * FileName: JsonData 
  * Author:   r  
  * Date:     2018/10/29 7:47 PM 
  */
package cn.edu.nsu.greywolf.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * 〈将要返回的信息封装为Json对象〉
 * 〈封装Json对象〉
 * @author  r
 * @date    2018/10/29
 * @version 1.0.0
 */
public class JsonData {
    //200 成功  100 失败
    private int code;
    //提示信息
    private String message;
    //数据
    private Map<String,Object> data = new HashMap<>();

    /**
     * @param msg 提示信息
     * @return cn.edu.nsu.greywolf.utils.JsonData
     * @Author r
     * @Description 返回状态码为200的json对象
     */
    public static JsonData success(String msg){
        JsonData jsonData = new JsonData();
        jsonData.setCode(200);
        jsonData.setMessage(msg);
        return jsonData;
    }
    /**
     * @param msg 提示信息
     * @return cn.edu.nsu.greywolf.utils.JsonData
     * @Author r
     * @Description 返回状态码为100的json对象
     */
    public static JsonData fail(String msg){
        JsonData jsonData = new JsonData();
        jsonData.setCode(100);
        jsonData.setMessage(msg);
        return jsonData;
    }

    /**
     * @param key  响应结果key值
     * @param data 响应数据
     * @return cn.edu.nsu.greywolf.utils.JsonData
     * @Author r
     * @Description 向Json对象中添加响应数据
     */
    public JsonData add(String key , Object data){

        this.getData().put(key,data);
        return this;
    }

    /**
     * @return the value of code
     * @Description Gets the value of code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code code
     * @Description Sets the code
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * @return the value of message
     * @Description Gets the value of message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message message
     * @Description Sets the message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the value of data
     * @Description Gets the value of data
     */
    public Map<String, Object> getData() {
        return data;
    }

    /**
     * @param data data
     * @Description Sets the data
     */
    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
