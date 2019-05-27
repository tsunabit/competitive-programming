import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;

public class No256 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner s = new Scanner(System.in);
        String n = s.next();
        char[] l = n.toCharArray();
        Arrays.sort(l);
        for(int i = l.length; i > 0; i--) {
        	System.out.print(l[i-1]);
        }
    }
}
