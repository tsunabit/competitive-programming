import java.util.*;
import java.io.*;
import java.math.*;

public class No118 {
	public static void main(String[] args) {
		try {
//			Scanner s = new Scanner(System.in);
			Scanner s = new Scanner(new File("/Users/aa352872/Desktop/test"));
			int n = s.nextInt();
			int mod = 1000000007;
			//		int[] a = new int[a];
//			System.out.println("n = " + n);
			
			Map<Integer, Integer> m = new HashMap<Integer, Integer>();

			for(int i = 0; i < n; i++) {
				int temp = s.nextInt();
//				System.out.println("gnu = " + i);
//				System.out.println("temp = " + temp);
				
				if(m.containsKey(temp)) {
//					System.out.println("gnu");
					m.put(temp, m.get(temp)+1);
				}else {
					m.put(temp, 1);
				}
			}
			
//			System.out.println("m = " + m.size());
			
			for(int t : m.keySet()) {
				System.out.println(t + " : " + m.get(t) + ", ");
			}

			long c = (m.size() * (m.size()-1) % mod * (m.size()-2) % mod) / 6;
			System.out.println("c = " + c);

			long k = 1;
			for(int v : m.values()) {
//				k *= v;
//				System.out.println("v = " + v);
				k = k * v % mod;
				System.out.println("k = " + k);
			}

			

			//		for(Map.entry<Integer, Integer> en : m.entrySet()) {
			//			System.out.println(en.get);
			//		}

			System.out.println(c * k % mod );
		} catch(Exception e) {
    		System.out.println("例外が発生しました。");
            System.out.println(e);
            return;
    	}
 	}
}