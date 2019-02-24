import java.util.Scanner;


// 問題文
// A君は左から右に1から10までの数を書くことを試みました。
// しかし、A君は書いた数が9個しかないことに気づきました。
// どうやら書くべき数を1つ書かなかったようです。
// A君が書かなかった数は何でしょうか？
// ***
// 入力
// B1 B2 … B9
// 入力される数の個数はちょうど9個。
// Biは左からi番目の整数。1≤Bi≤10。
// Biの値はすべて異なり、左から右に昇順である。
// ***
// 出力
// 答えとなる数を1行で出力し最後に改行せよ。

public class No481 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
        int pre = 0;
        int input;
        boolean flag = false;
        for(int i = 0; i < 9; i++) {
            input = sc.nextInt();
            if(pre + 1 != input) {
                pre += 1;
                flag = true;
                break;
            }else {
                pre = input;
            }
        }
        if(flag == false) {
            pre = 10;
        }
        System.out.println(pre);
    }
}
