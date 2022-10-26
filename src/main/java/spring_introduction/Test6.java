package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Person personBean = context.getBean("personBean", Person.class);
//        Person personBean2 = context.getBean("personBean", Person.class);
//        System.out.println(personBean.getPet() == personBean2.getPet());

        System.out.println(personBean.getAge());

//        personBean.callYourPet();

//        Pet catBean = context.getBean("catBean", Pet.class);
//        catBean.say();

        context.close();
    }
}
