import java.util.*;
import java.util.stream.Stream;

// ***問題文***
// 長さnの2つの文字列S, Tが与えられます。文字列を構成する各文字は、'a'～'z'です。
// 今、Sに以下の操作を順次実施してTに変換したいです。
// そのような一連の操作のうち、操作回数の最小となるものについて、その最小値を出力するプログラムを書いて下さい。
// (操作)
// Sの中から文字S[ i ]を1個選んで、その文字を'a'～'z'のいずれかの好きな文字に変更します
// ***入力***
// n
// S
// T
// 一行目に文字列S, Tの長さを表す整数nで与えられます。
// 続く二行目、三行目には、文字列S, Tがそれぞれ与えられます。
// 1≤n≤1000
// S, Tは、'a'～'z'から構成される文字列です
// ***出力***
// 答えを1行に出力してください。

public class No224 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] s = sc.nextLine().split("", 0);
        String[] t = sc.nextLine().split("", 0);
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(!s[i].equals(t[i])) {
                count++;
            }
        }
        System.out.println(count);
    }
}
