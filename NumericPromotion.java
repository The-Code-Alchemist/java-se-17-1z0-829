public class NumericPromotion {
    public static void main(String[] args) {
        int a = 1;
        long b = 33;
        var c = a * b;
        System.out.println(c);  //  c promoted to long

        double d = 39.21;
        float e = 2.11f;
        var f = d + e;
        System.out.println(f);  //  f promoted to double

        short g = 10;
        short h = 3;
        var i = g * h;
        System.out.println(i);  //  i promoted to int, i declared as a short will not compile without cast to short

        short w = 14;
        float x = 13;
        double y = 30;
        var z = w * x / y;
        System.out.println(z);  //  z promoted to double
    }
}
