package hibernate.hibernate_test;

import hibernate.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//            Employee refEmp = session.get(Employee.class, 9);
//            refEmp.setName("Кузя");
//            refEmp.setSurname("Кушков");
//            refEmp.setSalary(40);

            session
                    .createQuery("update Employee set salary=550 where name='Кузя'")
                    .executeUpdate();



            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
