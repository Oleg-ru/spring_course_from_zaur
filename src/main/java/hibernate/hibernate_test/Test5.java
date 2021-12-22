package hibernate.hibernate_test;

import hibernate.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            Employee refEmp = session.get(Employee.class, 10);
//            session.delete(refEmp);

            session.createQuery("delete Employee where name='Кузя'")
                    .executeUpdate();


            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
