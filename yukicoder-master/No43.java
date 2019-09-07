import java.util.*;
import java.io.*;
import java.math.*;

public class No43 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] s = new int[n];
		for(int i = 0; i < n; i++) {
			s[i] = sc.next().replace("x", "").length();
		}
//		System.out.println(Arrays.toString(s));
		int count = 1; 
		for(int i = 0; i < n; i++) {
			if(s[0] < s[i]) {
				count++;
			}
		}
		System.out.println(count);
	}
}
