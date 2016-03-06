package OOP.HillelLesson8.inheritance.hierarchy;

/**
 * Created by test on 06.03.16.
 */
public class InheritanceMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Ivan");

        Employee employee = new Employee();
        employee.setPosition("programmer");
        employee.setName("Denis");

        Manager manager = new Manager();
        manager.setName("Igor");
        manager.setPosition("director");
        manager.fire(employee);

        person.getName();

        Person employeeAsPerson = employee;
        //employeeAsPerson = person;

    }
}
