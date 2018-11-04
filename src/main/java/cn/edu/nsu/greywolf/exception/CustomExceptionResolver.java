/**
  * Copyright (C), 2015-2018 
  * FileName: CustomExceptionResolver 
  * Author:   r  
  * Date:     2018/10/29 7:32 PM 
  */
package cn.edu.nsu.greywolf.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 〈处理SpringMVC产生的异常〉
 * 〈全局异常处理器〉
 * @author  r
 * @date    2018/10/29
 * @version 1.0.0
 */
public class CustomExceptionResolver implements HandlerExceptionResolver {
    /**
     * Try to resolve the given exception that got thrown during handler execution,
     * returning a {@link ModelAndView} that represents a specific error page if appropriate.
     * <p>The returned {@code ModelAndView} may be {@linkplain ModelAndView#isEmpty() empty}
     * to indicate that the exception has been resolved successfully but that no view
     * should be rendered, for instance by setting a status code.
     *
     * @param request  current HTTP request
     * @param response current HTTP response
     * @param handler  the executed handler, or {@code null} if none chosen at the
     *                 time of the exception (for example, if multipart resolution failed)
     * @param ex       the exception that got thrown during handler execution
     * @return a corresponding {@code ModelAndView} to forward to,
     * or {@code null} for default processing in the resolution chain
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        CustomException customException = null;
        //判断异常是否为自定义异常类
        if (ex instanceof CustomException){
            customException = (CustomException) ex;
        }else {
            customException = new CustomException("未知错误。请与系统管理员联系");
        }
        ModelAndView mv = new ModelAndView();
        mv.addObject("errorMsg",customException.getMessage());
        mv.setViewName("error");
        return mv;
    }
}
