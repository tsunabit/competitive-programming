import java.util.*;
import java.io.*;
import java.math.*;

public class No80 {
//	private static Set<String> set = new HashSet<String>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int t = d / 4;
		int y = d % 4 / 2;
		System.out.println(t * (y + t));
	}
}