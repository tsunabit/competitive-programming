import java.util.*;
import java.io.*;
import java.math.*;

public class No133 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String a = "";
		for(int i = 0; i < n; i++) a += sc.next();
		String b = "";
		for(int i = 0; i < n; i++) b += sc.next();
		
		ArrayList<String> al = new ArrayList<String>();
		permutation(a, "", al);
		ArrayList<String> bl = new ArrayList<String>();
		permutation(b, "", bl);
		
		int t = 0;
		int ans = 0;
		for(int i = 0; i < al.size(); i++) {
			for(int j = 0; j < al.size(); j++) {
				for(int k = 0; k < a.length(); k++) {
					if((int)al.get(i).charAt(k) > (int)bl.get(j).charAt(k)) {
						t++;
					}
				}
				if(t > n/2) ans++;
				t = 0;
			}
		}
		System.out.println((double)ans / (al.size() * bl.size()));
		
	}
	public static void permutation(String q, String ans, ArrayList<String> al){
        // Base Case
        if(q.length() <= 1) {
            al.add(ans+q);
        }
        // General Case
        else {
            for (int i = 0; i < q.length(); i++) {
                permutation(q.substring(0, i) + q.substring(i + 1), ans + q.charAt(i), al);
            }
        }
    }
}