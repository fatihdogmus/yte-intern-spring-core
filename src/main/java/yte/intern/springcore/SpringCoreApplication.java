package yte.intern.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import yte.intern.springcore.examples.beanConfiguration.InjectionTest;
import yte.intern.springcore.examples.dependencyInjection.DependencyInjectionTest;
import yte.intern.springcore.examples.ioc.IocTest;
import yte.intern.springcore.examples.lifecycle.LifecycleBean;

@SpringBootApplication
public class SpringCoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringCoreApplication.class, args);

    }

    private static void beanConfiguration(ApplicationContext context) {
        InjectionTest injectionTest = context.getBean(InjectionTest.class);
        injectionTest.print();
    }

    private static void lifecycle(ApplicationContext context) {
        LifecycleBean lifecycleBean = context.getBean(LifecycleBean.class);
        lifecycleBean.print();
    }

    private static void dependencyInjection(ApplicationContext context) {
        DependencyInjectionTest dependencyInjectionTest = context.getBean(DependencyInjectionTest.class);

        dependencyInjectionTest.print();
    }

    private static void iocTest(ApplicationContext context) {
        IocTest iocTest = context.getBean(IocTest.class);
        iocTest.test();
        IocTest iocTest2 = context.getBean(IocTest.class);
        iocTest2.name = "Muhammed";
        System.out.println(iocTest.name);
    }

}
