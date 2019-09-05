import java.util.*;
import java.io.*;
import java.math.*;

public class No10_prime_factor_bunkai {
    public static void main(String[] args) {
    	// 素因数分解 試し割り
    	int n = 100;
    	int x = n;
    	System.out.print("n = " + n + " = ");
    	for (int i = 2;i <= n;) {
            if (x % i == 0) { // 最小の因数を求める 
                System.out.print(i);
                if (x != i)
                    System.out.print(" * "); // xと因数が同値になったら＊の挿入をやめる
                x /= i; // 最小の因数で割った数を代入する
            } else
                i++;
        }
    	System.out.println();
    }
    
}
