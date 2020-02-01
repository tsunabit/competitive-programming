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
		// 最初の確認
//		System.out.println("開始確認 = " + p);
//		for(int a : ary) System.out.print(a + " ");
//		System.out.println("");
		// 終了条件 = 0を含まない 。つまり、全探索終了
		if(!(Arrays.asList(ary).contains(0))){
			if(p == C) {
				ANS = "YES";
				// 最後の確認
//				System.out.println("終了確認 = " + p);
//				for(int a : ary) System.out.print(a + " ");
//				System.out.println("");
				return;
			}
       }
		
//		boolean ue = false, si = false, hi = false, mi = false;
		
		// 移動条件判定
		// 上
		if((p-M) > 0 && ary[p-M-1] == 0) {
			System.out.println("ue = " + p + " = " + (p-M));
			Integer[] ary2 = migula(ary);
			ary2[p-M-1] = 1;
//			ue = true;
			dfs(p-M, ary2);
		}
		// 下
		if((p+M) < N*M && ary[p+M-1] == 0) {
			System.out.println("si = " + p + " = " + (p+M));
			Integer[] ary2 = migula(ary);
			ary2[p+M-1] = 1;
//			si = true;
			dfs(p+M, ary2);
		}
		// 左
		if(p%M != 1 && ary[p-1-1] == 0) {
			System.out.println("hi = " + p + " = " + (p-1));
			Integer[] ary2 = migula(ary);
			ary2[p-1-1] = 1;
//			hi = true;
			dfs(p-1, ary2);
		}
		// 右
		if(p%M != 0 && ary[p+1-1] == 0) {
			System.out.println("mi = " + p + " = " + (p+1));
			Integer[] ary2 = migula(ary);
			ary2[p+1-1] = 1;
//			mi = true;
			dfs(p+1, ary2);
		}
		
//		if(ue) dfs(p-3, ary);
//		if(si) dfs(p+3, ary);
//		if(hi) dfs(p-1, ary);
//		if(mi) dfs(p+1, ary);
		
	}
	public static Integer[] migula(Integer[] in) {
		Integer[] out = new Integer[in.length];
		for(int i = 0; i < in.length; i++) {
			out[i] = in[i];
		}
		return out;
	}
}