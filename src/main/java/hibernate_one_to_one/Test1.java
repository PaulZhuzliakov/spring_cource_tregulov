package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();


//        try(sessionFactory; Session session = sessionFactory.getCurrentSession()) {
//
////            Employee employee = session.get(Employee.class, 1);
////            System.out.println(employee);
//
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//            session.getTransaction().commit();
//
//            System.out.println(employee);
//        }


        try(Session session = sessionFactory.getCurrentSession()) {
            session.beginTransaction();
           Employee employee = session.get(Employee.class, 4);
            session.delete(employee);
            session.getTransaction().commit();
        } finally {
            sessionFactory.close();
        }


//        try(sessionFactory; Session session = sessionFactory.getCurrentSession()) {
//
//            Employee employee = new Employee("Oleg", "Ivanov", "IT", 300_000);
//            Detail detail = new Detail("Tokyo", "1111111111", "qwefsdbdfg@mail.com");
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//            session.save(employee);
//            session.getTransaction().commit();
//        }
    }
}
