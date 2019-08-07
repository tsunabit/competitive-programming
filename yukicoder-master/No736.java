import java.util.*;
import java.io.*;
import java.math.*;

public class No736 {
    public static void main(String[] args) {
    	try {
    		// 入力元がファイルの場合
//    		 Scanner sc = new Scanner(new File("/Users/aa352872/Desktop/test"));
    		// 入力元が標準入力の場合
    		Scanner sc = new Scanner(System.in);
    		int n = sc.nextInt();
    		long a[] = new long[n];

    		for(int i = 0; i < n; i++) {
    			a[i] = sc.nextLong();
    		}
    		long gcd = a[0];
    		for (int i = 1; i < n; i++) {
    			gcd = gcd(gcd, a[i]);
    		}
    		for (int i = 0; i < n; i++) {
    			if (i > 0) {
    				System.out.print(':');
    			}
    			System.out.print(a[i] / gcd);
    		}
    		System.out.println();
    	}catch (Exception e) {
    		System.out.println("例外が発生しました。");
            System.out.println(e);
            return;
    	}
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
