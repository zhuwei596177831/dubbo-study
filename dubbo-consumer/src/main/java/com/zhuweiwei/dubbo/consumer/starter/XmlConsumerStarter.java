package com.zhuweiwei.dubbo.consumer.starter;

import com.zhuweiwei.dubbo.provider.server.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 朱伟伟
 * @date 2020-10-08 12:50:22
 * @description
 */
public class XmlConsumerStarter {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:consumer.xml");
        applicationContext.start();
        DemoService demoService = applicationContext.getBean(DemoService.class);
        String hello = demoService.sayHello("World");
        System.out.println(hello);
    }
}
