package com.zhuweiwei.dubbo.provider.server;

import com.zhuweiwei.dubbo.provider.entity.TestEntity;

/**
 * @author 朱伟伟
 * @date 2020-10-08 12:38:28
 * @description
 */
public interface DemoService {
    String sayHello(String name);

    TestEntity getTestEntity(TestEntity testEntity);
}
