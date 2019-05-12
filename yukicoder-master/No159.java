import java.util.ArrayList;
import java.util.Scanner;

public class No159 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble(), q = sc.nextDouble();
        double p1 = (1 - p) * q;
        double p2 = (1 - q) * p * q;
        
        if(p1 < p2) {
        	System.out.println("YES");
        }else {
        	System.out.println("NO");
        }
    }
}
