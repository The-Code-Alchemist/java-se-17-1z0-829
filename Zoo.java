/**
 * @author The Code Alchemist
 * Passing only no arguments causes an ArrayIndexOutOfBoundsException on line 13
 * Passing only one argument causes an ArrayIndexOutOfBoundsException on line 14
 *
 * Explanation: the next line compiles and runs Zoo.java with one command which can be used on single sources
 * java Zoo.java "Bronx is a borough in New York City" Zoo
 * The text between double quotes is a single argument
 * A space separates arguments
 * */
public class Zoo {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}   // page 9-10