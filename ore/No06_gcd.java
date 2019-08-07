import java.util.*;
import java.io.*;
import java.math.*;

public class No06_gcd {
    public static void main(String[] args) {
    	// Scanner sc = new Scanner(System.in);
    	// 集合
    	int[] a = {24 , 30 , 36};
    	// 要素数
    	int n = 3;
    	
    	long gcd = a[0];
		for (int i = 1; i < n; i++) {
			gcd = gcd(gcd, a[i]);
		}
		System.out.println("gcd = " + gcd);
    }
    
    // ユークリッド互除法で最大公約数を求める
    static long gcd(long n, long m) {
		if (m == 0) {
			return n;
		} else {
			return gcd(m, n % m);
		}
	}
}
