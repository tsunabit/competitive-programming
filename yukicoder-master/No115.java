import java.util.*;
import java.io.*;
import java.math.*;

public class No115 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), d = s.nextInt(), k = s.nextInt(), sum = 0;
		int[] a = new int[k];
		
		for(int i = 0; i < k; i++) {
			a[i] = i + 1;
			sum += i + 1;
		}
		if(sum > d) {
			System.out.println(-1);
			return;
		}
		for(int i = 0; i < k; i++) {
			sum -= a[a.length-1-i];
			a[a.length-1-i]=Math.min(d-sum, n-i); 
			sum += a[a.length-1-i];
		}
		if(sum == d) {
			for(int i = 0; i < k; i++) {
				System.out.print(a[i] + " ");
			}
		}else {
			System.out.print(-1);
		}
 	}
}