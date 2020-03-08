import java.util.*;
import java.io.*;
import java.math.*;

public class No150 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String[] s = new String[t];
		for(int i = 0; i < t; i++) s[i] = sc.next();
		for(int i = 0; i < t; i++) {
			int tmpG = 0, tmpP = 0, ans = 100;
			String g = "good", p ="problem";
			for(int j = 0; j < s[i].length()-10; j++) {
				tmpG = 0;
				for(int k = 0; k < 4; k++) {
					if(s[i].charAt(j+k) != g.charAt(k)) tmpG++;
				}
				for(int l = j+4; l < s[i].length()-6; l++) {
					tmpP = 0;
					for(int k = 0; k < 7; k++) {
						if(s[i].charAt(l+k) != p.charAt(k)) tmpP++;
					}
					ans = Math.min(ans, tmpG+tmpP);
				}
			}
			System.out.println(ans);
		}
	}
}