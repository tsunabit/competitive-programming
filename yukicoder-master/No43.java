import java.util.*;
import java.io.*;
import java.math.*;

public class No43 {
	public static int ans = 99;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[][] s = new String[n][n];
		for(int i = 0; i < n; i++) {
			s[i] = sc.nextLine().split("");
		}
		dfs(s, n);
		System.out.println(ans); 
	}
	
	public static void dfs(String[][] s, int n) {
		String[][] map1 = copy(s);
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if("-".equals(map1[i][j])) {
					map1[i][j] = "o";
					map1[j][i] = "x";
					dfs(map1, n);
					map1[i][j] = "x";
					map1[j][i] = "o";
					dfs(map1, n);
					return;
				}
			}
		}
		
		int[] kati = new int[n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if("o".equals(map1[i][j])) kati[i]++;
			}
		}
		
		int temp = kati[0];
		int r = 1;
		int ima = 99;
		Arrays.sort(kati);
		for(int i = n-1; i >= 0; i--) {
			if(temp < kati[i] && ima > kati[i]) {
				r++;
				ima = kati[i];
			}
		}
		if(ans > r) {
			ans = r;
		}
	}
	
	static String[][] copy(String[][] from){
		int aa = from[0].length;
		String[][] to = new String[aa][aa];
		for(int i=0;i<aa;i++){
			for(int j=0;j<aa;j++){
				to[i][j]=from[i][j];
			}
		}
		return to;
	}
}
