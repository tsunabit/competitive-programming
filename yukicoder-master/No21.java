import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// ***問題文***
// N個の数字が与えられるのでこれらをK(≥3)個のグループに振り分ける。
// ただし各グループには最低一つ数字が含まれているとする。
// ex) 例えば 与えれる数字が {10,3,23,91,5}, K=3 なら
// {{3,91},{23,5},{10}} のような振り分けかたはただしく
// {{},{3,5,10},{23,91}} のような振り分けかたは認められません
// グループごとに平均を計算し, それらをもとに 最大の平均 - 最小の平均 を計算し、
// 最後に小数点以下を切り上げその値を「平均の差」と呼ぶ。
// 平均の差を最も大きくするようなグループ分けをしたとき、平均の差はいくつになるか答えよ。
// ***入力***
// N
// K
// n1
// n2
// …
// nN
// 1行目にはN (3≤N≤9)が与えられる。
// 2行目にはK (3≤K≤N)が与えられる。
// 3行目～N+2行目には数字(1≤ni≤1000,1≤i≤N)が与えられる。
// ***出力***
// 答えの数値を文字列で出力してください。
// 最後に改行してください。


public class No21 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<Integer>();

        // N個の数字をarraylistへ代入する
        for(int i = 0; i < N; i++) {
            al.add(sc.nextInt());
        }
        // ararylistを並び替え
        Collections.sort(al);
        // 最大値と最小値の差を出力する。平均の差は最大値と最小値の差?
        System.out.println(al.get(N-1) - al.get(0));
    }
}
