import java.util.*;
import java.io.*;
import java.math.*;

public class No43 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[][] s = new String[n][n];
		for(int i = 0; i < n; i++) {
			s[i] = sc.nextLine().split("");
		}
		dfs(s, n);
	}
	
	public static void dfs(String[][] s, int n) {
		String[][] map1 = copy(s);
		
		//
		System.out.println("きた");
		for(int k = 0; k < n; k++) {
			System.out.println(Arrays.toString(map1[k]));
		}
		//
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
//				if(map1[i][j] == "-") {
				if("-".equals(map1[i][j])) {
					map1[i][j] = "o";
					map1[j][i] = "x";
					//
//					for(int k = 0; k < n; k++) {
//						System.out.println(Arrays.toString(map1[k]));
//					}
					//
					dfs(map1, n);
					
					
					map1[i][j] = "x";
					map1[j][i] = "o";
					//
//					for(int k = 0; k < n; k++) {
//						System.out.println(Arrays.toString(map1[k]));
//					}
					//
					dfs(map1, n);
				}
			}
		}
		System.out.println("owata");
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
