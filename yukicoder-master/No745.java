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
    		if(i < 100) {
    			o += 50;
    		}else if (i < 200) {
    			o += 100;
    			k = 100;
    		}else if (i < 300) {
    			o += 200;
    			k = 200;
    		}else {
    			o += 400;
    			k = 400;
    		}
    	}
    	if(k == 0) {
    		for(int i = b; i < a + b; i++) {
        		if(i < 100) o += 100;
        		else if (i < 200) o += 200;
        		else if (i < 300) o += 400;
        		else o += 800;
        	}
    	}else {
    		for(int i = b; i < a + b; i++) {
    			if(i / 100 == b /100) {
    				o += k;
    			}else if(i / 100 == b /100 + 1) {
    				o += k * 2;
    			}else if(i / 100 == b /100 + 2) {
    				o += k * 4;
    			}else if(i / 100 == b /100 + 3) {
    				o += k * 8;
    			}
//        		if(i < 100) o += 100;
//        		else if (i < 200) o += 200;
//        		else if (i < 300) o += 400;
//        		else o += 800;
        	}
    	}
    	
    	System.out.println("Possible");
    	System.out.println(o);
    	
    }
}
