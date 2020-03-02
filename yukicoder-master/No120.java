import java.util.*;
import java.io.*;
import java.math.*;

public class No120 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		for(int i = 0; i < t; i++) {
			int n = s.nextInt();

			HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
			for(int i = 0; i < n; i++) {
				int t = s.nextInt();
				if(m.containsKey(t)) {
					m.put(t, m.get(t)+1);
				}else {
					m.put(t, 1);
				}
			}
			int[] a = new int[m.size()];
			int i = 0;
			for(int c : m.keySet()) {
				a[i] = m.get(c);
				i++;
			}
			for(int j = 0; j < a.length; j++) {
				System.out.println("hairetu = " + a[j]);
			}

//				int[] a = new int[100];
//				
//				
//				Arrays.fill(a, 0);
//				for(int i = 0; i < n; i++) a[s.nextInt()-1]++;
//				long ss = 0;
//				for(int i = 0; i < a.length; i++) {
//					for(int j = i+1; j < a.length; j++) {
//						for(int k = j+1; k < a.length; k++) {
//							ss += (long)a[i] * a[j] * a[k] % mod;
//						}
//					}
//				}
//				System.out.println(ss % mod);
		}
 	}
}