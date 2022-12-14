package hibernate_one_to_many_uni;

import hibernate_one_to_many_uni.entity.Department;
import hibernate_one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        try (Session session = sessionFactory.getCurrentSession()) {

//            Department department = new Department("HR", 5000, 1000);
//            Employee employee1 = new Employee("Svami", "Petrov", 150);
//            Employee employee2 = new Employee("Rama", "Sidorov", 250);
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//            session.beginTransaction();
//            session.save(department);
//            session.getTransaction().commit();
//            System.out.println("done");

//            session.beginTransaction();
//            Department department = session.get(Department.class, 1);
//            System.out.println(department);
//            System.out.println(department.getEmployees());
//            session.getTransaction().commit();
//            System.out.println("done");

//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee);
//            session.getTransaction().commit();
//            System.out.println("done");

//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee);
//            session.delete(employee);
//            session.getTransaction().commit();
//            System.out.println("done");

            session.beginTransaction();
            Department department = session.get(Department.class, 4);
            System.out.println(department);
            session.delete(department);
            session.getTransaction().commit();
            System.out.println("done");

        } finally {
            sessionFactory.close();
        }


    }
}
