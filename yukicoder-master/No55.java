import java.util.*;
import java.io.*;
import java.math.*;

public class No55 {
//	private static Set<String> set = new HashSet<String>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x = new int[3];
		int[] y = new int[3];
		for(int i = 0; i < 3; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		for(int i = 0; i < 3; i++) {
			System.out.println("x y = " + x[i] + " , " + y[i]);
		}
		
		
//		
//		int x1 = sc.nextInt();
//		int y1 = sc.nextInt();
//		int x2 = sc.nextInt();
//		int y2 = sc.nextInt();
//		int x3 = sc.nextInt();
//		int y3 = sc.nextInt();
//		
//		double max = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));	//t12
//		double mid = Math.sqrt(Math.pow(x3-x1, 2) + Math.pow(y3-y1, 2));	//t13
//		double min = Math.sqrt(Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2));	//t23
//		
//		if(max < mid) {
//			double t = max;
//			max = mid;
//			mid = t;
//		}
//		if(mid < min) {
//			double t = mid;
//			mid = min;
//			min = t;
//		}
//		if(max < mid) {
//			double t = max;
//			max = mid;
//			mid = t;
//		}
//		
////		System.out.println(max);
////		System.out.println(mid);
////		System.out.println(min);
////		System.out.println(min * Math.sqrt(2));
//		
//		if(mid == min && max == (min * Math.sqrt(2))) {
//			
//		}
		
	}
}