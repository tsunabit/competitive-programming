import java.util.*;
import java.io.*;
import java.math.*;

public class No49 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		// indexはなかったら-1が帰る
		int index = 99;
		if(s.indexOf("*") > -1) index = s.indexOf("*");
		if(s.indexOf("+") > -1 && s.indexOf("+") < index) index = s.indexOf("+");

		String t = s.substring(0, index);
		int total = Integer.parseInt(t);
		char k = s.charAt(index);
		
		String temp = "";
		for(int i = index+1; i < s.length(); i++) {
			if(s.charAt(i) == '+' || s.charAt(i) == '*') {
				// 計算する
				int nikou = Integer.parseInt(temp);
				if(k == '+') {
					total = total * nikou;
				}else {
					total = total + nikou;
				}
				temp = "";
				k = s.charAt(i);
			}else {
				temp = temp + s.charAt(i);
			}
		}
		// 最後を計算する
		int nikou = Integer.parseInt(temp);
		if(k == '+') total = total * nikou;
		else total = total + nikou;

		System.out.println(total);
	}
}