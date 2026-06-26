package yte.intern.springcore.beantest;

import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectionBean {

    public void print() {
        System.out.println("Constructor injection bean");
    }
}
