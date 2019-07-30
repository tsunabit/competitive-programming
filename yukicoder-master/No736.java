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
    		int si = a[i];
    		int bo = a[i - 1];
    		int ama = -1;
    		while(ama != 0) {
    			ama = si % bo;
    			if(ama == 0) {
    				break;
    			}else {
    				bo = si;
        			bo = ama;
    			}
    		};
    		if(max == 0) {
    			max = bo;
    		}else if(max < bo) {
    			if(bo % max == 0) {
    				// nothing
    			}else {
    				max = 0;
    				break;
    			}
    		}else if(max > bo) {
    			if(max % bo == 0) {
    				max = bo;
    			}else {
    				max = 0;
    				break;
    			}
    		}
    		
    	}
    	System.out.println("max = " + max);
    	
    	System.out.print(a[0]);
    	for(int i = 1; i < n; i++) {
    		System.out.print(":" + a[i]);
    	}
    	
    	
    }
}
