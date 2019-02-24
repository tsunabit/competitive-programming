import java.util.Scanner;

// 問題文
// 自分と相手がじゃんけんをする。
// じゃんけんの結果を標準出力に出力してください。
// 結果は、自分が勝ったら「Won」、自分が負けたら「Lost」、引き分けなら「Drew」を出力してください。
// 入力
// 0 0
// ぐー, ちょき, ぱーをそれぞれ 0, 1, 2とし、１つ目に自分のが２つ目に相手のが与えられます。
public class No264 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int a = sc.nextInt();
        if(j == a) {
            System.out.println("Drew");
        }else if(j == 0) {
            if(a == 1) {
                System.out.println("Won");
            }else if(a == 2) {
                System.out.println("Lost");
            }
        }else if(j == 1) {
            if(a == 0) {
                System.out.println("Lost");
            }else if(a == 2) {
                System.out.println("Won");
            }
        }else if(j == 2) {
            if(a == 0) {
                System.out.println("Won");
            }else if(a == 1) {
                System.out.println("Lost");
            }
        }
    }
}
