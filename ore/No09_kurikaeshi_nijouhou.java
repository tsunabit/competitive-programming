import java.util.*;
import java.io.*;
import java.math.*;

public class No09_kurikaeshi_nijouhou {
    public static void main(String[] args) {
    	// 繰り返し２乗法とは、べき乗計算する際に通常なら計算量O(N)かかる計算をビット操作を用いてO(logN)にする手法
    	
    	// 普通のやり方で2の10乗を求める
//    	int n = 2;
//    	int ans = 1;
//    	for(int i = 0; i < 10; i++) {
//    		ans *= 2;
//    	}
//    	System.out.println(ans);
    	
    	// 繰り返し2乗法
    	System.out.println("答え = " + pow(2, 9));
    }
    // 繰り返し2乗法
    // 2^9、つまりx = 2, n = 9の場合
    // 9 = 1001となり、2^9 = 2^1 * 2^8ということがわかる
    // 繰り返し2乗法では、2^1 と 2^8を計算して2^9を算出する
    static public long pow(long x, long n) {
    	long ans = 1;
    	while(n > 0) {
    		// n乗の数字を2進数に変換することがポイント
    		if((n & 1) == 1) {
    			ans = ans * x;
    		}
    		// 2進数で考え、桁を上げるたびに底数をかけていく。一周する度にx, x^2, x^4, x^8となる
    		x = x * x;
    		// bit全体を右に1つシフトして一番右を捨てる。つまり、割る2してるのと同じ
    		// ビットで1桁をずらす。「n = n >> 1」と同じ
    		n >>= 1;
    	}
    	return ans;
    }
}
