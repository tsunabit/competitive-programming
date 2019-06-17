import java.util.*;
import java.io.*;
import java.math.*;

public class No537 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	long n = sc.nextLong(), c = 0;
    	HashSet<String> x = new HashSet<String>();
    	for(int i = 1; i <= Math.sqrt(n); i++) {
    		if(n % i == 0) {
    			long j = n / i;
    			x.add(i+""+j);
				x.add(j+""+i);
    		}
    	}
    	System.out.println(x.size());
    }
}
