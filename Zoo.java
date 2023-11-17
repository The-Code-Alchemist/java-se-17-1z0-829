/**
 * @author The Code Alchemist
 * passing only no arguments causes an ArrayIndexOutOfBoundsException on line 3
 * passing only one argument causes an ArrayIndexOutOfBoundsException on line 4
 *
 * java Zoo.java "Bronx is a borough in New York City" Zoo
 * The text between double quotes is a single argument
 * */
public class Zoo {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}   // page 9-10