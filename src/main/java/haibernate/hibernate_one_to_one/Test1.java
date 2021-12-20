package haibernate.hibernate_one_to_one;

import haibernate.hibernate_one_to_one.entity.Detail;
import haibernate.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();

//            Employee emp = new Employee("Oleg", "Viktorovich", "IT", 1000);
//            Detail dt = new Detail("New York", "214144", "oleg@mail.bk");
//            Employee emp = new Employee("Zaur", "Tregulov", "IT", 500);
//            Detail dt = new Detail("Moscow", "41182", "zaur.tre@gmail.com");
//            emp.setEmpDetail(dt);
//
//            session.beginTransaction();
//            session.save(emp);
//            session.getTransaction().commit();

            session.beginTransaction();
            Employee employeeIn = session.get(Employee.class, 2);
            session.delete(employeeIn);
            session.getTransaction().commit();

            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
