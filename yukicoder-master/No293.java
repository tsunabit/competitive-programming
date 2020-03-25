import java.util.*;
import java.io.*;
import java.math.*;

public class No293 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String ans = "";
		if(a.length() != b.length()) {
			ans = a.length() > b.length() ? a : b;
		}else {
			for(int i = 0; i < a.length(); i++) {
				int z = Integer.parseInt(a.substring(i,i+1));
				int k = Integer.parseInt(b.substring(i,i+1));
				if((z==4 || z==7) && (k==4 || k==7)) {
					if(z < k) {
						ans= a;
						break;
					}else if(z > k) {
						ans = b;
						break;
					}
				}else {
					if(z < k) {
						ans= b;
						break;
					}else if(z > k) {
						ans = a;
						break;
					}
				}
			}
		}
		System.out.println(ans);
	}
}