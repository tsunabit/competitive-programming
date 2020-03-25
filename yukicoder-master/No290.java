import java.util.*;
import java.io.*;
import java.math.*;

public class No290 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		if(s.length() < 2) {
			System.out.println("NO");
			return;
		}
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				if(j+(j+1-i) < n) {
//					System.out.println("i, j = " + i + ", " + j);
					String m = s.substring(i, j+1);
					String a = s.substring(j+1, j+(j+1-i)+1);
//					System.out.println("m = " + m);
//					System.out.println("a = " + a);
					if(m.equals(a)) {
						System.out.println("YES");
						return;
					}
				}
			}
		}
		System.out.println("NO");
	}
}