package yte.intern.springcore.examples.beanConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InjectionTest {

    private ComponentTest componentTest;
    private BeanTest beanTest;

    @Autowired
    public InjectionTest(final ComponentTest componentTest, final BeanTest beanTest) {
        this.componentTest = componentTest;
        this.beanTest = beanTest;
    }

    public void print() {
        componentTest.print();
        beanTest.print();
    }
}
