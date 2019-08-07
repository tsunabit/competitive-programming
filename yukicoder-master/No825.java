import java.util.*;
import java.io.*;
import java.math.*;

public class No825 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
    	int kin = 999;
    	int max = a + (10 * b);
    	
    	for(int k = 1; k <= max; k++) {
    		for(int i = 0; i <= a; i++) {
        		for(int j = 0; j <= b; j++) {
        			int temp = i + (10 * j);
        			if(k > temp || temp == 0) {
        				continue;
        			}else {
        				int zan = temp - k;
        				int mai;
        				if(zan >= 10) mai = (zan / 10) + (zan % 10);
        				else mai = zan;
        				
        				if(c == (a + b - i - j + mai) && kin > k) {
        					kin = k;
        				}
        			}
        		}
        	}
    	}
    	
    	if(kin == 999) {
    		System.out.println("Impossible");
    	}else {
    		System.out.println(kin);
    	}
    }
}
