import java.util.*;
import java.io.*;
import java.math.*;

public class No131 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt(), d = sc.nextInt();
		int a = 0;
		if(d == 0) {
			System.out.println(1);
			return;
		}
		for(int i = 0; i <= x; i++) {
			if(y >= d-i && (d-i) >= 0) a++;
		}
		System.out.println(a);
	}
}