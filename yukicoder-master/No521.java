import java.util.*;
import java.io.*;
import java.math.*;

public class No521 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt(), k = sc.nextInt();
    	
    	if(k == 0 || k > n) {
    		System.out.println(0);
    		return;
    	}
    	if(n % 2 != 0 && (n / 2 + 1 == k)) {
    		System.out.println(n -1);
    	}else {
    		System.out.println(n -2);
    	}
    }
}
