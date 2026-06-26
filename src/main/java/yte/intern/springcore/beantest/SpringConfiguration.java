package yte.intern.springcore.beantest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean
    public BeanTest beanTest() {
        return new BeanTest();
    }
}
