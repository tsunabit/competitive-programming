import java.util.*;
import java.io.*;
import java.math.*;

public class No769 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt(), m = sc.nextInt();
    	int[] h = new int[n];
    	String[] t = new String[m];
    	int c = 0;
    	int r = 1;
    	int drow = 1;
    	
    	for(int i = 0; i < m ; i++) {
    		t[i] = sc.next();
    	}
    	for(int i = 0; i < m; i++) {
    		h[c] += 1;
    		if(i == m - 1) {
    			System.out.println((c + 1) + " " + h[c]);
    			return;
    		}
    		if("number".equals(t[i])) {
    			c = count(c + (r * 1), n);
    		}else if("drawtwo".equals(t[i])) {
    			if(i < m - 1 && "drawtwo".equals(t[i + 1])) {
    				c = count(c + (r * 1), n);
    				drow++;
    			}else {
    				h[count(c + (r * 1), n)] -= 2 * drow;
    				c = count(c + (r * 2), n);
    				drow = 1;
    			}
    		}else if("drawfour".equals(t[i])) {
    			if(i < m - 1 && "drawfour".equals(t[i + 1])) {
    				c = count(c + (r * 1), n);
    				drow++;
    			}else {
    				h[count(c + (r * 1), n)] -= 4 * drow;
    				c = count(c + (r * 2), n);
    				drow = 1;
    			}
    		}else if("skip".equals(t[i])) {
    			c = count(c + (r * 2), n);
    		}else if("reverse".equals(t[i])) {
    			r = r * -1;
    			c = count(c + (r * 1), n);
    		}
    	}
    }
    public static int count(int c, int n) {
    	if(c > n -1) c = c - n;
		else if(c < 0) c = c + n;
    	return c;
    }
}
