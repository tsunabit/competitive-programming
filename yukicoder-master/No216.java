import java.util.*;
import java.util.stream.Stream;

// ***問題文***
// K君はプログラミングコンテストに参加するのが大好きです。
// 今日もFAC(First Accept Contest)に参加します。
// FACは変わったコンテストで、各問題一番最初に解いた人にしかスコアが加算されません。
// 最終的にスコアが一番高かった人が1位になります。
// K君はコンテストに少し遅れて参加することになってしまいました。
// 既にいくつかの問題は解かれてしまっています。
// K君はプロなので全ての問題を一瞬で解くことができます。
// 遅れて参加したK君が1位になれるなら"YES"、できないなら"NO"を出力してください。
// 1位の人と同じスコアだった場合も1位とみなします。
// コンテストにはK君以外に100人参加しています。
// ***入力***
// N
// a0 ... aN−1
// b0 ... bN−1
// 1行目に問題の個数Nが与えられます。
// 2行目にi番目の問題のスコアが空白区切りで与えられます。
// 3行目にi番目の問題が何番の人に解かれたかが空白区切りで与えられます。
// biが0の場合はまだ誰にも解かれていないことを表します。
// すべて整数で与えられます。
// 1≤N≤100
// 1≤ai≤100
// 0≤bi≤100
// ***出力***
// K君が1位になれるなら"YES"、なれないなら"NO"を出力してください。

public class No216 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] a = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
        int[] b = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
        HashMap<Integer, Integer> c = new HashMap<Integer, Integer>();
        for(int i = 0; i < n; i++) {
            if(c.containsKey(b[i])) {
                c.put(b[i], c.get(b[i]) + a[i]);
            }else {
                c.put(b[i], a[i]);
            }
        }
        int max = 0, v = 0;
        for(int cc : c.keySet()) {
            // System.out.println("cc = " + cc + "v = " + c.get(cc));
            if(v < c.get(cc)) {
                max = cc;
                v = c.get(cc);
            }
        }
        System.out.println(max == 0 ? "YES" : "NO");
    }
}
