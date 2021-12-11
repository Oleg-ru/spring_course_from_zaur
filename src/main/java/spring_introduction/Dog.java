package spring_introduction;

public class Dog implements Pet{

//    private String name;

    public Dog() {
        System.out.println("Dog create");
    }


    public void init() {
        System.out.println("Class dog: init method");
    }

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
