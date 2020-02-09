import java.util.*;
import java.io.*;
import java.math.*;

public class No92 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		
		int[] a = new int[m * 3];
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		int[] d = new int[k];
		for(int i = 0; i < k; i++) {
			d[i] = sc.nextInt();
		}
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(d));
		
		// 配列作成
		for(int i = 2; i < a.length; i = i + 3) {
			if(a[i] == a[a.length-1]) {
//				System.out.println(a[i]);
				ArrayList<Integer> al = new ArrayList<Integer>;
				al.add(a[i-1]);
				al.add(a[i-2]);
			}
		}
		Set<Integer> set = new HashSet<Integer>();
		set.add(modoki(a, al, d, 1))
	}
	
	public static int modoki(int[] a, ArrayList al,int[] d, int c) {
		// terminate
		if(k < c) {
			return al.get(0);
		}
		
		for(int i = 2; i < a.length; i = i + 3) {
			if(a[i] == d[d.length-c]) {
				if(a[i-1] == al.get(al.lastIndexOf()-1)) {
					al.add(a[i-2]);
					modoki(a, al, d, c+1);
				}
			}
		}
	}
}