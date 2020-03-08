import java.util.*;
import java.io.*;
import java.math.*;

public class No157 {
	public static int W;
	public static int H;
	public static int ans = 999;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		W = sc.nextInt();
		H = sc.nextInt();
		char[][] c = new char[H][W];
		
		String t = "";
		for(int i = 0; i < H; i++) {
			t += sc.next();
		}
		
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				c[i][j] = t.charAt(W*i+j);
			}
		}
		
		loop: for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(c[i][j] == '.') {
					dfs1(c, i, j);
					break loop;
				}
			}
		}
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(c[i][j] == '1') {
					for(int k = 0; k < H; k++) {
						for(int l = 0; l < W; l++) {
							if(c[k][l] == '.') {
								ans = Math.min(ans, Math.abs(i-k)+Math.abs(j-l)-1);
							}
						}
					}
				}
			}
		}
		System.out.println(ans);
	}
	
	public static void dfs1(char[][] c, int h, int w) {
		if(c[h][w] == '.') {
			c[h][w] = '1';
		}
		if(h > 0 && c[h-1][w] == '.') dfs1(c, h-1, w);
		if(h < H-1 && c[h+1][w] == '.') dfs1(c, h+1, w);
		if(w < W-1 && c[h][w+1] == '.') dfs1(c, h, w+1);
		if(w > 0 && c[h][w-1] == '.') dfs1(c, h, w-1);
	}
}