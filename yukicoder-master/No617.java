import java.util.*;
import java.io.*;
import java.math.*;

public class No617 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt(), k = sc.nextInt();
    	int[] a = new int[n];
    	int max = 0;
    	for(int i = 0; i < n; i++) {
    		a[i] = sc.nextInt();
    	}
    	for(int i = 0; i < Math.pow(2, n); i++) {
    		int ans = 0;
    		for(int j = 0; j < n; j++) {
    			if((1 & i>>j) == 1) {
    				ans += a[j];
    			}
    		}
    		if(max < ans && ans <= k) {
    			max = ans;
    		}
    	}
    	System.out.println(max);
    }
}
