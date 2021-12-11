package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Pet pet1 = context.getBean("myPet", Dog.class);
        pet1.say();
        Pet pet2 = context.getBean("myPet", Dog.class);
        pet2.say();
        context.close();
    }
}
