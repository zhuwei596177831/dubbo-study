package com.zhuweiwei.dubbo.provider.starter;

import com.zhuweiwei.dubbo.provider.configuration.ProviderConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * @author 朱伟伟
 * @date 2020-10-08 14:36:52
 * @description
 */
public class AnnotationProviderStarter {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        applicationContext.start();
        System.in.read();
    }
}
