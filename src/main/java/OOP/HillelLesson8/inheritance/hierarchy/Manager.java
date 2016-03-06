package OOP.HillelLesson8.inheritance.hierarchy;

/**
 * Created by test on 06.03.16.
 */
public class Manager extends Employee {
    public void fire(Employee employee){
        System.out.println(employee.position + " " + employee.getName() + " fired by " + position + " " + getName());
    }

    @Override
    public void greeting() {
        System.out.println("Hello, I am a manager. My name is " + getName());
    }
}
