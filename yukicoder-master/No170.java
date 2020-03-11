import java.util.*;
import java.io.*;
import java.math.*;

public class No170 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(int i = 0; i < s.length(); i++) {
			if(hm.containsKey(s.charAt(i))) hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
			else hm.put(s.charAt(i), 1);
		}
		int w = 1;
		for(int v : hm.values()) w *= kai(v);
		System.out.println(kai(s.length()) / w - 1);
	}
	public static int kai(int n) {
		if(n == 1) return 1;
		else return n * kai(n-1);
	}
}