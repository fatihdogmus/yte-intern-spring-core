package yte.intern.springcore.examples.dependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class SetterInjectionBean {

    public void print() {
        System.out.println("Ben bir setter injection bean'iyim!");
    }
}
