import java.util.Scanner;

// 問題文
// 1歩でぴったりaセンチメートル歩ける。
// bセンチメートルの区間を歩くのに最小で何歩歩く？
// なお、区間はオーバーしても良い。
// 入力
// a b
// a b ともに正の整数。(1≤a,b≤109)
public class No46 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(b % a == 0) {
            System.out.println(b / a);
        }else {
            System.out.println((b / a) + 1);
        }

    }
}
