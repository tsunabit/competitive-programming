import java.util.*;
import java.io.*;
import java.math.*;

public class No36 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int c = 0;
		for(long i = 2; i < Math.sqrt(n); i++) {
			while(n % i == 0) {
				n /= i;
				c++;
			}
		}
		if(n != 1) c++;
		if(c > 2) System.out.println("YES");
		else System.out.println("NO");
		
    }
}
