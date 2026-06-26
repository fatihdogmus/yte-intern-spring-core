package yte.intern.springcore.beantest;

import org.springframework.stereotype.Component;

@Component
public class FieldInjectionBean {

    public void print() {
        System.out.println("Field injection bean");
    }
}
