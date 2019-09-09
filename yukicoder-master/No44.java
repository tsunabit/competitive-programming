import java.util.*;
import java.io.*;
import java.math.*;

public class No44 {
	public static long ans = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		// フィボナッチ的なものをボトムアップで
		for(int i = 0; i < 2; i++) a[i] = i+1;
		for(int i = 2; i < n; i++) {
			a[i] = a[i-1] + a[i-2];
		}
		System.out.println(a[n-1]);
	}
}