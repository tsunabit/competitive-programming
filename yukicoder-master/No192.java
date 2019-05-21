import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class No192 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n % 2 == 0) {
        	System.out.println(n);
        }else {
        	System.out.println(n - 1);
        }
    }
}
