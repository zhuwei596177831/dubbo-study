package com.zhuweiwei.dubbo.provider.entity;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * @author 朱伟伟
 * @date 2020-10-11 14:19:11
 * @description
 */
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 2050360968222294839L;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
