import java.util.*;
import java.io.*;
import java.math.*;

public class No110 {
	public static int max = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nw = sc.nextInt();
		Integer[] w = new Integer[nw];
		for(int i = 0; i < nw; i++) {
			w[i] = sc.nextInt();
		}
		Arrays.sort(w, Collections.reverseOrder());
		
		int nb = sc.nextInt();
		Integer[] b = new Integer[nb];
		for(int i = 0; i < nb; i++) {
			b[i] = sc.nextInt();
		}
		Arrays.sort(b, Collections.reverseOrder());
		
		// w起点
		for(int i = 0; i < nw; i++) {
			wb(w, b, "b", w[i], 1);
		}
		// b起点
		for(int i = 0; i < nb; i++) {
			wb(w, b, "w", b[i], 1);
		}
		System.out.println(max);
    }
	
	public static void wb(Integer[] w, Integer[] b, String wbe, int c, int total) {
		boolean f = false;
		// 終了条件
		if(wbe.equals("e")) {
			if(max < total) max = total;
		}
		
		// w
		if(wbe.equals("w")) {
			for(int i = 0; i < w.length; i++) {
				if(w[i] < c) {
					total++;
					c = w[i];
					f = true;
					break;
				}
			}
			if(f) {
				wb(w, b, "b", c, total);
			}else {
				wb(w, b, "e", c, total);
			}
		}
		// b
		if(wbe.equals("b")) {
			for(int i = 0; i < b.length; i++) {
				if(b[i] < c) {
					total++;
					c = b[i];
					f = true;
					break;
				}
			}
			if(f) {
				wb(w, b, "w", c, total);
			}else {
				wb(w, b, "e", c, total);
			}
		}
	}
}