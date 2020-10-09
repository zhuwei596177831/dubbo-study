package com.zhuweiwei.dubbo.consumer.component;

import com.zhuweiwei.dubbo.provider.server.AnnotationDrivenService;
import org.apache.dubbo.config.annotation.DubboReference;

/**
 * @author 朱伟伟
 * @date 2020-10-09 22:26:06
 * @description
 */
public class AnnotationDrivenAction {
    @DubboReference
    AnnotationDrivenService annotationDrivenService;

    public String doSayHello(String name) {
        return annotationDrivenService.sayHello(name);
    }
}
