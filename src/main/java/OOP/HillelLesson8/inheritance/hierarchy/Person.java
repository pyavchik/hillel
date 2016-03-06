package OOP.HillelLesson8.inheritance.hierarchy;

/**
 * Created by test on 06.03.16.
 */
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void greeting(){
        System.out.println("Hello, I am a person my name is " + getName());
    }

}
