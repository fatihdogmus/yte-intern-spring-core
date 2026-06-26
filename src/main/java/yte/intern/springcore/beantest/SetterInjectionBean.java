package yte.intern.springcore.beantest;

import org.springframework.stereotype.Component;

@Component
public class SetterInjectionBean {

    public void print() {
        System.out.println("Setter injection bean");
    }
}
