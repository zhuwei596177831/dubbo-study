package com.zhuweiwei.dubbo.provider.spi.java;

/**
 * @author 朱伟伟
 * @date 2020-10-10 11:07:22
 * @description
 */
public class OptimusPrime implements Robot {
    @Override
    public void sayHello() {
        System.out.println("Hello, I am Optimus Prime.");
    }
}
