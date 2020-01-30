import java.util.*;
import java.io.*;
import java.math.*;

public class No85 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		int[n*m] ary = new int[n*m]; 
		// 0 = 未達 1 = 到達済
		Arrays.fill(ary, 0);
	}
	
	// p = 現在地
	public static void dfs(int p, String[] ary) {
		// 終了条件
		
		boolean ue = false, si = false, hi = false, mi = false;
		// 移動条件判定
		// 上
		if((p-3) > 0 && ary[p-3] == 0) {
			ary[p-3] = 1;
			ue = true;
		}
		// 下
		if((p+3) < n*m && ary[p+3] == 0) {
			ary[p+3] = 1;
			si = true;
		}
		// 左
		if(p%m != 1 && ary[p-1] == 0) {
			ary[p-1] = 1;
			hi = true;
		}
		// 右
		if(p%m != 0 && ary[p+1] == 0) {
			ary[p+1] = 1;
			mi = true;
		}
		
		if(ue) dfs(p-3, ary);
		if(si) dfs(p+3, ary);
		if(hi) dfs(p-1, ary);
		if(mi) dfs(p+1, ary);
	}
}