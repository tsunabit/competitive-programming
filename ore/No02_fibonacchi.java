import java.util.*;
import java.io.*;
import java.math.*;

public class No02_fibonacchi {
    public static void main(String[] args) {
    	// Scanner sc = new Scanner(System.in);
    	System.out.println("fibonacchi = " + fibonacchi(20));
    }
//     フィボナッチ数列
//    fibonacci( 6 ) : fibonacci( 4 ) + fibonacci( 5 )
//    fibonacci( 5 ) : fibonacci( 3 ) + fibonacci( 4 )
//    fibonacci( 4 ) : fibonacci( 2 ) + fibonacci( 3 )
//    fibonacci( 3 ) : fibonacci( 1 ) + fibonacci( 2 )
//    fibonacci( 2 ) : fibonacci( 0 ) + fibonacci( 1 )
//    fibonacci( 1 ) : 1
//    fibonacci( 0 ) : 0
//    それぞれ代入していくと
//    fibonacci( 6 ) : fibonacci( 4 ) + fibonacci( 5 ) // 8
//    fibonacci( 5 ) : fibonacci( 3 ) + fibonacci( 4 ) // 5
//    fibonacci( 4 ) : fibonacci( 2 ) + fibonacci( 3 ) // 3
//    fibonacci( 3 ) : fibonacci( 1 ) + fibonacci( 2 ) // 2
//    fibonacci( 2 ) : fibonacci( 0 ) + fibonacci( 1 ) // 1
    static int fibonacchi(int n) {
    	if (n == 0 || n == 1) {
            return n;
        }
        return fibonacchi(n - 1) + fibonacchi(n - 2);
    }
}
