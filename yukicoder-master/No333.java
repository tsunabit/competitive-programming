import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;

public class No333 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner s = new Scanner(System.in);
        long a = s.nextLong();
        long b = s.nextLong();
        long p = 0;
        
        if(a < b) {
        	//cがmax
        	//p += 2000000000 - b;
        	//cがmiddle
        	p += b - a - 1;
            //cがmin
        	p += a - 1;
        }else {
        	p += 2000000000 - b - 1;
        }
        System.out.println(p);
    }
}
