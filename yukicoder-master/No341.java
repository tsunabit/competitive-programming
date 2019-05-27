import java.util.*;

public class No341 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner s = new Scanner(System.in);
        String ss = s.next();
        char[] a = ss.toCharArray();
        int max = 0, c = 0;
        for(char b : a) {
        	if('…' == b) {
        		c += 1;
        	}else {
        		max = max < c? c : max;
        		c = 0;
        	}
        }
        max = max < c? c : max;
        System.out.println(max);
    }
}
