package com.zhuweiwei.dubbo.provider.spi.dubbo;


/**
 * @author 朱伟伟
 * @date 2020-10-10 11:07:40
 * @description
 */
public class Bumblebee implements Robot {
    @Override
    public void sayHello() {
        System.out.println("Hello, I am Bumblebee.");
    }
}
