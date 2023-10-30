public class LogicalOperators {
    public static void main(String[] args) {
        boolean eyesClosed = true;
        boolean breathingSlowly = true;

        boolean resting = eyesClosed | breathingSlowly;
        System.out.println(resting);

        boolean asleep = eyesClosed & breathingSlowly;
        System.out.println(asleep);

        boolean awake = eyesClosed ^ breathingSlowly;
        System.out.println(awake);

    }   //  from page 88
}
