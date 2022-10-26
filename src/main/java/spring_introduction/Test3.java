package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person myPerson = context.getBean("myPerson", Person.class);
        myPerson.callYourPet();

        System.out.println(myPerson.getSurname());
        System.out.println(myPerson.getAge());

        context.close();
    }
}
