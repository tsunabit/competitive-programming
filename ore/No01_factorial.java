import java.util.*;
import java.io.*;
import java.math.*;

public class No01_factorial {
	static String str = "";
    public static void main(String[] args) {
    	System.out.println("factorial = " + factorial(9));
    }
    // 階乗
    static int factorial(int n) {
    	if(n == 0) {
    		return 1; // 0の階乗は1と定義されている
    	}else {
    		str += n + " * " + "factorial(" + (n - 1) + ")";
    		System.out.println("factorial = " + str);
    		return n * factorial(n - 1);
    	}
    }
}
