import java.util.Scanner;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.HashMap;

// ***問題文***
// 諸外国では，○＋□＝8のように，答えがたくさんある問題があるようですが，採点が大変ですよね．
// そこで，やっぱり和風に答えが一意定まるように条件を加える事としましょう．
// おや，条件を加えすぎたかもしれません．
// N個の正整数の 2 つ組 (X1,Y1),(X2,Y2),…,(XN,YN) が与えられるので，
// 　　□ +Xk=Yk,k=1,2,…,N
// を同時に満たす□に当てはまる正整数を求めてください．
// ***入力***
// N
// X1 Y1
// X2 Y2
// ⋮
// XN YN
// 1≤N≤1000
// 1≤Xi,Yi≤1000000=106
// ***出力***
// □にあてはまる正整数を出力してください。
// ただし，存在しないなら，-𝟷 を代わりに出力してください．
// なお，高度な数学を駆使すると，□にあてはまる正整数が 2 つ以上存在することはないことがわかるらしいです．

public class No185 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int out = -1;
        for(int i = 0; i < n; i++) {
            int[] xy = Stream.of(sc.nextLine().split(" " , 0)).mapToInt(Integer::parseInt).toArray();
            if(i == 0) {
                out = xy[1] - xy[0];
            }else {
                if(xy[1] - xy[0] >= 1 && out == xy[1] - xy[0]) {

                }else {
                    out = -1;
                    break;
                }
            }
        }
        if(out <= 0) {
            out = -1;
        }
        System.out.println(out);
    }
}
