package com.zhuweiwei.dubbo.provider.starter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author 朱伟伟
 * @date 2020-10-08 12:45:02
 * @description
 */
public class XmlProviderStarter {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:provider.xml");
        applicationContext.start();
        System.in.read();
    }
}
