/**
  * Copyright (C), 2015-2018 
  * FileName: CustomException 
  * Author:   r  
  * Date:     2018/10/29 7:45 PM 
  */
package cn.edu.nsu.greywolf.exception;
/**
 * 〈捕获异常〉
 * 〈自定义异常处理类〉
 * @author  r
 * @date    2018/10/29
 * @version 1.0.0
 */
public class CustomException extends Exception{
    //异常消息
    private String message;

    /**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public CustomException(String message) {
        super(message);
        this.message = message;
    }
}
