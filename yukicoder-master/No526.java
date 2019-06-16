import java.util.*;
import java.io.*;
import java.math.*;

public class No526 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt(), m = sc.nextInt();
    	
    	if(n <= m) {
    		System.out.println(1);
    	}else if(n % 2 == 0 && (n / 2) <= m) {
    		System.out.println(2);
    	}else {
    		System.out.println(-1);
    	}
    }
}
