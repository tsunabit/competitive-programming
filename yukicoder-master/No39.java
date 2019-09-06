import java.util.*;
import java.io.*;
import java.math.*;

public class No39 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] n = sc.next().split("");
		int max = hoge(n);
		String[] temp = new String[n.length];
		for(int k = 0; k < n.length; k++) {
			temp[k] = n[k];
		}
		
		for(int i = 0; i < n.length; i++) {
			for(int j = i; j < n.length; j++) {
				String t = temp[i];
				temp[i] = temp[j];
				temp[j] = t;
				int v = hoge(temp);
//				System.out.println("[" + i + "]と[" + j + "] = " + v);
				if(max < v) max = v;
//				temp = n;
//				System.arraycopy(n, 0, temp, 0, n.length);
				for(int k = 0; k < n.length; k++) {
					temp[k] = n[k];
				}
//				System.out.println("temp初期化 = " + hoge(temp));
			}
		}
		System.out.println(max);
    }
	
	public static int hoge(String[] n) {
		String t = "";
		for(String v : n) {
			t += v;
		}
		int v = Integer.parseInt(t);
//		System.out.println(v);
		return v;
	}
}
