import java.util.*;
import java.io.*;
import java.math.*;

public class No000 {
    public static void main(String[] args) {
    	// Scanner sc = new Scanner(System.in);
    	System.out.println("factorial = " + factorial(9));
    	System.out.println("fibonacchi = " + fibonacchi(20));
    	// 集合
    	String[] ar = {"a","b","c"};
    	// 要素数
    	int n = 3;
    	bitFullSearch(ar, n);
    }
    
    // 階乗
    static int factorial(int n) {
    	if(n == 0) {
    		return 1; // 0の階乗は1と定義されている
    	}else {
    		return n * factorial(n - 1);
    	}
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
    
    // ビット全探索(abcの部分集合を列挙する)
    static void bitFullSearch(String[] ar, int n) {
    	for (int i = 0; i < (Math.pow(2,n)); i++) {
			String ans = "ans = ";
			// 整数iを2進数にして右にずらしながら1かどうか判定
			// 2進数iをjだけ右にビットシフトしたときの、iの1桁目と1とでビット論理積をとって、演算結果が1であるなら処理を実行する
			for (int j = 0; j < n; j++) {
				if ((1 & i>>j) == 1) ans += ar[j];
			}
			System.out.println(ans);
		}
    }
    
}
