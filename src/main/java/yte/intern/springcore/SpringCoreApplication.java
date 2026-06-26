package yte.intern.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import yte.intern.springcore.beantest.InjectionTest;

@SpringBootApplication
public class SpringCoreApplication {

    void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringCoreApplication.class, args);

//        ComponentTest componentTest = context.getBean(ComponentTest.class);
//        componentTest.printMessage();

//        DependencyInjectionTest dependencyInjectionTest = context.getBean(DependencyInjectionTest.class);
//        dependencyInjectionTest.print();

//        LifecycleBean lifecycleBean = context.getBean(LifecycleBean.class);
//        lifecycleBean.print();

        InjectionTest injectionTest = context.getBean(InjectionTest.class);
        injectionTest.print();
    }
}
