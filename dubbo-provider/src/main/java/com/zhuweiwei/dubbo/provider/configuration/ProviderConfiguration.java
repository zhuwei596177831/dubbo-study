package com.zhuweiwei.dubbo.provider.configuration;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author 朱伟伟
 * @date 2020-10-08 14:26:54
 * @description
 */
@Configuration
@EnableDubbo(scanBasePackages = {"com.zhuweiwei.dubbo.provider.server.impl"})
//@PropertySource(value = {"classpath:annotation-provider.properties"})
public class ProviderConfiguration {
}
