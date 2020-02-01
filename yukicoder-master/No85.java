import java.util.*;
import java.io.*;
import java.math.*;

public class No85 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		String ans = "NO";
		
		if(n == 1 && m == 2) ans = "YES";
		if(n == 2 && m == 1) ans = "YES";
		if(n * m % 2 == 0 && n != 1 && m != 1) ans = "YES";
		
		System.out.println(ans);
	}
}