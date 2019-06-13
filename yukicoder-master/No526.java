import java.util.*;
import java.io.*;
import java.math.*;

public class No526 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	long n = sc.nextLong();
    	long m = sc.nextLong();
    	BigDecimal f1 = new BigDecimal("0");
    	BigDecimal f2 = new BigDecimal("1");
    	BigDecimal f  = new BigDecimal("0");
    	
    	for(int i = 3; i <= n; i++) {
//    		f = f1 + f2;
    		f.add(f1);
    		f.add(f2);
    		
//    		f = f1.add(f2);
//    		System.out.println("f1 = " + f1 + " f2 = " + f2 + " f(" + i + ") = " + f);
    		f1 = f2;
    		f2 = f;
    	}
    	System.out.println(f % m);
    }
}
