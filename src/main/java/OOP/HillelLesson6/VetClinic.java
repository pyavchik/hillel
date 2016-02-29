package OOP.HillelLesson6;

/**
 * Created by test on 29.02.16.
 */
public class VetClinic {
    public static void main(String[] args) {
        Cat catTom = new Cat("Tom", "Blue", 2015);

        catTom.vaccinate("VACCINA");
        catTom.vaccinate("VACCINA");
        catTom.vaccinate("VACCINA");
        catTom.vaccinate("VACCINA");

        System.out.println(catTom.getBirhYear());
        System.out.println(catTom.getVaccinCount());

        catTom.setName("Murzik");

        System.out.println(catTom.getName());

        String name = catTom.getName();

        String newName = name.replace('T', 'K');

        System.out.println(newName);
    }

}
