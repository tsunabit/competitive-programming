import java.util.*;
import java.util.stream.Stream;

// ***問題文***
// 宮内れんげ(通称れんちょん)はいついかなる時も「nyanpass」と挨拶するという。
// 転じて、いついかなる時も「nyanpass」と挨拶する人を「れんちょんっぽい」と言う。
// 村には村民が N人いて、1～N までの村民番号が振られている。
// N人の挨拶履歴が N×N の行列 A で与えられる。Aij は村民番号 i 番と j 番が挨拶したときの j番の発言を表す。
// N人の中にれんちょんっぽい人物がただ1人だけいる時、これをれんちょんを「特定」できたと言う。
// れんちょんを特定できた場合はその村民番号を、特定出来なかった場合は-1を出力せよ。
// ***入力***
// N
// A11 A12 … A1N
// A21 A22 … A2N
// …
// AN1 AN2 … ANN    2≤N≤100
// Aiiは "-" である(引用符を除く)
// Aijは1文字以上30文字以下の英小文字で構成された文字列である。
// ***出力***
// れんちょんを特定できた場合はその村民番号を、特定出来なかった場合は-1を出力せよ。

public class No239 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] r = new int[n];
        int max = 0;
        int rr = 0;
        for(int i = 0; i < n; i++) {
            // int[] a = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
            String[] a = sc.nextLine().split(" ", 0);
            for(int j = 0; j < n; j++) {
                if("nyanpass".equals(a[j])) {
                    r[j]++;
                }
            }
        }
        int v = -1;
        int count = 0;
        for(int i = 0 ; i < n ; i++) {
            // 個数がn-1かどうか=nyanpassといつも言っているか
            if(r[i] == n - 1) {
                // すでにnyanpassっぽい人がいるかどうか
                if(v != -1) {
                    v = -1;
                    break;
                }else {
                    v = i + 1;
                }
            }
        }
        System.out.println(v);
    }
}
