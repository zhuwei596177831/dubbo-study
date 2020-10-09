package com.zhuweiwei.dubbo.consumer.configuration;

import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author 朱伟伟
 * @date 2020-10-08 14:32:53
 * @description
 */
@Configuration
@ComponentScan(basePackages = {"com.zhuweiwei.dubbo.consumer.component"})
@EnableDubboConfig
//@PropertySource(value = "classpath:annotation-consumer.properties")
public class ConsumerConfiguration {
}
