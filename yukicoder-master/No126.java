import java.util.*;
import java.io.*;
import java.math.*;

public class No126 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), s = sc.nextInt();
		if(Math.abs(a-s) <= Math.abs(b-s) || s == 1) {
			System.out.println(Math.abs(a-s) + s);
		}else {
			System.out.println(Math.min(Math.abs(b-s) + (s-1) + Math.abs(a-1) + 1, Math.abs(b-s) + Math.abs(a-s) + Math.abs(a-1) + 1));
		}
	}
}
//
//public class No126 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt(), b = sc.nextInt(), s = sc.nextInt();
//		int t = 0;
//		if(Math.abs(a-s) <= Math.abs(b-s) || s == 1) {
//			t = Math.abs(a-s) + s;
//		}else {
//			// 1階へ
//			t = Math.abs(b-s) + (s-1) + Math.abs(a-1) + 1;
//			// Aへ
//			int u = Math.abs(b-s) + Math.abs(a-s) + Math.abs(a-1) + 1;
//			t = Math.min(t, u);
//		}
//		System.out.println(t);
//	}
//}