import java.util.Scanner;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.HashMap;

// ***問題文***
// kamipeipaa君は新しいものが大好きです。
// kamipeipaa君はある日N個の整数A1,A2,A3,....,ANを見つけました。
// 整数Aiに対して，Ai=Ajとなるjがi以外に存在しなければ，Aiは新規性があるのではないかとkamipeipaa君は考えました。
// 上記の条件を満たす整数がいくつあるかkamipeipaa君に教えてあげてください。
// ***入力***
// N
// A1 A2 ... AN
// 1行目にkamipeipaa君が見つけた数の総数N(1≤N≤105)
// が与えられる。
// 2行目にkamipeipaa君が見つけた数A1,A2,....,AN(1≤Ai≤109)が空白区切りで与えられる。
// ***出力***
// 条件を満たすようなものの数を1行に出力せよ。改行を忘れないこと。

public class No182 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        // int[] a = Stream.of(sc.nextLine().split(" " , 0)).mapToInt(Integer::parseInt).toArray();
        int[] a = Stream.of(sc.nextLine().split(" " , 0)).mapToInt(Integer::parseInt).toArray();
        HashMap<Integer, Integer> ha = new HashMap<Integer, Integer>();
        for(int i = 0; i < a.length; i++) {
            if(ha.containsKey(a[i])) {
                ha.put(a[i], ha.get(a[i]) + 1);
            }else {
                ha.put(a[i], 1);
            }
        }
        int count = 0;
        for(int k: ha.keySet()) {
            // System.out.println(ha.get(k));
            if(ha.get(k) == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
