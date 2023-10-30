public class CompoundAssignmentExample {
    public static void main(String[] args) {
        int camel =2, giraffe = 3;
        camel *= giraffe;                   //  is equivalent to    camel = camel * giraffe;
        System.out.println(camel);

        long goat = 10;
        int sheep = 5;
        // sheep = (int) (sheep * goat);    // will not compile without casting
        sheep *= goat;                      // compound assignment casts automatically to int in this case
        System.out.println(sheep);

    }   //  from pages 81 and 82
}
