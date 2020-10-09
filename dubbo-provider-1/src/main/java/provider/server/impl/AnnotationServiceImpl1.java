package provider.server.impl;

import com.zhuweiwei.dubbo.provider.server.AnnotationService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author 朱伟伟
 * @date 2020-10-08 14:18:17
 * @description
 */
@DubboService(timeout = 1000, retries = 2, cluster = "failfast")
public class AnnotationServiceImpl1 implements AnnotationService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name + " 服务2";
    }
}
