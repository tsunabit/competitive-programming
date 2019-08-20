import java.util.*;
import java.io.*;
import java.math.*;

public class No16 {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int x = sc.nextInt(), n = sc.nextInt();
    	long w = 1000003;
    	long total = 0;
    	for(int i = 0; i < n; i++) {
    		double t = Math.pow(x, sc.nextInt());
    		System.out.println(t);
    		total += t;
    	}
    	System.out.println("total = " + (total % w));
	}
}
