import java.util.*;
import java.io.*;
import java.math.*;

public class No647 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] a = new int[n], b = new int[n]; 
    	for(int i = 0; i < n; i++) {
    		a[i] = sc.nextInt();
    		b[i] = sc.nextInt();
    	}
    	
    	int m = sc.nextInt();
    	int[] x = new int[m], y = new int[m];
    	for(int i = 0; i < m; i++) {
    		x[i] = sc.nextInt();
    		y[i] = sc.nextInt();
    	}
    	
    	int[] o = new int[m];
    	
    	for(int i = 0; i < m; i++) {
    		for(int j = 0; j < n; j++) {
    			if(a[j] >= x[i] && b[j] <= y[i]) {
    				o[i] = o[i] + 1;
    			}
    		}
    	}
    	int max = 0;
    	for(int i = 0; i < m; i++) {
    		max = max < o[i]? o[i] : max;
    	}
    	if(max == 0) {
    		System.out.println(0);
    	}else {
    		for(int i = 0; i < m; i++) {
        		if(o[i] == max) {
        			System.out.println(i + 1);
        		}
        	}
    	}
    }
}
