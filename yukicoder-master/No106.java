import java.util.*;
import java.io.*;
import java.math.*;

public class No106 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		// 素数を列挙
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 2; i <= n; i++) {
			if(isPrime(i)) {
				list.add(i);
			}
		}
		int[] a = new int[n+1];
		Arrays.fill(a, 0);
		for(int t : list) {
			int b = 1;
			int temp = t;
			while(temp <= n) {
				a[temp] += 1;
				b++;
				temp = t * b;
			}
		}
		int ans = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] >= k) ans++;
		}
		System.out.println(ans);
	}
	
	public static boolean isPrime(int num) {
        if (num < 2) return false;
        else if (num == 2) return true;
        else if (num % 2 == 0) return false;
        
        double sqrtNum = Math.sqrt(num);
        for (int i = 3; i <= sqrtNum; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}