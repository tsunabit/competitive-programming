import java.util.*;
import java.io.*;
import java.math.*;

public class No91 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] rgb = new int[3];
		for(int i = 0; i < rgb.length; i++) {
			rgb[i] = sc.nextInt();
		}
		int total = 0;
		
		int min = 99;
		min = min(rgb);
		if(min > 0) {
			total += min;
			for(int i = 0; i < rgb.length; i++) {
				rgb[i] = rgb[i] - min;
			}
		}
		int max = 0;
		
		min = min(rgb);
		max = max(rgb);
		
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		
		while(max > min && max >= 3) {
			for(int i = 0; i < rgb.length; i++) {
				if(rgb[i] == max) {
					rgb[i] = rgb[i] - 2;
					break;
				}
			}
			for(int i = 0; i < rgb.length; i++) {
				if(rgb[i] == min) {
					rgb[i] = rgb[i] + 1;
					break;
				}
			}
			min = min(rgb);
			max = max(rgb);
			System.out.println("max = " + max);
			System.out.println("min = " + min);
		}
		// 同じ処理を2解している
		min = min(rgb);
		if(min > 0) {
			total += min;
			for(int i = 0; i < rgb.length; i++) {
				rgb[i] = rgb[i] - min;
			}
		}
		
		for(int a : rgb) System.out.print(a + " ");
		System.out.println("");
		
		System.out.println(total);
		
	}
	public static int min(int[] ary) {
		int min = 99;
		for(int i = 0; i < ary.length; i++) {
			if(min > ary[i]) min = ary[i];
		}
		return min;
	}
	public static int max(int[] ary) {
		int max = 0;
		for(int i = 0; i < ary.length; i++) {
			if(max < ary[i]) max = ary[i];
		}
		return max;
	}
}