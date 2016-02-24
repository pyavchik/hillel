package intro.HillelLesson4;

/**
 * Created by oleksandrpiavchik on 23.02.16.
 */
public class Binary {
    public static void main(String[] args) {
        int[] binary={1,0,0,0,1,0};
        int result=0;
        for (int i=0;i<binary.length;i++){
            result = result + (int) Math.pow(2,binary.length-1-i)*binary[i];
        }
        System.out.println(result);
    }
}