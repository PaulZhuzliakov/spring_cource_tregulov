package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();


        Employee employee = new Employee("Misha", "Lao", "manager", 3000);
        Detail detail = new Detail("Bekgrad", "1111111111", "misha@mail.com");
        detail.setEmployee(employee);



        employee.setEmpDetail(detail);


        try (Session session = sessionFactory.getCurrentSession()) {
            session.beginTransaction();

//            Detail detail1 = session.get(Detail.class, 5);
//            detail1.getEmployee().setEmpdetail(null);
//            session.delete(detail1);

            session.getTransaction().commit();
        } finally {
            sessionFactory.close();
        }

    }
}
