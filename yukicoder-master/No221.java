import java.util.*;
import java.io.*;
import java.math.*;

public class No221 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double k = n*0.99;
		double p = (10000-n)*0.01;
		System.out.println((p/(k+p))*100);
	}
}