import java.util.*;
import java.io.*;
import java.math.*;

public class No228 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[4][4];
		int[][] m = new int[4][4];
		boolean[][] c = new boolean[4][4];
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				a[i][j] = sc.nextInt();
				m[i][j] = (i*3)+(i+j+1);
				c[i][j] = false;
			}
		}
		m[3][3] = 0;
		
		boolean f = false;
		do {
			bi: for(int i = 0; i < 4; i++) {
				for(int j = 0; j < 4; j++) {
					if(a[i][j] != m[i][j]) {
						f = sei(a, m, c);
						break bi;
					}
				}
			}
		}while(f);
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(a[i][j] != m[i][j]) {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}
	public static boolean sei(int[][] a, int[][] m, boolean[][] c) {
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				int t = 0;
				if(a[i][j] == 0) {
					if(i != 0 && m[i][j] == a[i-1][j] && !c[i-1][j]) {
						t = a[i-1][j];
						a[i-1][j] = a[i][j];
						a[i][j] = t;
						c[i-1][j] = true;
					}else if(i != 3 && m[i][j] == a[i+1][j] && !c[i+1][j]) {
						t = a[i+1][j];
						a[i+1][j] = a[i][j];
						a[i][j] = t;
						c[i+1][j] = true;
					}else if(j != 0 && m[i][j] == a[i][j-1] && !c[i][j-1]) {
						t = a[i][j-1];
						a[i][j-1] = a[i][j];
						a[i][j] = t;
						c[i][j-1] = true;
					}else if(j != 3 && m[i][j] == a[i][j+1] && !c[i][j+1]) {
						t = a[i][j+1];
						a[i][j+1] = a[i][j];
						a[i][j] = t;
						c[i][j+1] = true;
					}else {
						return false;
					}
				}
			}
		}
		return true;
	}
}