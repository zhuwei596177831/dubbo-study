package com.zhuweiwei.dubbo.provider.starter;

import com.zhuweiwei.dubbo.provider.configuration.AnnotationProviderConfiguration;
import com.zhuweiwei.dubbo.provider.server.AnnotationDrivenService;
import com.zhuweiwei.dubbo.provider.server.DemoService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * @author 朱伟伟
 * @date 2020-10-09 17:13:03
 * @description
 */
public class AnnotationDrivenProviderStarter {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(AnnotationProviderConfiguration.class);
        applicationContext.refresh();
//        System.out.println(applicationContext.getBean(AnnotationDrivenService.class).sayHello("World"));
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
