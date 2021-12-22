package hibernate.hibernate_test;

import hibernate.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            List<Employee> employeeList = session
//                    .createQuery("from Employee")
//                    .getResultList();
            List<Employee> employeeList = session
                    .createQuery("from Employee " +
                            "where name = 'Кузя' and salary > 1")
                    .getResultList();

            employeeList.forEach(System.out::println);


            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
