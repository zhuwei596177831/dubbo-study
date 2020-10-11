package com.zhuweiwei.dubbo.provider.server;

import com.zhuweiwei.dubbo.provider.entity.TestEntity;

/**
 * @author 朱伟伟
 * @date 2020-10-10 15:54:18
 * @description
 */
public interface BootDemoService {
    String sayHello(String name);

    TestEntity testEntity(TestEntity testEntity);
}
