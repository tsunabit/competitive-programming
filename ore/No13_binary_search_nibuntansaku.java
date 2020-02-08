import java.util.*;
import java.io.*;
import java.math.*;

public class No13_binary_search_nibuntansaku {
    public static void main(String[] args) {
    	int[] ary = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    	Arrays.sort(ary);
    	int ans = 0;
    	ans = binary_search_nibuntansaku(ary, 5);
    	System.out.println("ans = " + ans);
    }
    
    public static int binary_search_nibuntansaku(int[] ary, int target){
    	// lowとhighを使ってリストの検索部分を追跡
    	int low = 0;
    	int high = ary.length - 1;
    	
    	// 1つの要素に絞り込まれるまでの間ループ
    	while (low <= high) {
    		int mid = low + (high - low)/2;
    		// 真ん中の要素を調べる
    		int guess = ary[mid];
    		// アイテムを検出
    		if(guess == target) {
    			return mid;
    		// 推測した数字が大きすぎた
    		}else if(guess > target) {
    			high = mid;
    		// 推測した数字が小さすぎた
    		}else {
    			low = mid + 1;
    		}
    	}
    	// アイテムが存在しない場合
    	return -1;
    }
}
