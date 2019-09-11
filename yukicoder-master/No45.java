import java.util.*;
import java.io.*;
import java.math.*;

public class No45 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] v = new int[n];
		for(int i = 0; i < n; i++) v[i] = sc.nextInt();
		
		int[] r = new int[n];
		r[0] = v[0];
		if(n > 1) r[1] = Math.max(r[0], v[1]);
		for(int i = 2; i < n; i++) r[i] = Math.max(r[i-1], r[i-2] + v[i]);
		System.out.println(r[n-1]);
	}
}