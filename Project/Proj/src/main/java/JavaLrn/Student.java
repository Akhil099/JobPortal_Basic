package JavaLrn;

public class Student implements Human{
    @Override
    public void sleep() {
        System.out.println("Student needs to sleep");
    }

    @Override
    public void eat() {
        System.out.println("Student needs to eat");
    }
}
