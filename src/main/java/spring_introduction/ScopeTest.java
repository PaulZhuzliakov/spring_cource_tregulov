package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Dog dog1 = context.getBean("dogBean", Dog.class);
        Dog dog2 = context.getBean("dogBean", Dog.class);

        System.out.println(dog1 == dog2);
    }
}
