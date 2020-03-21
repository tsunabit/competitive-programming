import java.util.*;
import java.io.*;
import java.math.*;

public class No237 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long[] f = {3, 5, 17, 257, 65537};
		int c = 0;
		for(int i = 0; i < 30; i++) {
			for (int j = 0; j < (1 << 5); j++) {
				long ans = (long)Math.pow(2, i);
				for (int k = 0; k < 5; k++) if ((1 & j>>k) == 1) ans *= f[k];
				if(2 < ans && ans <= a) c++;
			}
		}
		System.out.println(c);
	}
}