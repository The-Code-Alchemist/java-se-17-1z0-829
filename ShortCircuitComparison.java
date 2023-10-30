public class ShortCircuitComparison {
    public static void main(String[] args) {

        int rabbit = 6;
        boolean bunny = (rabbit >= 6) || (++rabbit <= 7);
        System.out.println(rabbit);
        System.out.println(bunny);

        boolean hare = (rabbit >= 6) | (++rabbit <= 7);
        System.out.println(rabbit);
        System.out.println(hare);
    }   //  page 90
}
