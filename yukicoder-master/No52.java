import java.util.*;
import java.io.*;
import java.math.*;

public class No52 {
	private static Set<String> set = new HashSet<String>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		dfs("", s);
		System.out.println(set.size());
	}
	
	public static void dfs(String kiridasi, String zan_str) {
		//end
		if(zan_str.length() == 0) {
			set.add(kiridasi);
			return;
		}
		//mae
		String mae = kiridasi + zan_str.charAt(0);
		StringBuilder sb_mae = new StringBuilder(zan_str);
		dfs(mae, sb_mae.deleteCharAt(0).toString());
		//ushiro
		String ushiro = kiridasi + zan_str.charAt(zan_str.length() - 1);
		StringBuilder sb_ushiro = new StringBuilder(zan_str);
		dfs(ushiro, sb_ushiro.deleteCharAt(zan_str.length() - 1).toString());
		
	}
}