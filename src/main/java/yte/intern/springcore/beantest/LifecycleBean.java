package yte.intern.springcore.beantest;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class LifecycleBean {

    public LifecycleBean() {
        System.out.println("Inside constructor");

    }

    @PostConstruct
    public void init() {
        System.out.println("Inside init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Inside destroy");
    }

    public void print() {
        System.out.println("Inside print");
    }
}
