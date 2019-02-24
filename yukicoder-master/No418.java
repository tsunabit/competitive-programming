import java.util.*;
import java.util.stream.Stream;

// ***問題文***
// ミンミンゼミが鳴いています。あなたはセミが何回「ミーン」と鳴いたかを数えようと思いました。
// セミがどのように鳴いたかをあらわす文字列 S が与えられます。
// この文字列は, 以下に定義する「ミーン文字列」をいくつか繰り返した文字列で, 
// これが繰り返された回数を数えることでセミが「ミーン」と鳴いた回数を数えることができます。
// - まず "mi" から始まる。
// - その後いくつかの "-" がつく。"-" の数は 0 でもかまわない。
// - 最後に "n" で終わる。
// 例えば "min", "mi---n" はミーン文字列であり, "mi--nn", "m--n", などはミーン文字列ではありません。
// あなたの仕事は, 文字列 S がいくつのミーン文字列を繰り返しているかを数えることです。
// ***入力***
// S
// セミの鳴き声をあらわす文字列 S
// が入力されます。
// 3≤|S|≤100
// S はミーン文字列を繰り返したものであることが保証される。
// ***出力***
// セミが何回「ミーン」と鳴いたかを出力してください。最後に改行してください。

public class No418 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
		String s = sc.next().replace("-", "");
		int count = 0;
		for(int i = 0; i < s.length(); i = i + 3) {
			if(s.charAt(i) == 'm' && s.charAt(i + 1) == 'i' && s.charAt(i + 2) == 'n') {
					if(i + 3 == s.length()) {
							count++;
					}else if(s.charAt(i + 3) != 'n') {
							count++;
					}
			}
		}
		System.out.println(count);
	}
}
