import java.util.*;
import java.io.*;
import java.math.*;

public class No161 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] gcp = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		String[] s = sc.next().split("");
		int ans = 0;
		
		ans += jan(gcp, 0, "C", s, 3);
		ans += jan(gcp, 1, "P", s, 3);
		ans += jan(gcp, 2, "G", s, 3);
		ans += jan(gcp, 0, "G", s, 1);
		ans += jan(gcp, 1, "C", s, 1);
		ans += jan(gcp, 2, "P", s, 1);
		System.out.println(ans);
		
	}
	public static int jan(int[] gcp, int y, String c, String[] s, int p) {
		int a = 0;
		int t = kaz(c, s);
		if(gcp[y] >= t) {
			gcp[y] -= t;
			a += t * p;
			del(c, s, t);
		}else {
			del(c, s, gcp[y]);
			a += gcp[y] * p;
			gcp[y] = 0;
		}
		return a;
	}
	
	public static int kaz(String c, String[] s) {
		int t = 0;
		for(int i = 0; i < s.length; i++) {
			if(c.equals(s[i])) t++;
		}
		return t;
	}
	public static void del(String c, String[] s, int k) {
		for(int i = 0; i < s.length; i++) {
			if(k == 0) return;
			if(c.equals(s[i])) {
				k--;
				s[i] = "Z";
			}
		}
	}
}