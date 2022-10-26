package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Cat cat1 = context.getBean("myPet", Cat.class);
        Cat cat2 = context.getBean("myPet", Cat.class);

//        cat1.setName("111");
//        cat2.setName("222");

//        System.out.println(cat1.getName());
//        System.out.println(cat2.getName());

        System.out.println(cat1 == cat2);

        context.close();
    }
}
