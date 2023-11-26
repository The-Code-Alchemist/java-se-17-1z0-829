public class Swan {
    int numberEggs;                             // instance variable
    public static void main(String[] args) {
        Swan mother = new Swan();
        mother.numberEggs = 1;                  // set variable
        // numberEggs = 7;                      // Non-static field 'numberEggs' cannot be referenced from a static context
        System.out.println(mother.numberEggs);  // read variable
    }   // page 24
}
