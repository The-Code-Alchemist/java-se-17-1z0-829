import java.lang.System;    // automatically imported  redundant for an explicit import
import java.lang.*;         // automatically imported, redundant for an explicit import
import java.util.Random;    // explicitly imported single class
import java.util.*;         // explicitly imported with wildcard, currently redundant

public class RedundantImportExample {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));
    }   // from pages 13-14
}
