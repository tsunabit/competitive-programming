import java.util.*;
import java.io.*;
import java.math.*;

public class No73 {
//	private static Set<String> set = new HashSet<String>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long ans = 0;
		long t = 1000007;
		// a個の時、a+1までの数を表現出来て、これが2箇所に分かれるとして、
		// 均等に割った方が良いので、((N+1)/2+1)*(N/2+1)-1ですかね？
		// modを取るのだけ気を付けないとですね
		ans = (((n / 2 + 1) % t) * ((n - (n / 2) + 1) % t) - 1) % t;
		if(ans < 0) {
			ans += t;
		}
		System.out.println(ans);
	}
}