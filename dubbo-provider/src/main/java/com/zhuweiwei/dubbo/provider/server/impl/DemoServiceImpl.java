package com.zhuweiwei.dubbo.provider.server.impl;

import com.zhuweiwei.dubbo.provider.entity.TestEntity;
import com.zhuweiwei.dubbo.provider.server.DemoService;

/**
 * @author 朱伟伟
 * @date 2020-10-08 12:39:36
 * @description
 */
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

    @Override
    public TestEntity getTestEntity(TestEntity testEntity) {
        return testEntity;
    }
}
