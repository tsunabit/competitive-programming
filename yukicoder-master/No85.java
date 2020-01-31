import java.util.*;
import java.io.*;
import java.math.*;

public class No85 {
	static String ANS = "NO";
	static int N;
	static int M;
	static int C;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		N = n;
		M = m;
		C = c;
		
		// int[] ary = new int[n*m];
		// Integerにしないとaslist.containsが使えない
		Integer[] ary = new Integer[n*m];
		// 0 = 未達 1 = 到達済
		Arrays.fill(ary, 0);
		dfs(c, ary);
		System.out.println(ANS);
	}
	
	// p = 現在地
	public static void dfs(int p, Integer[] ary) {
		System.out.println("開始確認");
		// 終了条件 = 0を含まない 。つまり、全探索終了
		if(!(Arrays.asList(ary).contains(0))){
			if(p == C) {
				ANS = "YES";
				return;
			}
       }
		
		boolean ue = false, si = false, hi = false, mi = false;
		// 移動条件判定
		// 上
		if((p-3) > 0 && ary[p-3] == 0) {
			ary[p-3] = 1;
			ue = true;
		}
		// 下
		if((p+3) < N*M && ary[p+3] == 0) {
			ary[p+3] = 1;
			si = true;
		}
		// 左
		if(p%M != 1 && ary[p-1] == 0) {
			ary[p-1] = 1;
			hi = true;
		}
		// 右
		if(p%M != 0 && ary[p+1] == 0) {
			ary[p+1] = 1;
			mi = true;
		}
		
		if(ue) dfs(p-3, ary);
		if(si) dfs(p+3, ary);
		if(hi) dfs(p-1, ary);
		if(mi) dfs(p+1, ary);
	}
}