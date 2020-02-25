import java.util.*;
import java.io.*;
import java.math.*;

public class No115 {
	public static int max = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int k = sc.nextInt();
		
		int[] an = new int[n];
		int dt = d;
		int c = 0;
		int t = 0;
		while(c < n -1) {
			for(int i = 0; i < k; i++) {
				for(int j = c; j < n; j++) {
					if(i == k-1) {
						if((dt-j-1) == 0 && an[j] == 0) {
							an[j]++;
							dt -= j+1;
							t++;
							break;
						}
					}else {
						if((dt-j-1) > 0 && an[j] == 0) {
							an[j]++;
							dt -= j+1;
							t++;
							break;
						}
					}
				}
			}
			System.out.println(Arrays.toString(an));
			c++;
			if(t == k && dt == 0) {
				for(int i = 0; i < n; i++) {
					if(an[i] == 1) System.out.print((i+1) + " ");
				}
				System.out.println("");
//				break;
				return;
			}else {
				Arrays.fill(an, 0);
				t = 0;
				dt = d;
			}
		}
//		System.out.println(Arrays.toString(an));
		System.out.println(-1);
		
	}
}