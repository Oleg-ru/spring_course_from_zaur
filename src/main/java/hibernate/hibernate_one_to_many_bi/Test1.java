package hibernate.hibernate_one_to_many_bi;

import hibernate.hibernate_one_to_many_bi.entity.Department;
import hibernate.hibernate_one_to_many_bi.entity.Employee;
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
//            Department department = new Department("Sber", 1000, 10000);
//            Employee employee1 = new Employee("Jhon", "Salivan", 1100);
//            Employee employee2 = new Employee("Robe", "Kelokov", 1250);
//            Employee employee3 = new Employee("Zali", "Szopono", 9000);
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//            department.addEmployeeToDepartment(employee3);
            session.beginTransaction();
//            session.save(department);

            System.out.println("Get department");
            Department department = session.get(Department.class, 3);

            System.out.println("Show department");
            System.out.println(department);



//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());

//            Employee employee = session.get(Employee.class, 2);
//            session.delete(employee);


            session.getTransaction().commit();
            System.out.println("Show employees of the department");
            System.out.println(department.getEmps());
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
