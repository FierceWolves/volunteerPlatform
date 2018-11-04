/**
 * Copyright (C), 2015-2018
 * FileName: GetMessageCodeTest
 * Author:   r
 * Date:     2018/11/2 9:35 PM
 */

import cn.edu.nsu.greywolf.utils.GetMessageCode;
import org.junit.Test;

/**
 * 〈短信验证码测试类〉
 * @author r
 * @date 2018/11/2
 * @version 1.0.0
 */
public class GetMessageCodeTest {
    @Test
    public void getMessage() {
        String code = GetMessageCode.getCode("15182839862");
        System.out.println(code);
    }
}
