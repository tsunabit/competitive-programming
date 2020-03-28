import java.util.*;
import java.io.*;
import java.math.*;

public class No300 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long i = 2;
		while(x >= (i*i)) {
			if(x%(i*i) == 0) {
				x /= i*i; 
			}else {
				i += 1;
			}
		}
		System.out.println(x);
	}
}