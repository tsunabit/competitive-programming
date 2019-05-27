import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;

public class No311 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long temp = n / 15;
        long c = (temp * 4) + ((n / 3 - temp) * 2) + ((n / 5 - temp) * 2);
        System.out.println(c);
    }
}
