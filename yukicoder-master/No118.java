import java.util.*;
import java.io.*;
import java.math.*;

public class No118 {
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int mod = 1000000007;
			int[] a = new int[100];
			Arrays.fill(a, 0);
			for(int i = 0; i < n; i++) a[s.nextInt()-1]++;
			long ss = 0;
			for(int i = 0; i < a.length; i++) {
				for(int j = i+1; j < a.length; j++) {
					for(int k = j+1; k < a.length; k++) {
						ss += (long)a[i] * a[j] * a[k] % mod;
					}
				}
			}
			System.out.println(ss % mod);
 	}
}