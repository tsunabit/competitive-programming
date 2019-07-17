import java.util.*;
import java.io.*;
import java.math.*;

public class No000 {
    public static void main(String[] args) {
    	// Scanner sc = new Scanner(System.in);
    	System.out.println("factorial = " + factorial(9));
    	System.out.println("fibonacchi = " + fibonacchi(20));
    }
    
    // 階乗
    static int factorial(int n) {
    	if(n == 0) {
    		return 1; // 0の階乗は1と定義されている
    	}else {
    		return n * factorial(n - 1);
    	}
    }
    // フィボナッチ数列
    static int fibonacchi(int n) {
//    	System.out.println("call = " + n);
    	if (n == 0 || n == 1) {
            return n;
        }
        return fibonacchi(n - 1) + fibonacchi(n - 2);
    }
}
