package intro.Strings;

/**
 * Created by oleksandrpiavchik on 12.02.16.
 */

//Following example shows how to remove a character from a particular
//position from a string with the help of removeCharAt(string,position) method.

public class RemoveCharacterFromParticularPosition {
    public static void main(String args[]) {
        String str = "this is Java";
        System.out.println(removeCharAt(str, 3));
    }

    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}