import java.sql.Date;
import java.util.*;

/**
 * @author The Code Alchemist
 * Explicit imports take precedence over wildcard imports.
 * Using both java.util and java.util with a wildcard will cause a compiler error
 *
 */
public class Conflicts {

    public static void main(String[] args) {
        /**
         * java.sql.Date is used here
         */
        Date sqlDate = new Date(2023,11,17);
        System.out.println(sqlDate);

        /**
         * java.util.Date can be used with the fully qualified name without importing it
         */
        java.util.Date utilDate = new java.util.Date();
        System.out.println(utilDate);
    }
}   // page 15
