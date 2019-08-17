import java.util.*;
import java.io.*;
import java.math.*;

public class No08_p_adic_number {
    public static void main(String[] args) {
    	// 10進数から2進数
    	final int dec = 254;
    	final String bin = Integer.toBinaryString(dec);
    	System.out.println(bin);
    	
    	// 2進数から10進数
    	final String bin2 = "11111110";
    	final int dec2 = Integer.parseInt(bin2, 2);
    	System.out.println(dec2);
    	
    	// 10進数からn進数
    	final int dec3 = 254;
    	final int n = 36;
    	final String base36 = Integer.toString(dec3, n);
    	System.out.println(base36);
    }
}
