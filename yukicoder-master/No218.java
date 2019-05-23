import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class No218 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int k1 = (int)Math.ceil((double)a / b);
		int k2 = (int)Math.ceil((double)a / c);
		double k3 = ((double)2.0 * k1 / 3.0);

		if(k2 <= k3) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
        
    }
}
