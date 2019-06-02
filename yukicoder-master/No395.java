import java.util.*;
import java.math.*;

public class No395 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        // x + 7 = a
        if((a - 7) > 7)  {
        	System.out.println(a - 7);
        }else {
        	System.out.println(-1);
        }
    }
}
