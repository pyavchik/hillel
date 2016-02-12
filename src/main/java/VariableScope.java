/**
 * Created by User on 12.02.2016.
 */
public class VariableScope {
    public static void main(String[] args) {
        int num = 5;

        if (num > 0){
            int v1 = 3;
            System.out.println("More than zero");
            System.out.println(v1);
        }

        System.out.println(num);
        //System.out.println(v1);
    }
}
