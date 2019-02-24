import java.util.Scanner;

// No.480 合計
// 1からNまでの合計を求めてください。
// 入力は整数で与えられる。1≤N≤100
public class No480 {
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
        //System.out.println((a + b) + " " + s);
        int num = sc.nextInt();
        //System.out.println("tet = " + num);
        int total = 0;
        for(int i = 0; i <= num; i++){
            total += i;
        }
        System.out.println(total);
    }
}
