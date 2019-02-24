import java.util.Scanner;

// No.9001 標準入出力の練習問題（テスト用）
// 整数A,Bと文字列Sが与えられるので、
// A+Bの結果と Sの文字列を半角空白区切りで出力してください。
// AとBは整数。1≤A≤1000、1≤B≤1000
// Sは 長さ10以下の半角英数の文字列
public class No9001 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
        // int １つ分を読み込む
        // int a = sc.nextInt();
        // int １つ分を読み込む
        // int b = sc.nextInt();
        // String １つ分を読み込む
        // String s = sc.next();
        // 標準出力に書き出す。
        // System.out.println((a + b) + " " + s);
        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();
        int n = sc.nextInt() + sc.nextInt();
        String s1 = sc.next();
        // System.out.println("out = " + (n1 + n2));
        // System.out.println((n1 + n2) + " " + s1);
        System.out.println(n + " " + s1);
        // int total = 0;
        // for(int i = 0; i <= num; i++){
        //     total += i;
        // }
        // System.out.println(total);
    }
}
