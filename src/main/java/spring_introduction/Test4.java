package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog dog1 = context.getBean("myPet", Dog.class);
        Dog dog2 = context.getBean("myPet", Dog.class);
//        dog1.setName("Pes");
//        dog2.setName("Varsity");
//
//        System.out.println(dog1.getName() + "\n" + dog2.getName());

        context.close();
    }
}
