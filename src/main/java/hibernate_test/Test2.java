package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {

            SessionFactory sessionFactory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Employee.class)
                    .buildSessionFactory();

            try {
                Employee employee = new Employee("Ivan2", "Ivanov", "IT", 1000);

                Session session = sessionFactory.getCurrentSession();
                session.beginTransaction();
                session.save(employee);

                int id = employee.getId();

                session.get(Employee.class, id);
                session.getTransaction().commit();

                System.out.println("done");
                System.out.println(employee);
            } finally {
                sessionFactory.close();
            }
    }
}
