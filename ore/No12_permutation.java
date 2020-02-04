import java.util.*;
import java.io.*;
import java.math.*;

public class No12_permutation {
    public static void main(String[] args) {
    	// String str = "abcd";
    	String str = "12345";
    	permutation(str, "");
    }
    
    public static void permutation(String q, String ans){
        // Base Case
        if(q.length() <= 1) {
            System.out.println(ans + q);
        }
        // General Case
        else {
            for (int i = 0; i < q.length(); i++) {
                permutation(q.substring(0, i) + q.substring(i + 1),
                        ans + q.charAt(i));
            }
        }
    }
}
