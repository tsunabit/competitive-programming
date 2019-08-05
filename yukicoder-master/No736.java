import java.util.*;
import java.io.*;
import java.math.*;

public class No736 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	long a[] = new long[n];
    	
    	for(int i = 0; i < n; i++) {
    		a[i] = sc.nextLong();
    	}
    	
    	long max = 1;
    	for(int i = n-1; i > 0; i--) {
    		long si = a[i];
    		long bo = a[i - 1];
    		long ama = -1;
    		while(ama != 0) {
    			ama = si % bo;
    			if(ama == 0) {
    				break;
    			}else {
    				si = bo;
        			bo = ama;
    			}
    		};
    		if(max == 1) {
//    			System.out.println("max = " + max);
    			max = bo;
    		}else if(max < bo) {
//    			System.out.println("max = " + max);
    			if(bo % max == 0) {
    				// nothing
    			}else {
    				max = 1;
    				break;
    			}
    		}else if(max > bo) {
    			if(max % bo == 0) {
    				max = bo;
    			}else {
    				max = 1;
    				break;
    			}
    		}
    		
    	}
//    	System.out.println("max = " + max);
    	
    	for(int i = 1; i < n; i++) {
    		if(a[i]%max != 0) {
    			max = 1;
    		}
    	}
    	System.out.println("max = " + max);
    	System.out.print(a[0]/max);
    	for(int i = 1; i < n; i++) {
    		System.out.print(":" + a[i]/max);
    	}
    	System.out.println("");
    	
    }
}
