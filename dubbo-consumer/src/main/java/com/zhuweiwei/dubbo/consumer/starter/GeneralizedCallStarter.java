package com.zhuweiwei.dubbo.consumer.starter;

import com.zhuweiwei.dubbo.provider.entity.TestEntity;
import org.apache.dubbo.rpc.service.GenericService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 朱伟伟
 * @date 2020-10-08 16:38:44
 * @description 泛化引用测试
 */
public class GeneralizedCallStarter {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:generalized-call-consumer.xml");
        applicationContext.start();
        //获取bean失败
//        GenericService genericService = (GenericService) applicationContext.getBean(DemoService.class);
        GenericService genericService = (GenericService) applicationContext.getBean("demoService");
        System.out.println(genericService.$invoke("sayHello", new String[]{String.class.getName()}, new Object[]{"Generalized call"}));
        Map<String, Object> map = new HashMap<>(5);
        map.put("name", "郭静静");
        map.put("age", 28);
        Object object = genericService.$invoke("getTestEntity", new String[]{TestEntity.class.getName()}, new Object[]{map});
        System.out.println(object.getClass().getName());
        if (object instanceof Map) {
            map = (Map<String, Object>) object;
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
    }
}
