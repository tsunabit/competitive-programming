import java.util.Scanner;

public class No111 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
        long l = sc.nextInt();
        System.out.println((l-1) * (l-1) / 4);
    }
}
