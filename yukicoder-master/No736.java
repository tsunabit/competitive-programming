import java.util.*;
import java.io.*;
import java.math.*;

public class No736 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int a[] = new int[n];
    	
    	for(int i = 0; i < n; i++) {
    		a[i] = sc.nextInt();
    	}
    	
    	int max = 0;
    	for(int i = n-1; i > 0; i--) {
    		int syo = a[i] / a[i - 1];
    		int ama = a[i] % a[i - 1];
    		while(ama != 0) {
    			System.out.println("syo = " + syo);
    			System.out.println("ama = " + ama);
    			syo = syo / ama;
    			ama = syo % ama;
    		}
    		if(max < syo) max = syo;
    	}
    	System.out.println("max = " + max);
    	
    	System.out.print(a[0]);
    	for(int i = 1; i < n; i++) {
    		System.out.print(":" + a[i]);
    	}
    	
    	
    }
}
