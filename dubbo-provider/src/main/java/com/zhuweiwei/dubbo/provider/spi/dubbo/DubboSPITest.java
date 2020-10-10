package com.zhuweiwei.dubbo.provider.spi.dubbo;

import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @author 朱伟伟
 * @date 2020-10-10 11:22:05
 * @description
 */
public class DubboSPITest {
    public static void main(String[] args) {
        ExtensionLoader<Robot> extensionLoader =
                ExtensionLoader.getExtensionLoader(Robot.class);
        Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
        optimusPrime.sayHello();
        Robot bumblebee = extensionLoader.getExtension("bumblebee");
        bumblebee.sayHello();
    }
}
