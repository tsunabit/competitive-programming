import java.util.*;
import java.math.*;

public class No379 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        double g = s.nextDouble();
        double v = s.nextDouble();
        System.out.println((n / 5) * g / v);
    }
}
