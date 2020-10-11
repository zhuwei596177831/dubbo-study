package com.example.bootdubboprovider.service.impl;

import com.zhuweiwei.dubbo.provider.entity.TestEntity;
import com.zhuweiwei.dubbo.provider.server.BootDemoService;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.RpcContext;

/**
 * @author 朱伟伟
 * @date 2020-10-10 15:54:52
 * @description
 */
@DubboService
public class BootDemoServiceImpl implements BootDemoService {
    @Override
    public String sayHello(String name) {
        RpcContext rpcContext = RpcContext.getContext();
        return String.format("Service [name :%s , port : %d] %s(\"%s\") : Hello,%s",
                BootDemoService.class.getName(),
                rpcContext.getLocalPort(),
                rpcContext.getMethodName(),
                name,
                name);
    }

    @Override
    public TestEntity testEntity(TestEntity testEntity) {
        return testEntity;
    }
}
