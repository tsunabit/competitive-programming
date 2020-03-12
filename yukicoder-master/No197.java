import java.util.*;
import java.io.*;
import java.math.*;

public class No197 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] b = new String[3];
		b = sc.next().split("");
		int n = sc.nextInt();
		String[] a = new String[3];
		a = sc.next().split("");
		
		int ac = 0, bc = 0;
		for(int i = 0; i < 3; i++) {
			if(a[i].equals("o")) ac++;
			if(b[i].equals("o")) bc++;
		}
		if(ac != bc) {
			System.out.println("SUCCESS");
			return;
		}
		if(n == 0) {
			if(a[0].equals(b[0]) && a[1].equals(b[1]) && a[2].equals(b[2])) {
				System.out.println("FAILURE");
			}else {
				System.out.println("SUCCESS");
			}
		}else if(n == 1) {
			if((a[0].equals(b[1]) && a[1].equals(b[0]) && a[2].equals(b[2])) || 
				(a[0].equals(b[0]) && a[1].equals(b[2]) && a[2].equals(b[1]))) {
				System.out.println("FAILURE");
			}else {
				System.out.println("SUCCESS");
			}
		}else {
			System.out.println("FAILURE");
		}
	}
}