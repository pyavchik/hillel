package HomeWorkOOP.HillelHomeWorkLesson7;

/**
 * Created by oleksandrpiavchik on 04.03.16.
 */
public class ImpovedArrayExample {
    public static void main(String[] args) {
        ImprovedArray improvedArray = new ImprovedArray();
        ImprovedArray otherImprovedArray = new ImprovedArray();
        otherImprovedArray.add("string1");
        otherImprovedArray.add("string2");
        otherImprovedArray.add("string3");
        otherImprovedArray.add("string4");
        otherImprovedArray.add("string5");
        otherImprovedArray.add("string6");
        otherImprovedArray.add("string7");
        otherImprovedArray.add("string8");
        otherImprovedArray.add("string9");
        otherImprovedArray.add("string10");
        otherImprovedArray.add("string11");

        improvedArray.add("string1");
        improvedArray.add("string2");
        improvedArray.add("string3");
        improvedArray.add("string4");
        improvedArray.add("string5");
        improvedArray.add("string6");
        improvedArray.add("string7");
        improvedArray.add("string8");
        improvedArray.add("string9");
        improvedArray.add("string10");
        improvedArray.add("string11");

        System.out.println(improvedArray.equals(otherImprovedArray));

        System.out.println(improvedArray.get(4));
        System.out.println("There are " + improvedArray.size() + " elements in array");

        System.out.println(improvedArray.toString());
    }
}
