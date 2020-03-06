import java.util.*;
import java.io.*;
import java.math.*;

public class No141 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(), n = sc.nextInt();
		int c = 0;
		while(m != n) {
			if(m > n) {
				int t = 0;
				if(m%n == 0) t = (m / n)-1;
				else t = m / n;
				m = m - (t*n);
				c += t;
			}else {
				int t = m;
				m = n;
				n = t;
				c++;
			}
		}
		System.out.println(c);
    }
}