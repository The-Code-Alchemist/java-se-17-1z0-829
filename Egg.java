public class Egg {
    public Egg() {
        number = 5;             // step 3
    }
    public static void main(String[] args) {
        Egg egg = new Egg();
        System.out.println(egg.number); // 5
    }

    private int number = 3;     // step 1
    { number = 4; }             // step 2
    // page 26
}
