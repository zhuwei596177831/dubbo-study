package com.example.bootdubboconsumer.component;

import com.zhuweiwei.dubbo.provider.server.BootDemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;


/**
 * @author 朱伟伟
 * @date 2020-10-10 16:19:54
 * @description
 */
@Component
public class BootConsumerAction {

    @DubboReference(loadbalance = "roundrobin")
    BootDemoService bootDemoService;

    public String doSayHello(String name) {
        return bootDemoService.sayHello(name);
    }

}
