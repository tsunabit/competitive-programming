import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

// 問題文
// N個の整数Aiが与えられるので、その中央値（メジアン）を求めてください。
// 中央値（メジアン）とは、小さい順に並べたとき中央に位置する値。
// データが偶数個の場合は、中央に近い2つの値の算術平均（いわゆる普通の平均）をとる。
// 小数第一位まで求めてください。
// （数値が正しければ、余計な小数桁が含まれてても良い）
// ***
// 入力
// N
// A1 A2 … AN
// 入力は全て整数で与えられる。
// 1≤N≤1000
// −1000≤Ai≤1000
// ***
// 出力
// 配列の中央値を求めてください。
// 最後に改行してください。

public class No275 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // String input = sc.nextLine();
        // System.out.println(input);
        ArrayList<Integer> Ai = new ArrayList<Integer>();
        for(int i = 0 ; i < N ; i++) {
            Ai.add(sc.nextInt());
        }
        // sort
		Collections.sort(Ai);
        double temp = 0;
        if(N % 2 == 0) {
            temp = ((double)Ai.get(N/2 - 1) + (double)Ai.get(N/2)) / 2;
            if(temp % 2 == 0) {
                System.out.println((int)temp);
            }else {
                System.out.println(temp);
            }
        }else {
            temp = Ai.get(N/2);
            System.out.println((int)temp);
        }

    }
}
