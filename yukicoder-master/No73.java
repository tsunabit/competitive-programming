import java.util.*;
import java.io.*;
import java.math.*;

public class No73 {
//	private static Set<String> set = new HashSet<String>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[26];
		int total = 1;
		for(int i = 0; i < 26; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("hoge");
		if(a[3]<1 || a[4]<1 || a[7]<1 || a[11]<3 || a[14]<2 || a[17]<1 || a[22]<1) {
			System.out.println(0);
			return;
		}
		System.out.println("hogehoge");
		if(a[3] > 1) total += a[3]-1;
		if(a[4] > 1) total += a[4]-1;
		if(a[7] > 1) total += a[7]-1;
		if(a[11] > 3) total += (a[11]-1)*(a[11]-2)/2;
		if(a[14] > 2) total += a[14] - 2;
		if(a[17] > 1) total += a[17]-1;
		if(a[22] > 1) total += a[22]-1;
		System.out.println(total);
	}
}