package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Person personBean = context.getBean("personBean", Person.class);
        personBean.callYourPet();
        System.out.println(personBean.getAge());
        System.out.println(personBean.getSurname());

//        Cat catBean = context.getBean("cat", Cat.class);
//        catBean.say();

        context.close();
    }
}
