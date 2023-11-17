import java.util.Random;

/**
 * @author The Code Alchemist
 * The class java.util.Random needs to be imported which cn be achieved in three ways
 * 1 wildcard   import java.util.*;
 * 2 explicitly import java.util.Random
 * 3 using the fully qualified name the same way on line 14
 */
public class NumberPicker {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));
        System.out.println(new java.util.Date());
    }   // from page 11-13
}
