import java.util.*;
import java.io.*;
import java.math.*;

public class No204 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		String c = "xxxxxxxxxxxxxx" + sc.next() + sc.next() + "xxxxxxxxxxxxxx";
		int ans = 0;
		int t = 0;
		for(int i = 0; i < c.length(); i++) {
			String cc = c.substring(0, i);
			int h = 0, j = i;
			while(h < d && j < c.length()) {
				if(c.charAt(j) == 'x') {
					cc += "o";
					h++;
					j++;
				}else {
					break;
				}
			}
			cc += c.substring(j, c.length());
			int tmp = 0;
			for(int k = 0; k < c.length(); k++) {
				if(cc.charAt(k) == 'o') {
					tmp++;
				}else {
					ans = Math.max(ans, tmp);
					tmp = 0;
				}
			}
			ans = Math.max(ans, tmp);
		}
		System.out.println(ans);
	}
}