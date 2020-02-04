import java.util.*;
import java.io.*;
import java.math.*;

public class No90 {
	public static String[] ary;
	public static int MAX = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int y = 3 * m;
		
		ary = new String[y];
		for(int i = 0; i < y; i++) {
			ary[i] = sc.next();
		}
		
		// 商品の文字列作成
		String str = "";
		for(int i = 0; i < n; i++) {
			str = str + i;
		}
		
		permutation(str, "");
		
		System.out.println(MAX);
	}
	public static void permutation(String q, String ans){
		// Base Case
		if(q.length() <= 1) {
			String str = ans + q;
			
			int total = 0;
			for(int i = 0; i < ary.length; i=i+3) {
				String it1 = ary[i];
				String it2 = ary[i+1];
				int sc = Integer.parseInt(ary[i+2]);
				if(str.indexOf(it1) < str.indexOf(it2)) {
					total += sc;
				}
			}
			MAX = MAX < total? total : MAX;
 		}
		// General Case
		else {
			for (int i = 0; i < q.length(); i++) {
				permutation(q.substring(0, i) + q.substring(i + 1), ans + q.charAt(i));
			}
		}
	}
}