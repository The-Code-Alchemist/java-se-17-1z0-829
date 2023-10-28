import java.sql.Date;
import java.util.*;

public class Conflicts {
    Date date; // java.sql.Date; // Explicit imports take precedence over wildcard imports.
    java.util.Date utilDate = new java.util.Date(); // can be used with the fully qualified name, though
    // page 15
}
