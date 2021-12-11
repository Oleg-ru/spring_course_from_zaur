package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
    //@Autowired
    //@Qualifier("dog")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

//    @Autowired
//    public Person(@Qualifier("dog") Pet pet) {
//        System.out.println("Created person");
//        this.pet = pet;
//    }

    public Person( Pet pet) {
        System.out.println("Created person");
        this.pet = pet;
    }

    public Person() {
    }

    //@Autowired
    public void setPet(Pet pet) {
        System.out.println("Pet created with set from person");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Hello my lovely Pet!!!");
        pet.say();
    }
}
