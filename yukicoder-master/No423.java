import java.util.*;
import java.math.*;

public class No423 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner s = new Scanner(System.in);
        String n = s.next();
        n = n.replace("hamu", "1");
        n = n.replace("ham", "0");
        int dec = Integer.parseInt(n, 2);
        String bin = Integer.toBinaryString(dec * 2);
//        System.out.println(bin);
        bin = bin.replace("1", "hamu");
        bin = bin.replace("0", "ham");
        System.out.println(bin);
    }
}
