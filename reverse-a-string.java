// strings are immutable so you can't use the same things as the array of int.


// using string builder
import java.util.*;
class Main {
    public static void main(String[] args) {
     
        String a = "ABCDE";
        
        a = new StringBuilder(a).reverse().toString();  

        System.out.print(a);
    }
}

