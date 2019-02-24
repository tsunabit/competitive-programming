import java.util.*;
import java.util.stream.Stream;

// ***問題文***kamipeipaa君は木が大好きですが，今日は文字列で遊んでいます。
// kamipeipaa君は文字列Sを並び替えたときに"tree"という部分文字列をいくつ作ることが可能か興味があります。
// 教えてあげてください。
// ***入力***
// S
// kamipeipaa君が持つ英字小文字のみからなる文字列S(1≤|S|≤106)が1行で与えられる。
// ***出力***
// Sを自由に並び替えたときに作ることができる"tree"という部分文字列の数の最大値を1行で出力してください。
// 改行を忘れないこと。

public class No279 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
	String s = sc.next();
	int[] sa = new int[3];
	for(int i = 0; i < s.length(); i++) {
		// System.out.println(s.charAt(i));
		// if("t".equals(s.charAt(i))) {
		if('t' == s.charAt(i)) {
			sa[0] += 1;
		} else if('r' == s.charAt(i)){
			sa[1] += 1;
		} else if('e' == s.charAt(i)) {
			sa[2] += 1;
		}
	}
	for(int i = 0; i < 3; i++) {
		// System.out.println(sa[i]);
	}
	System.out.println(Math.min(Math.min(sa[0], sa[1]), sa[2] / 2));
    }	
}
