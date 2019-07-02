import java.util.*;
import java.io.*;
import java.math.*;

public class No734 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong();
    	
    	if(a * 60 <= b) {
    		System.out.println(-1);
    	}else {
    		double t = (double) 3600 * c / (60 * a - b);
    		long ans = (long)Math.ceil(t);
    		System.out.println(ans);
    	}
    }
}
