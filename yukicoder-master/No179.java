import java.util.*;
import java.io.*;
import java.math.*;

public class No179 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int W = scan.nextInt();
		char c[][] = new char[H][W];
		for(int i = 0; i < H; i++) {
			String s = scan.next();
			for(int j = 0; j < W; j++) {
				c[i][j] = s.charAt(j);
			}
		}
		scan.close();
		boolean [][]s = new boolean[H][W];
		boolean flag = false;
		for(int dy = -H; dy <= H; dy++) {
			for(int dx = -W; dx <= W; dx++) {
				if(dy == 0 && dx == 0) {
					continue;
				}
				for(int i = 0; i < H; i++) {
					for(int j = 0; j < W; j++) {
						s[i][j] =false;
					}
				}

				for(int k = 0; k < (H - 1) * W + W; k++) {
					int y = k / W;
					int x = k % W;
						if(c[y][x] == '#' && s[y][x] == false) {
							s[y][x] = true;
							if(y + dy < 0 || y + dy >= H || x + dx < 0 || x + dx >= W) {
								flag = false;
								break;
							}

							if(c[y + dy][x + dx] == '#' && s[y + dy][x + dx] == false) {
								s[y + dy][x + dx] = true;
								flag = true;
							}else {
								flag = false;
								break;
							}
						}
					}
					if(flag) {
						System.out.println("YES");
						System.exit(0);
					}
				}

			}
		System.out.println("NO");
	}
}