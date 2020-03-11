import java.util.*;
import java.io.*;
import java.math.*;

public class No183 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = (int)Math.pow(2, 15);
		boolean[] b = new boolean[m];
		b[0] = true;
		for(int i = 0; i < n; i++) {
			int t = sc.nextInt();
			for(int j = 0; j < m; j++) {
				if(b[j]) b[j^t] = true;
			}
		}
		int c = 0;
		for(int i = 0; i < m; i++) if(b[i]) c++;
		System.out.println(c);
	}
}