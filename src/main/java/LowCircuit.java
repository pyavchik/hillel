/**
 * Created by User on 12.02.2016.
 */
public class LowCircuit {
    public static void main(String[] args) {
//        if (firstFunktion() || secondFunktion()){
//            System.out.println("In Main");
//        }

//        if (firstFunktion() && secondFunktion()){
//            System.out.println("In Main");
//        }

        if (firstFunktion() & secondFunktion()){
            System.out.println("In Main");
        }

    }

    public static boolean firstFunktion(){
        System.out.println("In First Function");
        return true;
    }

    public static boolean secondFunktion(){
        System.out.println("In Second Function");
        return false;
    }
}
