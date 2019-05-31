import java.util.*;
import java.math.*;

public class No353 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner s = new Scanner(System.in);
        BigDecimal a = BigDecimal.valueOf(s.nextInt());
		BigDecimal b = BigDecimal.valueOf(s.nextInt());
		System.out.println(a.add(b));
    }
}
