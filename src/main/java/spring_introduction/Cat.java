package spring_introduction;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("catBean")
public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("meow_meow");
    }

    @PostConstruct
    public void init() {
        System.out.println("class Cat init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("class Cat destroy");
    }

}
