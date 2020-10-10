package com.zhuweiwei.dubbo.provider.starter;

import com.zhuweiwei.dubbo.provider.server.DemoService;
import com.zhuweiwei.dubbo.provider.server.impl.DemoServiceImpl;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;

import java.io.IOException;

/**
 * @author 朱伟伟
 * @date 2020-10-08 14:05:27
 * @description
 */
public class ApiProviderStarter {
    public static void main(String[] args) {
        DemoService demoService = new DemoServiceImpl();

        ApplicationConfig applicationConfig = new ApplicationConfig("api-dubbo-provider");

        RegistryConfig registryConfig = new RegistryConfig("nacos://127.0.0.1:8848");
//        RegistryConfig registryConfig = new RegistryConfig("zookeeper://127.0.0.1:2181");

        ProtocolConfig protocolConfig = new ProtocolConfig("dubbo", -1);

        ServiceConfig<DemoService> demoServiceServiceConfig = new ServiceConfig<>();
        demoServiceServiceConfig.setApplication(applicationConfig);
        demoServiceServiceConfig.setRegistry(registryConfig);
        demoServiceServiceConfig.setProtocol(protocolConfig);
        demoServiceServiceConfig.setInterface(DemoService.class);
        demoServiceServiceConfig.setRef(demoService);
        demoServiceServiceConfig.setVersion("1.0.0");
        demoServiceServiceConfig.export();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
