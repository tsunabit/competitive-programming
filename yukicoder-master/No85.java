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
		Arrays.fill(ary, 0);
	}
	
	public static void dfs(int p, String[] ary) {
		// 終了条件
		
		// 移動条件判定
		// 上
		if((p-3) > 0 && ary[p-3] == 0) {
			
		}
		// 下
		if((p+3) < n*m && ary[p+3] == 0) {
			
		}
		// 左
		if(p%m != 1 && ary[p-1] == 0) {
			
		}
		// 右
		if(p%m != 0 && ary[p+1] == 0) {
			
		}
	}
}