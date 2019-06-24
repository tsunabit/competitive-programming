import java.util.*;
import java.io.*;
import java.math.*;

public class No693 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] a = new int[n];
    	for(int i = 0; i < n; i++) {
    		a[i] = sc.nextInt();
    	}
    	Arrays.sort(a);
    	int c = 0;
    	for(int i = 0; i < n; i++) {
    		if(a[i] != i + 1) {
    			c += Math.abs(i + 1 - a[i]);
    		}
    	}
    	System.out.println(c);
    }
}
