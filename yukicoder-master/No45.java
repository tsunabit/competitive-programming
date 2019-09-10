import java.util.*;
import java.io.*;
import java.math.*;

public class No45 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] vt = sc.nextLine().split(" ");
		int[] v = new int[n];
		for(int i = 0; i < n; i++) v[i] = Integer.parseInt(vt[i]);
		
//		for(int i = 0; i < n; i++) System.out.println(v[i]);

		int max = 0, temp = 0;
		for(int i = 1; i < Math.pow(2, n); i++) {
			temp = 0;
			for (int j = 0; j < n; j++) {
				if ((1 & i>>j) == 1) {
					temp += v[j];
				}
			}
			if(max < temp) max = temp;
		}
		System.out.println(max);
	}
}