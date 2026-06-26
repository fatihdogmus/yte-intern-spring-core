package yte.intern.springcore.beantest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DependencyInjectionTest {

    @Autowired
    private FieldInjectionBean fieldInjectionBean;

    private SetterInjectionBean setterInjectionBean;

    private ConstructorInjectionBean constructorInjectionBean;

    @Autowired
    public DependencyInjectionTest(ConstructorInjectionBean constructorInjectionBean) {
        this.constructorInjectionBean = constructorInjectionBean;
    }

    @Autowired
    public void setSetterInjectionBean(SetterInjectionBean setterInjectionBean) {
        this.setterInjectionBean = setterInjectionBean;
    }

    public void print() {
        fieldInjectionBean.print();
        setterInjectionBean.print();
        constructorInjectionBean.print();
    }
}
