import java.util.*;
import java.io.*;
import java.math.*;

public class No222 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = 0;
		for(int i = 1; i < s.length(); i++) {
			if(s.charAt(i) == '+' || s.charAt(i) == '-') {
				if(s.charAt(i-1) != '+' && s.charAt(i-1) != '-') {
					k = i;
				}
			}
		}
		int sa = 0;
		if(s.charAt(0) == '-') {
			sa = -1 * Integer.parseInt(s.substring(1, k));
		}else if(s.charAt(0) == '+') {
			sa = Integer.parseInt(s.substring(1, k));
		}else {
			sa = Integer.parseInt(s.substring(0, k));
		}
		
		int u = 0;
		if(s.charAt(k+1) == '-') {
			u = -1 * Integer.parseInt(s.substring(k+2));
		}else if(s.charAt(k+1) == '+') {
			u = Integer.parseInt(s.substring(k+2));
		}else {
			u = Integer.parseInt(s.substring(k+1));
		}
		
		if(s.charAt(k) == '+') {
			if(u < 0) {
				u = -1 * u;
				System.out.println(sa + u);
			}else {
				System.out.println(sa - u);
			}
		}
		else System.out.println(sa + u);
	}
}