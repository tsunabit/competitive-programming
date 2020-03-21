import java.util.*;
import java.io.*;
import java.math.*;

public class No273 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int ans = 1; 
		if(s.length() == 2 && s.charAt(0) == s.charAt(1)) {
			System.out.println(1);
			return;
		}
		
		for(int i = 0; i < s.length(); i++) {
			for(int j = i+1; j <= s.length(); j++) {
				if(!(s.substring(i, j).equals(s))) {
					ans = Math.max(ans, kai(s.substring(i, j)));
				}
			}
		}
		System.out.println(ans);
	}
	public static int kai(String s) {
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		if(sb.toString().equals(s)) {
			return s.length();
		}
		else {
			return 0;
		}
	}
}