package provider.starter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import provider.configuration.Provider1Configuration;

import java.io.IOException;

/**
 * @author 朱伟伟
 * @date 2020-10-08 14:36:52
 * @description
 */
public class AnnotationProvider1Starter {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(Provider1Configuration.class);
        applicationContext.start();
        System.in.read();
    }
}
