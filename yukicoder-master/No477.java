import java.util.*;
import java.math.*;

public class No477 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(), k = sc.nextLong();
        System.out.println(n / (k + 1) + 1);
    }
}
