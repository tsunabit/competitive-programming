import java.util.*;
import java.io.*;
import java.math.*;

public class No745 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
    	int o = 0 , k = 50;
    	if(d >= 10) {
    		System.out.println("Impossible");
    		return;
    	}
    	for(int i = 0; i < b; i++) {
    		for(int j = 0; j < (i / 100); j++) {
    			k *= 2;
    		}
    		o += k;
    	}
    	if(b < 100) k = 100;
    	for(int i = b; i < a + b; i++) {
    		for(int j = 0; j < (i / 100); j++) {
    			k *= 2;
    		}
    		o += k;
    	}
    	System.out.println("Possible");
    	System.out.println(o);
    	
    }
}
