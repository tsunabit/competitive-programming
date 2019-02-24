import java.util.*;
import java.util.stream.Stream;

// ***問題文***
// ローマ数字で文字盤が記された腕時計がある。
// 今、短針はローマ数字のS1の位置、長針は"XII"の位置を指している。
// T時間後、短針はどの位置にあるだろうか。
// T時間後に短針がある位置のローマ数字S2を出力せよ。
// 文字盤に記されたローマ数字は1時から順に
// "I","II","III","IIII","V","VI","VII","VIII","IX","X","XI","XII"である。
// 各ローマ数字は英字大文字の"I","V","X"を組み合わせて表現する。 
// ***入力***
// S1 T
// S1はローマ数字の文字列（問題文に記載されている）、Tはアラビア数字である。
// −1000≤T≤1000
// ***出力***
// S2を出力する。S2はローマ数字の文字列。
// 最後に改行してください。

public class No405 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int t = sc.nextInt();
		List<String> roma = Arrays.asList("I","II","III","IIII","V","VI","VII","VIII","IX","X","XI","XII");
		// 1200を加算する理由は、Tの値が-1000まで許容しているため、S1 + Tの結果がマイナスにならないようにするため
		// 1200を加算しても12で割った余りを出すため影響は無い
		System.out.println(roma.get((roma.indexOf(s) + t + 1200) % 12));

		// 問題の回答を見る前のオリジナルの回答
		// マイナスを考慮してコードが冗長になった
		//
		// int temp = roma.indexOf(s) + 1 + (t % 12);
		// if(temp > 0) {
		// 	if(temp > 12) {
		// 		System.out.println(roma.get(temp - 12 -1));
		// 	}else {
		// 		System.out.println(roma.get(temp - 1));
		// 	}
		// }else {
		// 	// System.out.println("temp = " + temp);
		// 	System.out.println(roma.get(12 + temp -1));
		// }
	}
}

