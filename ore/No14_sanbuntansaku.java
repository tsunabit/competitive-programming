import java.util.*;
import java.io.*;
import java.math.*;

// 三分探索
public class No14_sanbuntansaku {
    public static void main(String[] args) {
    	// y = x*x + x + 9 の二次関数を考える
    	// 上記の二次関数は極値が9であることは明白だが
    	// 内容を簡単にするため上記お題で三分探索する
    	int x;
    	
    	int l = 0;
    	int r = 100;
    	while(r -l > 2) {
    		int p0 = (l * 2 + r) / 3;
			int p1 = (l + r * 2) / 3;
			// お題の関数が下に凸であるため小さい値を探す
			// 上に凸である場合は分岐が異なる
			if(search(p0) > search(p1)) {
				l = p0;
			}else {
				r = p1;
			}
    	}
    	int ans = Integer.MAX_VALUE;
    	for(int i = l; i <= r; i++) {
    		ans = Math.min(ans, search(i));
    	}
    	System.out.println(ans);
    }
    public static int search(int p) {
		return p*p + p + 9;
	}
}
//    	
//    	int[] ary = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//    	Arrays.sort(ary);
//    	int ans = 0;
//    	ans = binary_search_nibuntansaku(ary, 5);
//    	System.out.println("ans = " + ans);
//    }
//    
//    public static int binary_search_nibuntansaku(int[] ary, int target){
//    	// lowとhighを使ってリストの検索部分を追跡
//    	int low = 0;
//    	int high = ary.length - 1;
//    	
//    	// 1つの要素に絞り込まれるまでの間ループ
//    	while (low <= high) {
//    		int mid = low + (high - low)/2;
//    		// 真ん中の要素を調べる
//    		int guess = ary[mid];
//    		// アイテムを検出
//    		if(guess == target) {
//    			return mid;
//    		// 推測した数字が大きすぎた
//    		}else if(guess > target) {
//    			high = mid;
//    		// 推測した数字が小さすぎた
//    		}else {
//    			low = mid + 1;
//    		}
//    	}
//    	// アイテムが存在しない場合
//    	return -1;
//    }
//}
