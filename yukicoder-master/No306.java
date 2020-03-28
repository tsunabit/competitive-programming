import java.util.*;
import java.io.*;
import java.math.*;

public class No306 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int xa = sc.nextInt();
		int ya = sc.nextInt();
		int xb = sc.nextInt();
		int yb = sc.nextInt();
		System.out.println(1.0*yb-(1.0*yb-ya)/(1.0*xb+xa)*xb);
		
	}
}