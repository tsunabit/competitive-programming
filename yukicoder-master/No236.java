import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class No236 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int x = s.nextInt();
        int y = s.nextInt();
        
        System.out.println(((a * x) + (b * y)) / (a + b));
        
        
    }
}
