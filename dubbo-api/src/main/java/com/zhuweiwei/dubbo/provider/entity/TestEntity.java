package com.zhuweiwei.dubbo.provider.entity;

import com.alibaba.fastjson.JSON;

/**
 * @author 朱伟伟
 * @date 2020-10-08 16:55:32
 * @description
 */
public class TestEntity {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
