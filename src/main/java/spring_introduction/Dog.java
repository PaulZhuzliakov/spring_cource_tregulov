package spring_introduction;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("dogBean")
@Scope("prototype")
public class Dog implements Pet {

    public Dog() {
        System.out.println("Dog bean is created");
    }

    @PostConstruct
    void init() {
        System.out.println("class Dog init");
    }

    @PreDestroy
    void destroy() {
        System.out.println("class Dog destroy");
    }

    @Override
    public void say() {
        System.out.println("Bow-wow");
    }
}
