import java.util.*;
import java.io.*;
import java.math.*;

public class No810 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int l = sc.nextInt(), r = sc.nextInt(), m = sc.nextInt();
    	int o = m <= (r-l)? m : (r-l+1);
    	System.out.println(o);
    	
    }
}
