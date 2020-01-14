import java.util.*;
import java.io.*;
import java.math.*;

public class No85 {
	String no = "NO";
	int M = 0;
	int N = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		M = m;
		N = n;
		int c = sc.nextInt();
		int a[][] = new int[n][m];
		// 0 = 未到達、 1 = 済
		Arrays.fill(a, 0);
	}
	// x,y = 現在地
	public static void DFS(int[][] a, int x, int y) {
		// 周りのボタンを判定
		// ((X−1)×M+Y)
		int p = (x − 1) * M + y;
			
		}
		
		if(x == 0) {
			
		}else if(x == M - 1) {
			
		}else if(y == 0) {
			
		}else if(y == N - 1) {
			
		}else {
			
		}
	}
}