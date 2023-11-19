/**
 * @author The Code Alchemist
 * The package needs to be the first non-comment statement
 * import statements come next
 * fields and methods can be in any order as long as they are present
 */
package example;
import java.util.*;

public class MeerKat {
    static String name = "Kitty";
    static double weight = 20;
    public static double getWeight() {
        return weight;
    }

    public static void main(String[] args) {
        double height = 18.5; // needs to be static outside the main method

        System.out.println(name + " weighed " + getWeight() + "KGs" + " with a height of " + height + " on " + new Date());
    }
}
