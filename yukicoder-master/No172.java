import java.util.ArrayList;
import java.util.Scanner;

public class No172 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner s = new Scanner(System.in);
        int x = s.nextInt(), y = s.nextInt(), r = s.nextInt();
        double k = Math.sqrt(x*x + y*y);
        // 1:1:ルート2の二等辺三角形
        double out = (k + r) * Math.sqrt(2);
        System.out.println((int)Math.ceil(out));
    }
}
