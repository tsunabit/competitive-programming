import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class No236 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        double x = s.nextDouble();
        double y = s.nextDouble();
        
        if((x / a) <= (y / b)) {
        	System.out.println(((a + b) * x) / a);
        }else {
        	System.out.println(((a + b) * y) / b);
        }
    }
}
