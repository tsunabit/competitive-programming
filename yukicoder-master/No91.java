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
		while(true){
			Arrays.sort(rgb);
			if(rgb[2]-rgb[0] <= 2){
				break;
			}else{
				rgb[0] += 1;
				rgb[2] -= 2;
			}
		}
		System.out.println(rgb[0]);
	}
}