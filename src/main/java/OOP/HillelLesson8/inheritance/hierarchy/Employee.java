package OOP.HillelLesson8.inheritance.hierarchy;

/**
 * Created by test on 06.03.16.
 */
public class Employee extends Person{
    String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String getName() {
        return super.getName().toUpperCase() + "!";
    }

    @Override
    public void greeting(){
        System.out.println("Hello, I am emploee, my name is " + getName());
    }

}
