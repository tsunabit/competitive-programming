import java.util.*;
import java.io.*;
import java.math.*;

public class No92 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			
			int[] a = new int[m];
			int[] b = new int[m];
			int[] c = new int[m];
			for(int i = 0; i < m; i++) {
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
				c[i] = sc.nextInt();
			}
			
			int[] d = new int[k];
			for(int i = 0; i < k; i++) {
				d[i] = sc.nextInt();
			}
			
			int[][] dp = new int[k][n];
			for(int[] x: dp){
			    java.util.Arrays.fill(x, 0);
			}
			
			// d[0]処理
			for(int i = 0; i < m; i++) {
				if(d[0] == c[i]) {
					dp[0][a[i]-1] = 1;
					dp[0][b[i]-1] = 1;
				}
			}
			
			for(int i = 1; i < k; i++) {
				for(int j = 0; j < m; j++) {
					if(d[i] == c[j]) {
						if(dp[i-1][a[j]-1] == 1) dp[i][b[j]-1] = 1;
						if(dp[i-1][b[j]-1] == 1) dp[i][a[j]-1] = 1;
					}
				}
			}
			
			int ans = 0;
			for(int i = 0; i < n; i++) ans += dp[k-1][i];
			System.out.println(ans);
			
			for(int i = 0; i < n; i++) {
				if(dp[k-1][i] == 1) System.out.print(i+1 + " ");
			}
			System.out.println("");
		} catch(Exception e) {
			System.out.println(e);
            return;
		}
	}
}