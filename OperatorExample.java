public class OperatorExample {
    public static void main(String[] args) {
        boolean isAnimalAsleep = false;
        System.out.println(isAnimalAsleep);     //  false
        System.out.println(!isAnimalAsleep);    //  true

        int value = 3;                          //  0011
        int complement = ~value;                //  1100
        System.out.println(value);              //  3
        System.out.println(complement);         //  -4

        System.out.println(-1*value - 1);       //  -4
        System.out.println(-1*complement - 1);  //  3

        double zooTemperature = 1.21;
        System.out.println(zooTemperature);     //  1.21
        zooTemperature = -zooTemperature;
        System.out.println(zooTemperature);     //  -1.21
        zooTemperature = -(-zooTemperature);
        System.out.println(zooTemperature);     //  -1.21

    }   // demonstrates the examples from page 70
}
