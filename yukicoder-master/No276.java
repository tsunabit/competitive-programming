import java.util.*;
import java.io.*;
import java.math.*;

public class No276 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n % 2 == 0) System.out.println(n/2);
		else System.out.println(n);
	}
}