package yte.intern.springcore.examples.beanConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public BeanTest beanTest() {
        return new BeanTest();
    }
}
