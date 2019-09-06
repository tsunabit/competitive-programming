import java.util.*;
import java.io.*;
import java.math.*;

public class No40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = Integer.parseInt(sc.nextLine());
		String[] t = sc.nextLine().split(" ");
//		System.out.println("d = " + d);
		
		int[] a = new int[d+1];
		for(int i = 0; i < d+1; i++) {
			a[i] = Integer.parseInt(t[i]);
		}
//		System.out.println(Arrays.toString(a));
		int[] w = {0, -1, 0, 1};
		for(int i = a.length-1; i > 2; i--) {
			int te = a[i] / w[3];
//			for(int j = w.length-1; j >= 0; j--) {
			for(int c = 0; c < w.length; c++) {
				a[i-c] = a[i-c] - w[3-c]*te;
			}
//			System.out.println(Arrays.toString(a));
		}
//		System.out.println(Arrays.toString(a));
		int ji = 0;
		String str = "";
		int cc = a.length >= 3? 2 : a.length-1;
//		for(int i = 2; -1 < i; i--) {
		for(int i = cc; -1 < i; i--) {
			if(a[i] != 0 && ji < i) {
				ji = i;
			}
			if(a[i] == 0) {
				if(!"".equals(str)) {
					str = a[i] + " " + str;
				}
			}else {
				str = a[i] + " " + str;
			}
		}
		System.out.println(ji);
		if("".equals(str)) {
			System.out.println(0);
		}else {
			System.out.println(str.trim());
		}
		
	}
}
