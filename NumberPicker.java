import java.util.Random;

public class NumberPicker {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10)); // will not compile without the import on line 1
    }   // from page 11
}
