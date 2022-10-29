package hibernate_many_to_many;


import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        try (Session session = sessionFactory.getCurrentSession()) {

//            Section section1 = new Section("section1");
//            Child child1 = new Child("Ivan", 3);
//            Child child2 = new Child("Masha", 6);
//            Child child3 = new Child("Oleg", 7);
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//            session.beginTransaction();
//            session.save(section1);
//            session.getTransaction().commit();
//            System.out.println("done");

//            Section section1 = new Section("section111");
//            Section section2 = new Section("section222");
//            Section section3 = new Section("section333");
//            Child child1 = new Child("Ivan300", 303);
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//            session.beginTransaction();
//            session.save(child1);
//            session.getTransaction().commit();
//            System.out.println("done");

//            session.beginTransaction();
//            Section section = session.get(Section.class, 1);
//            System.out.println(section);
//            System.out.println(section.getChildList());
//            session.getTransaction().commit();
//            System.out.println("done");

//            session.beginTransaction();
//            Child child = session.get(Child.class, 4);
//            System.out.println(child);
//            System.out.println(child.getSections());
//            session.getTransaction().commit();
//            System.out.println("done");

            session.beginTransaction();
            Section section = session.get(Section.class, 1);
            session.delete(section);
            System.out.println(section);
            System.out.println(section.getChildList());
            session.getTransaction().commit();
            System.out.println("done");


        } finally {
            sessionFactory.close();
        }


    }
}
