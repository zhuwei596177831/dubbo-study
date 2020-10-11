package com.example.bootdubboconsumer;

import com.alibaba.fastjson.JSON;
import com.example.bootdubboconsumer.component.BootConsumerAction;
import com.zhuweiwei.dubbo.provider.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.IntStream;

@SpringBootApplication
public class BootDubboConsumerApplication implements ApplicationRunner {

    @Autowired
    private BootConsumerAction bootConsumerAction;

    public static void main(String[] args) {
        SpringApplication.run(BootDubboConsumerApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        TestEntity testEntity = new TestEntity();
        testEntity.setName("朱伟伟");
        testEntity.setAge(26);
        System.out.println(JSON.toJSON(bootConsumerAction.doTestEntity(testEntity)));
        IntStream.range(0, 10).forEach(i -> System.out.println(bootConsumerAction.doSayHello("Hello World")));
    }
}
