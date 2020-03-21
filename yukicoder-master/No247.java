import java.util.*;
import java.io.*;
import java.math.*;

public class No247 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] d = new char[14];
		char[] c = new char[14];
		char[] h = new char[14];
		char[] s = new char[14];
		
		for(int i = 0; i < n; i++) {
			String t = sc.next();
			int y;
			if(t.charAt(1) == 'A') y=1;
			else if(t.charAt(1) == 'T') y=10;
			else if(t.charAt(1) == 'J') y=11;
			else if(t.charAt(1) == 'Q') y=12;
			else if(t.charAt(1) == 'K') y=13;
			else y=Integer.parseInt(t.substring(1));
			
			if(t.charAt(0) == 'D') d[y] = 't';
			else if(t.charAt(0) == 'C') c[y] = 't';
			else if(t.charAt(0) == 'H') h[y] = 't';
			else if(t.charAt(0) == 'S') s[y] = 't';
		}
		re("D", d);
		re("C", c);
		re("H", h);
		re("S", s);
		System.out.println("");
	}
	public static void re(String k, char[] a) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == 't') {
				if(i == 1) System.out.print(k + "A" + " ");
				else if(i == 10) System.out.print(k + "T" + " ");
				else if(i == 11) System.out.print(k + "J" + " ");
				else if(i == 12) System.out.print(k + "Q" + " ");
				else if(i == 13) System.out.print(k + "K" + " ");
				else System.out.print(k + i + " ");
				
			}
		}
	}
}