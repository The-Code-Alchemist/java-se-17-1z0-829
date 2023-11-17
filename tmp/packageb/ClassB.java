package tmp.packageb;
import tmp.*;
import tmp.packagea.ClassA;

/**
 * @author The Code Alchemist
 * ClassC can be imported using a wildcard import such as on line 2 or explicitly
 * import tmp.ClassC;
 *
 */
public class ClassB {
    public static void main(String[] args) {
        ClassA a;
        ClassC c;
        System.out.println("Got it");
    }
}
