import java.util.*; // wildcard import

public class NumberPicker {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10)); // wildcard imported
        System.out.println(new Date());          // wildcard imported
    }   // from page 13
}
