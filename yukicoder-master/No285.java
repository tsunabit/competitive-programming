import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;

public class No285 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner s = new Scanner(System.in);
        long d = s.nextLong();
        long x = d * 108;
        long y = x / 100;
        long z = x % 100;
        System.out.printf("%d.%02d", y, z);
    }
}
