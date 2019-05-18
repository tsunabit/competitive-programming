import java.util.ArrayList;
import java.util.Scanner;

public class No175 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int n = s.nextInt();
        System.out.println((int)Math.pow(2, l-3) * n);
    }
}
