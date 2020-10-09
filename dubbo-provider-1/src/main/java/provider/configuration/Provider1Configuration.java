package provider.configuration;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;

/**
 * @author 朱伟伟
 * @date 2020-10-08 14:26:54
 * @description
 */
@Configuration
@EnableDubbo(scanBasePackages = {"provider.server.impl"})
public class Provider1Configuration {
}
