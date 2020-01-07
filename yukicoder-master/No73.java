import java.util.*;
import java.io.*;
import java.math.*;

public class No73 {
//	private static Set<String> set = new HashSet<String>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[26];
		long total = 0;
		for(int i = 0; i < 26; i++) {
			a[i] = sc.nextInt();
		}
		// この問題は部分文字列
		// lとo以外の文字
		total = (long)a[3]*a[4]*a[7]*a[17]*a[22];
		// lの最大
		long maxl = 0;
		for(int i = 2; i < a[11]; i++) {
			long tmp = i * (i - 1) / 2 * (a[11] - i);
			maxl = Math.max(maxl, tmp);
		}
		// oの最大
		long maxo = 0;
		for(int i = 1; i < a[14]; i++) {
			long tmp = i * (a[14] - i);
			maxo = Math.max(maxo, tmp);
		}
		total = total * maxl * maxo;
		System.out.println(total);
	}
}