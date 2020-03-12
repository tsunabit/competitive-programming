import java.util.*;
import java.io.*;
import java.math.*;

public class No193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = -1, ans = Integer.MIN_VALUE;
		
		for(int i = 0; i < s.length(); i++) {
			char t = 1, u = 1;
			if(i != 0) {
				t = s.charAt(i-1);
				u = s.charAt(i);
			}
			int tmp = 0;
			
			if(i == 0 || (t != '+' && t != '-' && u != '+' && u != '-')) {
				String v = s.substring(i) + s.substring(0, i);
				for(int j = 1; j < s.length(); j++) {
					if(v.charAt(j) == '+' || v.charAt(j) == '-' ) {
						if(k == -1 || v.charAt(k) == '+') {
							tmp += Integer.parseInt(v.substring(k+1, j));
						}else {
							tmp -= Integer.parseInt(v.substring(k+1, j));
						}
						k = j;
					}
				}
				if(v.charAt(k) == '+') {
					tmp += Integer.parseInt(v.substring(k+1));
				}else {
					tmp -= Integer.parseInt(v.substring(k+1));
				}
				k = -1;
				ans = Math.max(ans, tmp);
			}
		}
		System.out.println(ans);
	}
}