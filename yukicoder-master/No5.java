import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

// 問題文
// Ellenは数字のブロックで遊ぼうとしている。
// 数字が書かれているブロックはそれぞれ高さ1で幅はWi である。
// （同じ幅のブロックが複数存在することがある。）
// それらのブロックを高さ1,幅Lの箱の中に入れる。　
// Ellenは大きな箱にどれだけブロックがたくさん入るか気になったが。
// 組み合わせがたくさんあって大変なことに気づいて、すぐに夜になってしまいそうである。
// あなたは、代わりに大きな箱に最大何個のブロックが入るかを求めてください。
// ***
// 入力
// L
// N
// W1W2W3…WN
// 1行目は、大きな箱の幅を表すL(1≤L≤10000)が与えられます。
// 2行目は、ブロックの数を表すN(1≤N≤10000)
// 3行目は、各ブロックの幅を表すWi(1≤Wi≤L)が半角スペース区切りで与えられます。
// ***
// 出力
// 求めた数値を返してください。末尾に改行を付けてください。

public class No5 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt(); // 箱の幅
        int N = sc.nextInt(); // ブロックの数

        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = 0; i < N; i++) {
            al.add(sc.nextInt());
        }
        // 並び替え
        Collections.sort(al);
        int total = 0;
        int count = 0;
        while(count < N && (total + al.get(count)) <= L) {
            total += al.get(count);
            count++;
        }
        System.out.println(count);
    }
}
