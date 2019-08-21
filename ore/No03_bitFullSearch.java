import java.util.*;
import java.io.*;
import java.math.*;

public class No03_bitFullSearch {
    public static void main(String[] args) {
    	// Scanner sc = new Scanner(System.in);
    	// 集合
    	String[] ar = {"a","b","c"};
    	// 要素数
    	int n = 3;
    	bitFullSearch(ar, n);
    }
    // ビット全探索(abcの部分集合を列挙する)
    static void bitFullSearch(String[] ar, int n) {
    	for (int i = 0; i < (Math.pow(2,n)); i++) {
			String ans = "ans = ";
			// 整数iを2進数にして右にずらしながら1かどうか判定
			// 2進数iをjだけ右にビットシフトしたときの、iの1桁目と1とでビット論理積をとって、演算結果が1であるなら処理を実行する
			for (int j = 0; j < n; j++) {
				// &はビット論理積
				// ビット演算は各桁に対して行われる
				if ((1 & i>>j) == 1) ans += ar[j];
			}
			System.out.println(ans);
		}
    }
}
