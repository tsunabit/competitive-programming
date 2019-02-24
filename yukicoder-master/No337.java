import java.util.*;
import java.util.stream.Stream;

// ***問題文***
//整数 N,P が与えられます． P=NP か P≠NP かを判定するプログラムを書いてください． 
// ***入力***
// N P
// 入力は以下の制約を満たします．
// N,Pはともに整数
// −50≤N≤50
// −50≤P≤50
// ***出力***
// P=NP なら =，P≠NP なら != と 1 行で出力し， 最後に改行を出力してください． 

public class No337 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		System.out.println(p == n * p ? "=" : "!=");
	}
}
