import java.util.*;
import java.io.*;
import java.math.*;

public class No846 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	long p = sc.nextLong(), q = sc.nextLong(), r = sc.nextLong();
    	long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong();
    	
    	long max = p * a;
    	long min = p * (a - 1);

    	if(max > q * (a + b)) {
    		max = q * (a + b);
    	}
    	if(min < q * (a + b - 1)) {
    		min = q * (a + b - 1);
    	}
    	
    	if(max > r * (a + b + c)) {
    		max = r * (a + b + c);
    	}
    	if(min < r * (a + b + c - 1)) {
    		min = r * (a + b + c - 1);
    	}
    	
    	if(min + 1 <= max) {
    		System.out.println((min + 1) + " " + max);
    	}else {
    		System.out.println(-1);
    	}
    }
}
