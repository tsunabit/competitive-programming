import java.util.*;
import java.io.*;
import java.math.*;

public class No280 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long si = 1;
		long bo = sc.nextInt();
		for(int i = 0; i < n-1; i++) {
			si = sc.nextLong();
		}
		System.out.println(si + "/" + bo);
	}
}