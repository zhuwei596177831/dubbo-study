package com.zhuweiwei.dubbo.consumer.starter;

import com.zhuweiwei.dubbo.consumer.component.AnnotationDrivenAction;
import com.zhuweiwei.dubbo.consumer.configuration.AnnotationConsumerConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 朱伟伟
 * @date 2020-10-09 17:20:06
 * @description
 */
public class AnnotationDrivenConsumerStarter {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(AnnotationConsumerConfiguration.class);
        applicationContext.refresh();
        System.out.println(applicationContext.getBean(AnnotationDrivenAction.class).doSayHello("World"));
    }
}
