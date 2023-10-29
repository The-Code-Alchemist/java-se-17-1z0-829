public class CastingNumericalValues {
    public static void main(String[] args) {
        short mouse = 10;
        short hamster = 3;
        short capybara = (short) (mouse * hamster); // both short variables mouse and hamster need to be enclosed in parentheses
        System.out.println(capybara);   // 30
    }
}
