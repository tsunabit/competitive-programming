import java.util.*;
import java.math.*;

public class No436 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner s = new Scanner(System.in);
        String str = s.next();
//        System.out.println(str.length());
        int b = str.indexOf("ccw");
//        System.out.println(b);
        if(b + 1 < str.length() / 2) {
//        	System.out.println("---1---");
        	System.out.println(b + 1);
        }else {
        	System.out.println(str.length() - b - 2);
        }
    }
}
