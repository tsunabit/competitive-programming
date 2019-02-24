import java.util.Scanner;
import java.util.stream.Stream;

// ***問題文***
// 太郎君は健康のために、毎日、寝た時刻と起きた時刻の記録をとっています。
// 入力に、寝た時刻と起きた時刻のリストが与えられるので、
// 睡眠時間の合計を出力してください。
// 太郎君は、1回につき24時間以上眠り続けることは無いものとします。
// 太郎君の世界は1日あたり24時間、1時間は60分で表されます。
// ***入力***
// N
// H1:M1 h1:m1
// H2:M2 h2:m2
// …
// Hi:Mi hi:mi
// …
// HN:MN hN:mN
// 1行目に、記録の個数を表す整数 N (1≤N≤30) が与えられます。
// 続くN行に、1回の睡眠あたりの寝た時刻と起きた時刻の記録が与えられます。
// (0≤Hi,hi≤23, 0≤Mi,mi≤59)
// 各記録は "H:M h:m" のフォーマットで与えられ、時と分の間は半角コロン区切り、
// そして、寝た時刻(H時M分)、起きた時刻(h時m分)が半角スペース区切りで表わされます。
// ***出力***
// 睡眠時間の合計を 分単位 で出力してください。
// 最後に改行してください。

public class No70 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;

        for(int i = 0; i < n; i++) {
            // s＝就寝時刻取得
            // 「Stream.of(sc.next().split(":" , 2))」で新しいstreamを作成し、各要素をintに変換
            int[] s = Stream.of(sc.next().split(":" , 2)).mapToInt(Integer::parseInt).toArray();
            // e=起床時刻取得
            int[] e = Stream.of(sc.next().split(":" , 2)).mapToInt(Integer::parseInt).toArray();

            if(s[0] == e[0]) {
                // 時間が同じ場合
                if(s[1] <= e[1]) {
                    total += e[1] - s[1];
                }else {
                    // 就寝時刻の分が起床時刻の分より大きい=日を跨いでいる場合
                    total += (24 * 60) - (s[1] - e[1]);
                }
            }else if(s[0] > e[0]) {
                // 日を跨ぐ場合
                total += (23 - s[0] + e[0]) * 60 + (60 - s[1] + e[1]);
            }else {
                // 日を跨がない場合
                total += ((e[0] - s[0]) * 60) + e[1] - s[1];
            }
        }
        System.out.println(total);
    }
}
