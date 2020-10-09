package com.zhuweiwei.dubbo.consumer.starter;

import com.zhuweiwei.dubbo.consumer.component.AnnotationAction;
import com.zhuweiwei.dubbo.consumer.configuration.ConsumerConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.IntStream;

/**
 * @author 朱伟伟
 * @date 2020-10-08 14:37:50
 * @description
 */
public class AnnotationConsumerStarter {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        applicationContext.start();
        AnnotationAction annotationAction = applicationContext.getBean(AnnotationAction.class);
        IntStream.range(0, 10).forEach(i -> {
            System.out.println(annotationAction.doSayHello("朱伟伟"));
        });
    }
}
