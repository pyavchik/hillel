package OOP.HillelLesson6;

/**
 * Created by test on 29.02.16.
 */
public class Cat {
    private String color;
    private String name;
    private int birhYear;
    private String[] vaccines = new String[10];
    private int vaccineCount;

    public Cat(String color, String name, int birhYear) {
        this.color = color;
        this.name = name;
        this.birhYear = birhYear;
    }

    public void meow(){
        System.out.println("meaw");
    }

    public void vaccinate(String vaccine){
        vaccines[vaccineCount] = vaccine;
        vaccineCount++;
        meow();
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public int getBirhYear() {
        return birhYear;
    }

    public int getVaccinCount(){
        return vaccineCount;
    }

    public void setName(String name) {
        this.name = name;
    }
}
