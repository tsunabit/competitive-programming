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
    		double t = pow(x, sc.nextLong(), w);
    		total += t;
    	}
    	System.out.println((total % w));
	}
    static public long pow(long x, long n, long w) {
    	long ans = 1;
    	while(n > 0) {
    		if((n & 1) == 1) ans = ans * x % w;
    		x = x * x % w;
    		n >>= 1;
    	}
    	return ans;
    }
}
