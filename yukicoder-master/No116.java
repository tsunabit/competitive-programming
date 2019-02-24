import java.util.Scanner;
import java.util.stream.Stream;

// ***問題文***
// あけましておめでとうございます。
// 玄関に飾る門松を作っている時に、あることに気づいた。
// N本の竹を無作為に並べた時の高さをそれぞれAiとしたときに、
// 順番を変えずに連続になった3本を取り出した時に、何組の組み合わせが「門松列」になっているかを知りたくなった。
// 門松とは、選んだ「3つの竹の長さの降順で2番目が、左または右側になっているもの」らしいのですが、
// ここでさらに、「3つの長さはすべて異なる」という条件も満たすものを「門松列」とする。
// N本の竹の高さが与えられるので、「門松列」になる組み合わせ数を求めてください。
// それぞれの竹は番号が振ってあるので区別ができるとする。
// ***入力***
// N
// A1 A2…AN
// 入力は全て整数で与えられる。
// 3≤N≤100=102
// 1≤Ai≤100=102,1≤i≤N
// ***出力***
// 門松列になる組み合わせ数を出力してください。最後に改行してください。

public class No116 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
        // 2行目をnextLineで読み込むため、数値もnextLineで読み込む
        int n = Integer.parseInt(sc.nextLine());
        // 新しいstreamを作成し、各要素をintに変換
        int[] a = Stream.of(sc.nextLine().split(" " , 0)).mapToInt(Integer::parseInt).toArray();
        int count = 0;
        for(int i = 0; i < a.length -2; i++) {
            if(((a[i] != a[i + 1]) && (a[i + 1] != a[i + 2]) && (a[i] != a[i + 2]) )
             && !((a[i] < a[i + 1]) && (a[i + 1] < a[i + 2]))
             && !((a[i] > a[i + 1]) && (a[i + 1] > a[i + 2]))) {
                 count++;
             }
        }
        System.out.println(count);
        // for(int i = 0; i < a.length; i++) {
        //     System.out.println(a[i]);
        // }
        // System.out.println(a);
    }
}
