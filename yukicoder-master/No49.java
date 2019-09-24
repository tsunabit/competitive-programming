import java.util.*;
import java.io.*;
import java.math.*;

public class No49 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		// indexはなかったら-1が帰る
		int index = s.indexOf("*") < s.indexOf("+") ? s.indexOf("*") : s.indexOf("+");
		
		
		System.out.println("index = " + index);
		String t = s.substring(0, index);
		int total = Integer.parseInt(t);
		char k = 'a';
		
		for(int i = index+1; i < s.length(); i++) {
			if(s.charAt(i) == '+' || s.charAt(i) == '*') {
				k = s.charAt(i);
			}else {
				if(k == '+') {
					total = total * Integer.parseInt(String.valueOf(s.charAt(i)));
				}else {
					total = total + Integer.parseInt(String.valueOf(s.charAt(i)));
				}
			}
		}
		System.out.println(total);
	}
}