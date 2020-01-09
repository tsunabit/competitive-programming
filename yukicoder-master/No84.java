import java.util.*;
import java.io.*;
import java.math.*;

public class No84 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long r = sc.nextLong();
		long c = sc.nextLong();
		long a = 0;
		
		if(r == c) {
			if(r % 2 == 0) {
				a = (long)(r * c / 4 - 1);
			}else {
				a = (long)(r * c / 4);
			}
		}
		else if(r * c % 2 == 0) a = (long)(r * c / 2 - 1);
		else a = (long)(r * c / 2);		
		
		if(a < 0) a = 0;
		System.out.println(a);
	}
}