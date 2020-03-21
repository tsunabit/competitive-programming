import java.util.*;
import java.io.*;
import java.math.*;

public class No240 {
	public static String ans = "NO";
	public static int X;
	public static int Y;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		X = sc.nextInt();
		Y = sc.nextInt();
		bfs(0, 0, 0);
		System.out.println(ans);
	}
	public static void bfs(int x, int y, int c) {
		if(c > 3) return;
		if(x == X && y == Y) {
			ans = "YES";
			return;
		}
		bfs(x-2, y-1 ,c+1);
		bfs(x-2, y+1 ,c+1);
		bfs(x-1, y-2 ,c+1);
		bfs(x-1, y+2 ,c+1);
		bfs(x+1, y-2 ,c+1);
		bfs(x+1, y+2 ,c+1);
		bfs(x+2, y-1 ,c+1);
		bfs(x+2, y+1 ,c+1);
	}
}