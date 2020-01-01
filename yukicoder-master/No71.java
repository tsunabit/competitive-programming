import java.util.*;
import java.io.*;
import java.math.*;

public class No71 {
//	private static Set<String> set = new HashSet<String>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long ans = 0;
		// 上の玉の数をiとする
		for(int i = 1; i < n; i++) {
			long tmp = (i + 1) * (n - i + 1) -1;
			ans = Math.max(ans, tmp);
		}
		System.out.println(ans);
	}
}