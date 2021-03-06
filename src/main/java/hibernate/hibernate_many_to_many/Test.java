package hibernate.hibernate_many_to_many;

import hibernate.hibernate_many_to_many.entity.Child;
import hibernate.hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;
        try {
//            session = sessionFactory.getCurrentSession();
//
//            Section section1 = new Section("Football");
//            Child child1 = new Child("Cin", 6);
//            Child child2 = new Child("Xuy", 11);
//            Child child3 = new Child("Lom", 9);
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//            session.save(section1);
//            session.getTransaction().commit();
//            //************************************************
//            session = sessionFactory.getCurrentSession();
//
//            Section section1 = new Section("Volleyball");
//            Section section2 = new Section("Cheese");
//            Section section3 = new Section("Math");
//            Child child1 = new Child("Igor", 15);
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//
//            session.beginTransaction();
//            session.save(child1);
//            session.getTransaction().commit();
//            //************************************************
//            session = sessionFactory.getCurrentSession();
//
//            session.beginTransaction();
//            Section section = session.get(Section.class, 1);
//            System.out.println(section);
//            System.out.println(section.getChildren());
//            session.getTransaction().commit();
//            //************************************************
//            session = sessionFactory.getCurrentSession();
//
//            session.beginTransaction();
//            Child child = session.get(Child.class, 4);
//            System.out.println(child);
//            System.out.println(child.getSections());
//            session.getTransaction().commit();
//            //************************************************
//            session = sessionFactory.getCurrentSession();
//
//            session.beginTransaction();
//            Section section = session.get(Section.class, 1);
//            session.delete(section);
//            session.getTransaction().commit();
            //************************************************
//            session = sessionFactory.getCurrentSession();
//
//            Section section1 = new Section("Dance");
//            Child child1 = new Child("Klim", 4);
//            Child child2 = new Child("Bim", 8);
//            Child child3 = new Child("Bob", 7);
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//            session.persist(section1);
//            session.getTransaction().commit();
//            //************************************************
//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//
//            Section section1 = session.get(Section.class, 7);
//            session.delete(section1);
//
//            session.getTransaction().commit();
//            //************************************************
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            Child child = session.get(Child.class, 6);
            session.delete(child);

            session.getTransaction().commit();
            //************************************************
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
