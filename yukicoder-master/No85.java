import java.util.*;
import java.io.*;
import java.math.*;

public class No85 {
	String no = "NO";
	static int M = 0;
	static int N = 0;
	static int C = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		M = m;
		N = n;
		C = c;
//		int a[][] = new int[n][m];
		int a[] = new int[n * m];
		// 0 = 未到達、 1 = 済
		Arrays.fill(a, 0);
		int count = 0;
	}
	// x,y = 現在地
	public static void DFS(int[] a, int c, int count) {
		// 終了判定
		if(count == M * N) {
			if(a[C] == 0) {
				System.out.println("YES");
				return;
			}
		}
		// 現在のボタン = (x − 1) * M + y
		// int p = (x - 1) * M + y;
		// int pamari = p % M;
		int camari = c % M;
		boolean left = true, right = true, ue = true, sita = true;
		// 左右の判定
		// 左端
		if(pamari == 1) {
			left = false;
		// 右端
		}else if(pamari == 0) {
			right = false;
		}
		// 上下判定
		// 上
		if(p <= M) {
			ue = false;
		// 下
		}else if((N * M - M + 1) <= p) {
			sita = false;
		}
		
		// DFS call
		if(left && a[y][x-1] == 0) {
			a[y][x-1] = 1;
			DFS(a, x-1, y, count++);
		}
		if(right && a[y][x+1] == 0) {
			a[y][x+1] = 1;
			DFS(a, x+1, y, count++);
		}
		if(ue && a[y-M][x] == 0) {
			a[y-M][x] = 1;
			DFS(a, x, y-M, count++);
		}
		if(ue && a[y+M][x] == 0) {
			a[y+M][x] = 1;
			DFS(a, x, y+M, count++);
		}
	}
}