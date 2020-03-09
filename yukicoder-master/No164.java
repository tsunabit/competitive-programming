import java.util.*;
import java.io.*;
import java.math.*;

public class No164 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] s = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		long a = Long.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			String v = sc.next();
			int t = 0;
			for(int j = 0; j < v.length(); j++) {
				for(int k = 0; k < s.length; k++) {
					if(v.charAt(j) == s[k]) {
						t = Math.max(t, k);
						break;
					}
				}
			}
			a = Math.min(a, Long.parseLong(v, t+1));
		}
		System.out.println(a);
	}
}
