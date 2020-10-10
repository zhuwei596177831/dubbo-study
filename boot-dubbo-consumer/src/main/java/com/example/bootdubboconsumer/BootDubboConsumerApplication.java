package com.example.bootdubboconsumer;

import com.example.bootdubboconsumer.component.BootConsumerAction;
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
        IntStream.range(0, 20).forEach(i -> System.out.println(bootConsumerAction.doSayHello("Hello World")));
    }
}
