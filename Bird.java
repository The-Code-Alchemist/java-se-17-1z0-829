/**
 * @author The Code Alchemist
 * There are four blocks in this example
 * 1) class definition
 * 2) main method declaration
 * 3) inner block within the main method
 * 4) instance initializer
 */
public class Bird { // 1
    public static void main(String[] args) { // 2
        { System.out.println("Feathers"); /*3*/ }
    }
    { System.out.println("Snowy"); } // 4
}   // page 25
