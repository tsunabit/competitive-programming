import java.util.*;
import java.io.*;
import java.math.*;

public class No07_prime_number {
    public static void main(String[] args) {
    	boolean result = isPrime(101);
    	if(result) System.out.println("素数である");
    	else System.out.println("素数でない");
    }
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        else if (num == 2) return true;
        else if (num % 2 == 0) return false; // 偶数はあらかじめ除く
        
        // エラトステネスの篩
        // 素数判定は対象の数の平方根までで約数を持つかどうかを判定すればOK
        double sqrtNum = Math.sqrt(num);
        for (int i = 3; i <= sqrtNum; i += 2) {
            if (num % i == 0) {
                return false;	// 素数ではない
            }
        }
        return true;			// 素数である
    }
}
