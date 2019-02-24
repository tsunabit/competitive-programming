import java.util.Scanner;

// 問題文
// ある国の通貨単位は「ユキコダ」である。
// いまからDユキコダの品物を買おうとしている？
// しかし、品物の金額に対して消費税率P%の消費税が加算される。
// 実際に支払う金額はいくらか？
// ただし、小数点以下は切り捨てします。
// ***
// 入力
// D P
// Dは買おうとしている消費税を含まない品物の金額。1≤D≤10000000=107 (Dは正の整数。)
// Pはこの国の消費税率。0≤P≤100(Pは整数。)
// ***
// 出力
// 消費税を考慮した実際に支払う金額を1行で出力せよ。
// ただし、最後に改行を忘れずに。

public class No56 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        double p = sc.nextInt();

        int price = (int)(d+d*(p/100));
        System.out.println(price);

        // double totalCost = d * ((100.00 + p) / 100);
        // System.out.println(totalCost);
        // 切り捨て
        // System.out.println(Math.floor(totalCost));
    }
}
