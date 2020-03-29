import java.util.*;
import java.io.*;
import java.math.*;

public class No312 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		for(long i = 3; i*i <= n; i++) {
			if(n%i == 0) {
				System.out.println(i);
				return;
			}
		}
		if(n%2 == 0 && n>4) {
			System.out.println(n/2);
			return;
		}
		System.out.println(n);
	}
}