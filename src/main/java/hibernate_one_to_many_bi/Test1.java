package hibernate_one_to_many_bi;


import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
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

//            Department department = new Department("IT", 3000, 100);
//            Employee employee1 = new Employee("Ivan", "Johnson", 150);
//            Employee employee2 = new Employee("Boris", "tanaka", 250);
//            Employee employee3 = new Employee("Boris", "BulletDodger", 250);
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//            department.addEmployeeToDepartment(employee3);
//            session.beginTransaction();
//            session.save(department);
//            session.getTransaction().commit();
//            System.out.println("done");

            session.beginTransaction();
            System.out.println("get Department");
            Department department = session.get(Department.class, 5);
            System.out.println("show Department");
            System.out.println(department);
            System.out.println("show employees of the Department");
            System.out.println(department.getEmployees());
            session.getTransaction().commit();
            System.out.println("done");

//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//            session.delete(employee);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//            session.getTransaction().commit();
//            System.out.println("done");

//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//            session.getTransaction().commit();
//            System.out.println("done");

        } finally {
            sessionFactory.close();
        }


    }
}
