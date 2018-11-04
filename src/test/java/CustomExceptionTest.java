/**
  * Copyright (C), 2015-2018 
  * FileName: CustomExceptionTest 
  * Author:   r  
  * Date:     2018/10/29 11:24 AM 
  */

import cn.edu.nsu.greywolf.exception.CustomException;
import org.junit.Test;

/**
 * 〈自定义异常类测试〉
 * 〈测试〉
 * @author  r
 * @date    2018/10/29
 * @version 1.0.0
 */
public class CustomExceptionTest {
    @Test
    public void customExceptionTest() throws CustomException {
        int b = 2;
        if (b==2){
            throw new CustomException("除数不能为0");
        }
    }
}
