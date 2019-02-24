import java.util.Scanner;

// これ問題文が説明不足じゃね

// 問題文
// Saraは、「ふしぎなポケット」を手に入れた。
// 「ふしぎなポケット」は、いくつかビスケットを入れて叩くと、入れたビスケットの数が２倍になる。
// Saraは最初1枚のビスケットを持っていて、「ふしぎなポケット」を使ってちょうどN枚のビスケットにして、全部食べたいと思っている。
// （食べきれないので枚数をオーバーしてはいけない）
// この時、ちょうどN枚にするには、Saraは最低何回ポケットを叩く必要があるか求めてください。
// ***
// 入力
// Saraが食べたいビスケットの数N(1≤N≤108) が与えられます。
// ***
// 出力
// 入力3
// 出力2
// 初めに1枚のビスケットをポケットに入れて叩きます。
// すると、２枚のビスケットになります。
// 2枚のビスケットになったうちの１枚をポケットに入れて、もう一度叩くと合計で3枚になります。
// よって、2回叩くと3枚になります。

public class No47 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int count = 0;
        int TEI = 2;
        // 入力以下の2の累乗の値となるまで計算
        while(Math.pow(TEI, count + 1) <= v) {
            count++;
        }
        if(v - Math.pow(TEI, count) > 0) {
            count++;
        }
        System.out.println(count);
    }
}
