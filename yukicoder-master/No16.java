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
    		//double t = Math.pow(x, sc.nextInt());
    		double t = pow(x, sc.nextLong());
//    		System.out.println(t);
    		total += t;
    		
    	}
    	System.out.println("total = " + (total % w));
	}
	// 繰り返し2乗法
    static public long pow(long x, long n) {
    	long ans = 1;
    	while(n > 0) {
    		if((n & 1) == 1) {
    			ans = ans * x;
    		}
    		x = x * x;	// 2進数で考え、桁を上げるたびに底数をかけていく。一周する度にx, x^2, x^4, x^8となる
    		System.out.println(x);
    		n >>= 1;	// 桁をずらす。「n = n >> 1」と同じ
    	}
    	return ans;
    }
}
