/**
 * @author The Code Alchemist
 * The constructor of a class mathces the class name and has no return type, not even void
 * setting field executed first - instance initializer
 * setting constructor executed second
 * name shown last
 */
public class AnotherChick {
    private String name = "Fluffy";
    { System.out.println("setting field"); }        // 1
    public AnotherChick() {
        name = "Tiny";                              // 3
        System.out.println("setting constructor");  // 2
    }
    public static void main(String[] args) {
        AnotherChick chick = new AnotherChick();    // 2
        System.out.println(chick.name);             // 3
    }   // page 25 - 26
}