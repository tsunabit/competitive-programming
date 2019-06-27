import java.util.*;
import java.io.*;
import java.math.*;

public class No722 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	BigDecimal a = new BigDecimal(sc.nextInt()), b = new BigDecimal(sc.nextInt());
    	BigDecimal j = new BigDecimal(10), z = new BigDecimal(0);
    	
    	if(a.remainder(j).equals(z) && b.remainder(j).equals(z)) {
    		System.out.println(a.multiply(b).divide(j));
    	}else {
    		BigDecimal min = new BigDecimal(-99999999), max = new BigDecimal(99999999);
    		if(a.multiply(b).compareTo(min) > 0 && a.multiply(b).compareTo(max) < 0) {
    			System.out.println(a.multiply(b));
    		}else {
    			System.out.println("E");
    		}
    	}
    }
}
