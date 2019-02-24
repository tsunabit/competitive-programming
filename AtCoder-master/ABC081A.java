import java.util.*;
import java.util.stream.Stream;

// ***問題文***
// すぬけ君は 1,2,3 の番号がついた 3 つのマスからなるマス目を持っています。
// 各マスには 0 か 1 が書かれており、マス i には siが書かれています。
// すぬけ君は 1 が書かれたマスにビー玉を置きます。 ビー玉が置かれるマスがいくつあるか求めてください。
// 制約
//     s1,s2,s3
// は 1 あるいは 0
// ***入力***
// 入力は以下の形式で標準入力から与えられる。
// s1s2s3
// ***出力***
//答えを出力せよ。

public class ABC081A {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int ans = 0;
		for(int i = 0; i < 3; i++) {
				if(s.charAt(i) == '1') {
						ans++;
				}
		}
		System.out.println(ans);
	}
}

