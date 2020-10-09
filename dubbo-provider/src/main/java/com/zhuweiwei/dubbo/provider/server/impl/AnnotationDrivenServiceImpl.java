package com.zhuweiwei.dubbo.provider.server.impl;

import com.zhuweiwei.dubbo.provider.server.AnnotationDrivenService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 朱伟伟
 * @date 2020-10-09 22:22:21
 * @description
 */
@DubboService
//@Service
public class AnnotationDrivenServiceImpl implements AnnotationDrivenService {
    @Override
    @Transactional
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
