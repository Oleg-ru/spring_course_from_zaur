
package spring_introduction;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Dog implements Pet{

//    private String name;

    public Dog() {
        System.out.println("Dog create");
    }


    @PostConstruct
    public void init() {
        System.out.println("Class dog: init method");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Class dog: method destroy");
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    @Override
    public void say() {
        System.out.println("Gav-gav");
    }
}
