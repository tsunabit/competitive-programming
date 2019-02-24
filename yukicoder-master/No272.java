import java.util.*;
import java.util.stream.Stream;

// ***問題文***
// NOT回路とは「０が入力されれば１を、１が入力されれば０を出力」する回路のことだ。
// NOT回路の動作をするプログラムを書いてみよう。
// ***入力***
// X
// Xは0か1かのどちらかの数字である。
// ***出力***
// 入力が0であれば1を出力せよ。
// 逆に、入力が1であれば0を出力せよ。
// 最後に改行を忘れずに。

public class No272 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);;
        System.out.println(sc.nextInt() == 0 ? 1 : 0);

    }
}
