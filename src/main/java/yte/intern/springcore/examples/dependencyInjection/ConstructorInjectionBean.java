package yte.intern.springcore.examples.dependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectionBean {

    public void print() {
        System.out.println("Ben bir constructor injection bean'iyim!");
    }
}
