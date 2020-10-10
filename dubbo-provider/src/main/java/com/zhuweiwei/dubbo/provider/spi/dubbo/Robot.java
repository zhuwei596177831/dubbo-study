package com.zhuweiwei.dubbo.provider.spi.dubbo;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author 朱伟伟
 * @date 2020-10-10 11:06:33
 * @description
 */
@SPI
public interface Robot {
    void sayHello();
}
