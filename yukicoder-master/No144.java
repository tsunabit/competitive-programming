import java.util.*;
import java.io.*;
import java.math.*;

public class No144 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double p = sc.nextDouble();
		int[] a = new int[n+1];
		
		for (int i = 2; i <= n; i++) {
			for (int j = i * 2; j <= n; j += i) {
				a[j]++;
			}
		}
		double t = 0;
		for(int i = 2; i <= n; i++) {
			t += Math.pow(1-p, a[i]);
		}
		System.out.println(t);
    }
}