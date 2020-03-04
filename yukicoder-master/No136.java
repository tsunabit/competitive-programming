import java.util.*;
import java.io.*;
import java.math.*;

public class No136 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		
		for(int i = 2; i <= k+1; i++) {
			if(n % i == 0) {
				System.out.println(n/i);
				return;
			}
		}
		System.out.println(1);
    }
}