package com.zhuweiwei.dubbo.provider.spi.java;

import java.util.ServiceLoader;

/**
 * @author 朱伟伟
 * @date 2020-10-10 11:09:06
 * @description
 */
public class JavaSpiTest {
    public static void main(String[] args) {
        ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
        System.out.println("Java Spi");
        serviceLoader.forEach(Robot::sayHello);
    }
}
