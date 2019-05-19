import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class No178 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Long> l = new ArrayList<Long>();
        
        // 𝑎+4𝑏+2𝑐
        for(int i = 0; i < n; i++) {
            // a + 4b + 2c
        	Long temp = s.nextLong() + (4 * s.nextLong());
        	l.add(temp);
        }
        Collections.sort(l, Collections.reverseOrder());
        long o = 0;
        for(Long v : l) {
        	if((l.get(0) - v) % 2 != 0) {
        		System.out.println(-1);
        		return;
        	}
        	o += l.get(0) - v;
        }
        if(o % 2 == 0) {
        	System.out.println(o / 2);
        }else {
        	System.out.println(-1);
        }
    }
}
