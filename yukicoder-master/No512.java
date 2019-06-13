import java.util.*;
import java.io.*;
import java.math.*;

public class No512 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	double x = sc.nextDouble() * 1000 / 3600, y = sc.nextDouble() * 1000 / 3600;
    	int n = sc.nextInt();
    	int[] a = new int[n];
    	
    	for(int i = 0; i < n; i++) {
    		a[i] = sc.nextInt();
    	}
    	for(int i = 0; i < n - 1; i++) {
    		double j = a[i] / x;
//    		System.out.println("i = " + (i + 1) + " a[i + 1] = " + a[i + 1] + ": j * y = " + (int)(j * y));
    		// y * a[i] * x > a[i + 1] → y * a[i] > a[i + 1] * x
    		if((int)(y * a[i]) > a[i + 1] * x) {
    			System.out.println("NO");
    			return;
    		}
    	}
    	System.out.println("YES");
    }
}
