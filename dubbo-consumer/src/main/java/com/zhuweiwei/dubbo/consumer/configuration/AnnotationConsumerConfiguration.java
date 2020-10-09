package com.zhuweiwei.dubbo.consumer.configuration;

import com.zhuweiwei.dubbo.consumer.component.AnnotationDrivenAction;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 朱伟伟
 * @date 2020-10-09 17:18:48
 * @description
 */
@Configuration
//spring bean @reference处理
// 扫描package dubbo.consumer.annotation.configuration及子package @Service
@DubboComponentScan
//@EnableDubboConfig
//@EnableDubbo
public class AnnotationConsumerConfiguration {
    /**
     * 当前应用配置
     */
    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("dubbo-annotation-consumer");
        return applicationConfig;
    }

    /**
     * 当前连接注册中心配置
     */
    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://127.0.0.1:2181");
        return registryConfig;
    }

    /**
     * 注册 AnnotationDrivenAction，@DubboComponentScan 将处理其中 @Reference 字段。
     * 如果 AnnotationDrivenAction 非 Spring Bean 的话，
     * 即使 @DubboComponentScan 指定 package 也不会进行处理，与 Spring @Autowired 同理
     */
    @Bean
    public AnnotationDrivenAction annotationDrivenAction() {
        return new AnnotationDrivenAction();
    }
}
