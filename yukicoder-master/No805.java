import java.util.*;
import java.io.*;
import java.math.*;

public class No805 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	String s = sc.next();
    	char[] as = new char[n];
    	
    	for(int i = 0; i < n; i++) {
    		as[i] = s.charAt(i);
    	}
    	int c = 0;
    	for(int i = 0; i < n; i++) {
    		for(int k = n-1; k > i; k--) {
    			double j = ((i+k)/2.0);
    			if((i+k)%2 == 0 && (j-i) == (k-j) && as[i] == 'U' && as[(int)j] == 'M' && as[k] == 'G') {
    				c++;
    			}
    		}
    	}
    	System.out.println(c);
    }
}
