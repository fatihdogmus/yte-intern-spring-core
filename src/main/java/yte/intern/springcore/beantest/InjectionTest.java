package yte.intern.springcore.beantest;

import org.springframework.stereotype.Component;

@Component
public class InjectionTest {

    private ComponentTest componentTest;

    private BeanTest beanTest;

    public InjectionTest(ComponentTest componentTest, BeanTest beanTest) {
        this.componentTest = componentTest;
        this.beanTest = beanTest;
    }

    public void print() {
        beanTest.print();
        componentTest.printMessage();
    }
}
