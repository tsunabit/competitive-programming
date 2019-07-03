import java.util.*;
import java.io.*;
import java.math.*;

public class No740 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt(), q = sc.nextInt(), mo = 1, c = 0;
    	while(n > 0) {
    		c++;
    		n = n - m;
    		if(p <= mo && mo <= p + q - 1) n = n - m;
    		mo = mo < 12? mo + 1 : 1;
    	}
    	System.out.println(c);
    }
}
