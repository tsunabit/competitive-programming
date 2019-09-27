import java.util.*;
import java.io.*;
import java.math.*;

public class No52 {
//	public static int total = 0;
	public static HashMap<String, String> hm = new HashMap<String, String>(); 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int len = s.length();
		String str = "";
		dfs(s, 0, str);
		System.out.println("total = " + hm.size());
	}
	public static void dfs(String s, int count, String str) {
		if (count == s.length()-1) {
//            total++;
			hm.put(str, str);
            return;
        }
		// 前
//		str += s.charAt(count+1);
		dfs(s, count+1, str+s.charAt(count+1));
        // 後
//		str += s.charAt(s.length()-(s.length()-count));
		dfs(s, count+1, str+s.charAt(s.length()-(s.length()-count)));
	}
}