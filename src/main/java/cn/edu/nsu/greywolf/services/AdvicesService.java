/**
 * Copyright (C), 2015-2018
 * FileName: AdvicesService
 * Author:   r
 * Date:     2018/11/1 12:45 AM
 */
package cn.edu.nsu.greywolf.services;

import cn.edu.nsu.greywolf.mapper.AdvicesMapper;
import cn.edu.nsu.greywolf.pojo.Advices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 〈处理提交意见请求〉
 * 〈意见建议〉
 * @author r
 * @date 2018/11/1
 * @version 1.0.0
 */
@Service
public class AdvicesService {
    private AdvicesMapper advicesMapper;

    /**
     * @param advices  意见对象
     * @return void
     * @Author r
     * @Description 添加意见
     */
    public void addAdvice(Advices advices) {
        advicesMapper.insert(advices);
    }

    /**
     * @param advicesMapper advicesMapper
     * @Description Sets the advicesMapper
     */
    @Autowired
    public void setAdvicesMapper(AdvicesMapper advicesMapper) {
        this.advicesMapper = advicesMapper;
    }
}
