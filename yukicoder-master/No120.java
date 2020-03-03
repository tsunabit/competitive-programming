import java.util.*;
import java.io.*;
import java.math.*;

public class No120 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();

			for(int i = 0; i < t; i++) {
				int n = sc.nextInt();
				HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
				
				for(int j = 0; j < n; j++) {
					int tmp = sc.nextInt();
					if(m.containsKey(tmp)) {
						m.put(tmp, m.get(tmp)+1);
					}else {
						m.put(tmp, 1);
					}
				}
				
				for(int c : m.keySet()) {
//					System.out.println("k : v = " + c + " : " + m.get(c));
				}
				
				int[] a = new int[m.size()];
				int z = 0;
				for(int c : m.keySet()) {
					a[z] = m.get(c);
					z++;
				}
				Arrays.sort(a);
//				System.out.println(Arrays.toString(a));

				long ss = 0;
				while(a.length-3 >= 0 && a[a.length-3] > 0) {
					ss++;
					a[a.length-1]--;
					a[a.length-2]--;
					a[a.length-3]--;
					Arrays.sort(a);
				}
				System.out.println(ss);
			}
		} catch(Exception e) {
    		System.out.println("例外が発生しました。");
            System.out.println(e);
            return;
    	}
 	}
}