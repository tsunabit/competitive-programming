import java.util.*;
import java.io.*;
import java.math.*;

public class No682 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = 0;
    	
    	for(int i = a; i <= b; i++) {
    		if((a + b + i) %3 == 0) {
    			c++;
    		}
    	}
    	System.out.println(c);
    	
    }
}
