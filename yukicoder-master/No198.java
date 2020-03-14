import java.util.*;
import java.io.*;
import java.math.*;

public class No198 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt(), n = sc.nextInt();
		int[] c = new int[n];
		
		if(n == 1) {
			System.out.println(0);
			return;
		}
		
		long sum = b;
		for(int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
			sum += c[i];
		}
		
		long l = 0;
		long r = sum / n;
		while(r - l > 2) {
			long p0 = (l * 2 + r) / 3;
			long p1 = (l + r * 2) / 3;
			
			if(cnt(c, p0) > cnt(c, p1)) {
				l = p0;
			}else {
				r = p1;
			}
		}
		long ans = Long.MAX_VALUE;
		for(long i = l; i <= r; i++) {
			ans = Math.min(ans, cnt(c, i));
		}
		System.out.println(ans);
	}
	public static long cnt(int[] c, long p) {
		long t = 0;
		for(int i = 0; i < c.length; i++) {
			t += Math.abs(p-c[i]);
		}
		return t;
	}
}