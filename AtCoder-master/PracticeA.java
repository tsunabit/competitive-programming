import java.util.*;
import java.util.stream.Stream;

// ***問題文***
// 高橋君はデータの加工が行いたいです。
// 整数 a,b,cと、文字列 s が与えられます。
// 整数 a+b+c と、文字列 s を並べて表示しなさい。
// ***入力***
// 入力は以下の形式で与えられる。
// a
// b c
// s
// 1行目は、整数 a (1≦a≦1,000) が与えられる。
// 2行目は、整数 b,c (1≦b,c≦1,000) が与えられる。
// 3行目は、文字列 s が与えられる。この文字列の長さは 1 文字以上 100 文字以下である。
// ***出力***
// a+b+c と s を空白区切りで 1行に出力せよ。
// また、出力の末尾には改行を入れること。


public class PracticeA {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
		System.out.println((sc.nextInt() + sc.nextInt() + sc.nextInt()) + " " + sc.next());
	}
}

