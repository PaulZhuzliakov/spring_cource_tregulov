package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("personBean")
public class Person {

    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

//    public Person() {
//        System.out.println("Person bean is created");
//    }

    @PostConstruct
    void init() {
        System.out.println("class Person init");
    }

    @PreDestroy
    void destroy() {
        System.out.println("class Person destroy");
    }

//    @Autowired
//    public Person(@Qualifier("dogBean") Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

    @Autowired
    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello my lovely pet");
        pet.say();
    }

    //    @Autowired
    public void setPet(Pet pet) {
        System.out.println("set Pet");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("setSurname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setAge");
        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }
}
