import java.util.*;
import java.io.*;
import java.math.*;

public class No745 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
    	int o = 0 , k = 0;
    	if(d >= 10) {
    		System.out.println("Impossible");
    		return;
    	}
    	
    	for(int i = 0; i < b; i++) {
    		o += (int)Math.pow(2, i / 100) * 50;
    	}
    	for(int i = b; i < a + b; i++) {
    		o += (int)Math.pow(2, i / 100) * 100;
    	}
    	
    	System.out.println("Possible");
    	System.out.println(o);
    	
    }
}
