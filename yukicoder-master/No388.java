import java.util.Scanner;

// 問題文
// ステア君は階段を上るのが大好きです。今日も近所にあるお寺のお気に入りの階段を上っています。
// S段目に上がったとき、ふとステア君は自分の家でいうと何階に相当する高さに居るのかが気になりました。
// ステア君の家の一階層分に相当する段数 Fが与えられるので、ステア君が今何階にいるのか計算して下さい。
// 入力
// S F
// ステア君が現在居る段数 S, ステア君の家の一階層分に相当する段数 Fが空白区切りで与えられます。
// 入力は全て整数で与えられ、以下の制約を満たします。
// 0≤S≤4561≤F≤123
public class No388 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int F = sc.nextInt();
        System.out.println((S / F) + 1);
    }
}
