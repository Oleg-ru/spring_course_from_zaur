package haibernate.hibernate_one_to_many_uni;


import haibernate.hibernate_one_to_many_uni.entity.Department;
import haibernate.hibernate_one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();

//            Department department = new Department("ZBS", 100, 800);
//            Employee employee1 = new Employee("Rut", "Ys", 200);
//            Employee employee2 = new Employee("Zora", "Kurin", 500);
//            Employee employee3 = new Employee("Igor", "Liponov", 780);
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//            department.addEmployeeToDepartment(employee3);

            session.beginTransaction();
//            session.save(department);
//            Department department = session.get(Department.class, 2);
//            System.out.println(department);
//            System.out.println(department.getEmps());

//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());

//            Employee employee = session.get(Employee.class, 5);
//            session.delete(employee);
            Department delDepartment = session.get(Department.class, 2);
            session.delete(delDepartment);

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
