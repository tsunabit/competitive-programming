import java.util.*;
import java.io.*;
import java.math.*;

public class No11 {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int w = sc.nextInt(), h = sc.nextInt(), n = sc.nextInt();
//    	boolean[][] c = new boolean[w][h];
//    	for(boolean[] t : c) {
//    		Arrays.fill(t, false);
//    	}
    	String[][] c = new String[w][h];
    	for(String[] t : c) {
    		Arrays.fill(t, "");
    	}
//    	for(int i = 0; i < w; i++) {
//    		for(int j = 0; j < h; j++) {
//    			System.out.println("c[" + i + "][" + j + "] = " + c[i][j]);
//    		}
//    	}
    	for(int i = 0; i < n; i++) {
    		int s = sc.nextInt(), k = sc.nextInt();
    		c[s-1][k-1] = "NG";
    		//同じマークで数字loop
    		for(int su = 0; su < h; su++) {
//    			if(su == k-1) continue;
//    			else c[s-1][su] = "match";
    			if(c[s-1][su] != "NG") c[s-1][su] = "match";
    		}
    		//同じ数字でマークloop
    		for(int m = 0; m < w; m++) {
//    			if(m == s-1) continue;
//    			else c[m][k-1] = "match";
    			if(c[m][k-1] != "NG") c[m][k-1] = "match";
    		}
    	}
//    	for(int i = 0; i < w; i++) {
//    		for(int j = 0; j < h; j++) {
//    			System.out.println("c[" + i + "][" + j + "] = " + c[i][j]);
//    		}
//    	}
    	long count = 0;
    	for(int i = 0; i < w; i++) {
    		for(int j = 0; j < h; j++) {
    			if(c[i][j] == "match") count++;
    		}
    	}
    	System.out.println(count);
	}
}
