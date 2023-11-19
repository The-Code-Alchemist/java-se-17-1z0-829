/**
 * @author The Code Alchemist
 * The constructor of a class mathces the class name and has no return type, not even void
 */
public class Chick {

    static String name = "Chickie";

    public Chick() {
        System.out.println("The default constructor has been called");
    }

    public static void main(String[] args) {
        Chick chick = new Chick();  // although the reference variable is not used further, the constructor is called
        System.out.println("Hi " + name);
    }   // page 23
}