/**
 * @author The Code Alchemist
 * We are instructing the compiler to determine the variable's type on line 7 which is an int
 * A String value can't be assigned to a variable that was determined to be an int already such as on line 10
 * line 11 tries int number = "five";
 * line 12 shows that null can't be assigned to var
 */
public class VarKeyword {
    public static void main(String[] args) {
        var number = 7;
        number = 4;
//        var number = "five";      // Can't assign String value to an int variable.

//        var cannotBeNull = null;  //
    }   // page 42

}
