import java.util.Scanner;

// ***問題文***
// 幅Wと高さHと左上の色が指定されるので市松模様を描け。
// 市松模様は、黒と白が交互に現れる模様である。
// 模様は黒を'B'、白を'W'を使って描くものとする。
// 詳しくはサンプルを見てください。
// ***入力***
// W H C
// 幅Wと高さHと左上の色Cの3つの情報が与えられる。
// W,Hは1以上50以下の整数。(1<=W,H<=50)
// Cは'B'か'W'のどちらかである。
// ***出力***
// 市松模様を描け。最後の行にも改行を忘れずに。

public class No82 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        String c = sc.next();
        String o = "";

        if("B".equals(c)) {
            o = "W";
        }else {
            o = "B";
        }

        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++) {
                if(i % 2 == 0) {
                    if(j % 2 == 0) {
                        System.out.print(c);
                    }else {
                        System.out.print(o);
                    }
                }else {
                    if(j % 2 == 0) {
                        System.out.print(o);
                    }else {
                        System.out.print(c);
                    }
                }
            }
            System.out.println("");
        }
        // System.out.println("");
    }
}
