import java.util.*;
import java.io.*;
import java.math.*;

public class No677 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	long[] a2 = new long[n+1];
    	long[] a5 = new long[n+1];
    	for(int i = 0; i <= n; i++) {
    		a2[i] = (long)Math.pow(2, i);
    		a5[i] = (long)Math.pow(5, i);
    	}
    	Map<Long, Integer> map = new TreeMap<Long, Integer>();
    	for(int i = 0; i <= n; i++) {
    		for(int j = 0; j <= n; j++) {
    			map.put(a2[i] * a5[j], 1);
    		}
    	}
    	for(long k : map.keySet()) {
    		System.out.println(k);
    	}
    }
}
