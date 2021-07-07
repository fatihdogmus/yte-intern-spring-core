package yte.intern.springcore.examples.lifecycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifecycleBean {

    public void print() {
        System.out.println("Print içerisindeyim!");
    }

    @PostConstruct
    public void init() {
        System.out.println("PostContruct içerisindeyim!");
    }

    public LifecycleBean() {
        System.out.println("Constructor içerisindeyim!");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy içerisindeyim!");
    }
}
