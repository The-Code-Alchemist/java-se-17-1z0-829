/**
 * @author The Code Alchemist
 * Modifying the content/data in a final array is possible
 * Trying to change the value of the reference will not compile
 */
public class LocalVariableExample {
    public static void main(String[] args) {
        final int[] favoriteNumbers = new int[10];
        favoriteNumbers[0] = 10;
        favoriteNumbers[1] = 20;
//        favoriteNumbers = null;   // will not compile

    }   // page 39
}
