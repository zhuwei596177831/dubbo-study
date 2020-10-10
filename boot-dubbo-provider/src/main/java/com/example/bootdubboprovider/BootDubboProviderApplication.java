package com.example.bootdubboprovider;

import com.zhuweiwei.dubbo.provider.server.BootDemoService;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@EnableAutoConfiguration
@DubboComponentScan
public class BootDubboProviderApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(BootDubboProviderApplication.class, args);
//        System.out.println(applicationContext.getBean(BootDemoService.class).sayHello("hello"));
    }

}
