package yte.intern.springcore.examples.beanConfiguration;

import org.springframework.stereotype.Component;

@Component
public class ComponentTest {

    public void print() {
        System.out.println("Ben @Component kullanıyorum!");
    }
}
