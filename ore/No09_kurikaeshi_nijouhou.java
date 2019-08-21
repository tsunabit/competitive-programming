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
    	System.out.println(pow(2, 10));
    	
    }
    // 繰り返し2乗法
    static public long pow(long x, long n) {
    	long ans = 1;
    	while(n > 0) {
    		if((n & 1) == 1) {
    			ans = ans * x;
    		}
    		x = x * x;	// 2進数で考え、桁を上げるたびに底数をかけていく。一周する度にx, x^2, x^4, x^8となる
    		n >>= 1;	// 桁をずらす。「n = n >> 1」と同じ
    	}
    	return ans;
    }
}
