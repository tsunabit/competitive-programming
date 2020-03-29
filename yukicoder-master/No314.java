import java.util.*;
import java.io.*;
import java.math.*;

public class No314 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a = {1, 0, 0}; // kp, pk, kk
		for(int i = 0; i < n; i++) {
			long t = {0, 0, 0};
			t[0] += a[1] + a[2];
			t[1] += a[0];
			t[2] += a[1];
			a = t;
		}
		System.out.println(a);
	}
}