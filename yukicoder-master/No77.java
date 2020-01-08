import java.util.*;
import java.io.*;
import java.math.*;

public class No77 {
//	private static Set<String> set = new HashSet<String>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[200];
		Arrays.fill(a, 0);
		int total_ini = 0;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			total_ini += a[i];
		}
		// ピラミッドの石の数から列数判定
		int c = (int)Math.sqrt(total_ini) * 2 - 1;
		// 配列にピラミッド生成
		int[] p = new int[200];
		Arrays.fill(p, 0);
		int ato = 0;
		for(int i = 0; i < c; i++) {
			if(i >= c/2+1) p[i] = p[i-1] - 1;
			else p[i] = i + 1;
			ato += p[i];
		}
		// 移動個数判定
		int ido = 0;
		// 移動した石をカウント
		for(int i = 0; i < p.length; i++) {
			if(a[i] == 0 && p[i] == 0) break;
			if(a[i] < p[i]) ido += p[i] - a[i];
		}
		// 捨てた石をカウント(初期値とピラミッドの石の差分をカウント)
		ido += total_ini - ato;	
		System.out.println(ido);
	}
}