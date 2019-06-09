import java.util.*;
import java.math.*;

public class No441 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger(), b = sc.nextBigInteger();
		int c = a.add(b).compareTo(a.multiply(b));
		System.out.println(c>0?"S":c<0?"P":"E");
    }
}
