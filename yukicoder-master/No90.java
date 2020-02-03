import java.util.*;
import java.io.*;
import java.math.*;

public class No90 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int y = 3 * m;
		int[] ary = new int[y];
		
		for(int i = 0; i < y; i++) {
			ary[i] = sc.nextInt();
		}
		for(int i = 0; i < y; i=i+3) {
			System.out.print(ary[i] + " " + ary[i+1] + " " + ary[i+2]);
			System.out.println("");
		}
	}
}