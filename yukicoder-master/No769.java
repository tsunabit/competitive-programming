import java.util.*;
import java.io.*;
import java.math.*;

public class No769 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	// "number", "drawtwo", "drawfour", "skip", "reverse"
    	int n = sc.nextInt(), m = sc.nextInt();
    	int[] h = new int[n];
    	String[] t = new String[m];
    	int c = 0;
    	int r = 1;
    	
    	for(int i = 0; i < m ; i++) {
    		t[i] = sc.next();
    	}
    	
    	for(int i = 0; i < m; i++) {
//    		if(c > n -1) c = c - n;
//			else if(c < 0) c = c + n;
//    		h[c] += 1;
    		
    		if(i == m - 1) {
    			System.out.println((c + 1) + " " + h[c]);
    			return;
    		}
    		
    		System.out.println("i = " + i + " c = " + (c + 1) + " maisu = " + h[c] + " fuda = " + t[i]);
    		
    		if("number".equals(t[i])) {
    			c = c + (r * 1);
    			c = count(c, n);
    		}else if("drawtwo".equals(t[i])) {
    			if(i < m - 2 && "drawtwo".equals(t[i + 1])) {
    				c = c + (r * 1);
    				c = count(c, n);
    			}else {
    				c = c + (r * 2);
    				c = count(c, n);
    			}
    		}else if("drawfour".equals(t[i])) {
    			if(i < m - 2 && "drawfour".equals(t[i + 1])) {
    				c = c + (r * 1);
    				c = count(c, n);
    			}else {
    				c = c + (r * 2);
    				c = count(c, n);
    			}
    		}else if("skip".equals(t[i])) {
    			c = c + (r * 2);
    			c = count(c, n);
    		}else if("reverse".equals(t[i])) {
    			r = r * -1;
    			c = c + (r * 1);
    			c = count(c, n);
    		}
    	}
    	
    	
    	
    }
    public static int count(int c, int n) {
    	if(c > n -1) c = c - n;
		else if(c < 0) c = c + n;
    	return c;
    }
    
//    public int count(int c, int n) {
//    	if(c > n -1) c = c - n;
//		else if(c < 0) c = c + n;
//    	return c;
//    }
    
//    public int maisu(String fuda) {
//		int t = 0;
//		if("drawtwo".equals(fuda)) t = -2; // h[c] -= 2;
//		else if("drawfour".equals(fuda)) t = -4; //h[c] -= 4;
//		else t = 1; //h[c] += 1;
//		return t;
//	}
}
