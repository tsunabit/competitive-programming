import java.util.*;
import java.util.stream.Stream;

// ***問題文***
// シカのAtCoDeerくんは二つの正整数 a,b を見つけました。aとbの積が偶数か奇数か判定してください。
// ***入力***
// 入力は以下の形式で標準入力から与えられる。
// a b
// 1 ≤ a,b ≤ 10000
// a,bは整数
// ***出力***
// 積が奇数ならOddと、偶数ならEvenと出力せよ。

public class ABC086A {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(((a * b) % 2 == 0) ? "Even" : "Odd");
	}
}

