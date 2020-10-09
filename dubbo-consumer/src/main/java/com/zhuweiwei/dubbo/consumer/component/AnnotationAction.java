package com.zhuweiwei.dubbo.consumer.component;

import com.zhuweiwei.dubbo.provider.server.AnnotationService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

/**
 * @author 朱伟伟
 * @date 2020-10-08 14:30:05
 * @description
 */
@Component
public class AnnotationAction {
    @DubboReference(timeout = 5000, retries = 0, cluster = "failfast",
            loadbalance = "random")
    AnnotationService annotationService;

    public String doSayHello(String name) {
        return annotationService.sayHello(name);
    }

}
