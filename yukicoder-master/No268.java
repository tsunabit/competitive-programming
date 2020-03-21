import java.util.*;
import java.io.*;
import java.math.*;

public class No268 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l1 = sc.nextInt(), l2 = sc.nextInt(), l3 = sc.nextInt();
		int[] l = {(l1+l3)*2, (l2+l3)*2, (l2+l1)*2};
		Arrays.sort(l);
		int[] c = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		Arrays.sort(c);
		System.out.println(l[0]*c[2] + l[1]*c[1] + l[2]*c[0]);
	}
}