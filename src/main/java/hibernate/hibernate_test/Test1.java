package hibernate.hibernate_test;

import hibernate.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Кузя", "кукушкин", "Курятник", 1770000);
            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();
            System.out.println("Добавление работника " + emp.getName() + " успешно завершено");
        } finally {
            factory.close();
        }
    }
}
