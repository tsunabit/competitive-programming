import java.util.*;
import java.math.*;

public class No378 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long c = 0;
        for(long i = n; i > 0; i = i/2) {
        	c += i;
        }
        System.out.println(n * 2 - c);
    }
}
