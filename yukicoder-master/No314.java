import java.util.*;
import java.io.*;
import java.math.*;

public class No314 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long m = 1000000007;
		long a[] = {1, 0, 0}; // kp, pk, kk
		for(int i = 0; i < n; i++) {
			long t[] = {0, 0, 0};
			t[0] += (a[1] + a[2]) % m;
			t[1] += a[0] % m;
			t[2] += a[1] % m;
			a = t;
		}
		long ans = 0;
		for(int i = 0; i < 3; i++) ans += a[i];
		System.out.println(ans%m);
		
		// 模範解答
//		long dp[] = new long[n];
//		dp[0] = 1;
//		dp[1] = 2;
//		dp[2] = 2;
//		for(int i = 3; i < n; i++) {
//			dp[i] = (dp[i-3]+dp[i-2])%m;
//			System.out.println("dp[" + i + "] = " + dp[i]);
//		}
//		System.out.println(dp[n-1]);
	}
}