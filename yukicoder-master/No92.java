import java.util.*;
import java.io.*;
import java.math.*;

public class No92 {
	static int K;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		K = k;
		
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
		Set<Integer> set = new HashSet<Integer>();
//		System.out.println("d.length = " + d.length);
		
		// 配列作成
		for(int i = 2; i < a.length; i = i + 3) {
			if(a[i] == d[d.length-1]) {
				ArrayList<Integer> al = new ArrayList<Integer>();
				al.add(a[i-1]);
				al.add(a[i-2]);
//				System.out.println(Arrays.toString(al.toArray()));
				mo(a, al, d, 2, set);
				
				ArrayList<Integer> al2 = new ArrayList<Integer>();
				al2.add(a[i-2]);
				al2.add(a[i-1]);
//				System.out.println(Arrays.toString(al2.toArray()));
				mo(a, al2, d, 2, set);
			}
		}
//		for(int ans : set) {
//			System.out.print("ans = " + ans + " ");
//		}
//		System.out.print("");
//		int[] an = set.toArray(new int[set.size()]);
		Integer[] an = set.toArray(new Integer[set.size()]);
//		list.toArray(new String[list.size()]);
		Arrays.sort(an);
		System.out.println(an.length);
		for(int i = 0; i < an.length; i++) {
			System.out.print(an[i] + " ");
		}
		System.out.println("");
		
	}
	public static void mo(int[] a, ArrayList<Integer> al,int[] d, int c, Set<Integer> set) {
//		System.out.println("d.length - c = " + d.length + " - " + c);
//		System.out.println("K = " + K);
		// terminate
		if(K < c) {
			set.add(al.get(0));
			return;
		}
		// 再起
		for(int i = 2; i < a.length; i = i + 3) {
			if(a[i] == d[d.length-c]) {
				if(a[i-1] == (int)al.get(al.size()-1)) {
					ArrayList<Integer> alt = new ArrayList<Integer>(al);
					alt.add(a[i-1]);
					alt.add(a[i-2]);
//					System.out.println(Arrays.toString(alt.toArray()));
					mo(a, alt, d, c+1, set);
				}
				if(a[i-2] == (int)al.get(al.size()-1)) {
					ArrayList<Integer> alt = new ArrayList<Integer>(al);
					alt.add(a[i-2]);
					alt.add(a[i-1]);
					mo(a, alt, d, c+1, set);
				}
			}
		}
	}
}