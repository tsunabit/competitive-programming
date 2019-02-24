import java.util.Scanner;
import java.util.stream.Stream;
import java.util.Arrays;

// ***問題文***
// キャンディーが入っている箱がN個ある。
// i番目の箱にはCi個のキャンディーが入っている。
// A君は、その時の最もキャンディーの少ない箱から1つキャンディーを取っていく。
// これを合計M個のキャンディーを取り終えるまで繰り返す。
// M個のキャンディーを取り出した時に、空になった箱の数はいくつか？
// ***入力***
// N M
// C1 C2 … CN
// 1≤N≤10
// 1≤M≤1000000
// 1≤Ci≤100000
// Mは最初のキャンディーの総数以下の数字が与えられる。
// ***出力***
// M個のキャンディーを取ったあとに空になった箱の数を1行で答えよ。
// 最後に改行を忘れずに。

public class No156 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int m = sc.nextInt();
        // 2行目をnextLineで読み込むため、数値もnextLineで読み込む
        // int n = Integer.parseInt(sc.nextLine());
        // 新しいstreamを作成し、各要素をintに変換
        // int[] x = Stream.of(sc.nextLine().split(" " , 0)).mapToInt(Integer::parseInt).toArray();
        // int f = Integer.parseInt(sc.next().replace(".", ""));
        // int s = Integer.parseInt(sc.next().replace(".", ""));
        int[] nm = Stream.of(sc.nextLine().split(" " , 0)).mapToInt(Integer::parseInt).toArray();
        int[] c = Stream.of(sc.nextLine().split(" " , 0)).mapToInt(Integer::parseInt).toArray();
        // 配列をsort
        Arrays.sort(c);
        int total = 0;
        int count = 0;
        for(int i = 0; i < nm[0]; i++) {
            total += c[i];
            if(total > nm[1]) {
                count = i;
                break;
            }else if(total == nm[1]) {
                count = i + 1;
                break;
            }
        }
        System.out.println(count);
        // ------------------------------------------------------------
        // System.out.println("n = " + f);
        // System.out.println("n = " + s);
        // System.out.println("n = " + fa.length);
        // for(int i = 0; i < f.length; i++) {
        //     System.out.println("[" + i + "] = " + f[i]);
        // }
        // for(int a: x) {
        //     System.out.println("x = " + x);
        // }
    }
}
