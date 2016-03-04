package OOP.HillelHomeWorkLesson7;

/**
 * Created by oleksandrpiavchik on 04.03.16.
 */
public class ImpovedArrayExample {
    public static void main(String[] args) {
        ImprovedArray improvedArray = new ImprovedArray();

        improvedArray.add("string1");
        improvedArray.add("string2");
        improvedArray.add("string3");
        improvedArray.add("string4");
        improvedArray.add("string5");
        improvedArray.add("string6");
        improvedArray.add("string7");
        improvedArray.add("string8");
        improvedArray.add("string9");


        System.out.println(improvedArray.get(4));
        System.out.println(improvedArray.size());


        System.out.println(improvedArray.toString());
    }
}
