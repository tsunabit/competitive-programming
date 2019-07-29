import java.util.*;
import java.io.*;
import java.math.*;

public class No825 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
    	long k = a + (b * 10);
    	long count = 100;
    	long o = 0;
    	for(long i = 1; i <= Math.pow(10, 100); i++) {
    		if(i <= k) {
    			long t = k - i;
    			long tt = (t /10) + (t % 10);
    			if(count > tt) {
    				count = tt;
    				o = i;
    			}
    		}else {
    			break;
    		}
    	}
    	System.out.println(0);
    }
}
