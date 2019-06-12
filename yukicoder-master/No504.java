import java.util.*;
import java.io.*;
import java.math.*;

public class No504 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] a = new int[n];
    	int s = sc.nextInt();
    	int[] r = new int[n];
    	r[0] = 1;
    	
    	for(int i = 1; i < n; i++) {
    		if(s < sc.nextInt()) {
    			r[i] = r[i - 1] + 1;
    		}else {
    			r[i] = r[i - 1];
    		}
    	}
    	for(int v : r) {
    		System.out.println(v);
    	}
    	
    	
    	
    }
}
