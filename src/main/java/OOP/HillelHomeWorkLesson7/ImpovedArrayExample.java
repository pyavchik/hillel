package OOP.HillelHomeWorkLesson7;

/**
 * Created by oleksandrpiavchik on 04.03.16.
 */
public class ImpovedArrayExample {
    public static void main(String[] args) {
        ImprovedArray improvedArray = new ImprovedArray();
        ImprovedArray otherImprovedArray = new ImprovedArray();

        System.out.println(improvedArray.equals(otherImprovedArray));
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
        improvedArray.add("string12");
        improvedArray.add("string13");
        improvedArray.add("string14");
        improvedArray.add("string15");
        improvedArray.add("string16");
        improvedArray.add("string17");
        improvedArray.add("string18");
        improvedArray.add("string19");
        improvedArray.add("string20");
        improvedArray.add("string21");
        improvedArray.add("string22");
        improvedArray.add("string23");
        improvedArray.add("string24");
        improvedArray.add("string25");
        improvedArray.add("string26");
        improvedArray.add("string27");
        improvedArray.add("string28");
        improvedArray.add("string29");
        improvedArray.add("string30");
        improvedArray.add("string31");
        improvedArray.add("string32");
        System.out.println(improvedArray.equals(otherImprovedArray));

        System.out.println(improvedArray.get(4));
        System.out.println("There are " + improvedArray.size() + " elements in array");

        System.out.println(improvedArray.toString());
    }
}
