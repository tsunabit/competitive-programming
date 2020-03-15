import java.util.*;
import java.io.*;
import java.math.*;

public class No208 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
		if(x==y && x2==y2 && x > x2) System.out.println(x+1);
		else System.out.println(Math.max(x, y));
	}
}