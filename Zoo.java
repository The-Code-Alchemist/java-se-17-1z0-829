/**
 * @author The Code Alchemist
 * passing only no arguments causes an ArrayIndexOutOfBoundsException on line 13
 * passing only one argument causes an ArrayIndexOutOfBoundsException on line 14
 *
 * example and explanation
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