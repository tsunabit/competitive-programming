import java.util.*;
import java.math.*;

public class No358 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner s = new Scanner(System.in);
        int a1 = s.nextInt(), a2 = s.nextInt(), a3 = s.nextInt();
        int max = Math.max(Math.max(a1, a2), a3);
        int min = Math.min(Math.min(a1, a2), a3);
        
        if(((max == a2) | (min == a2)) && (a1 != a2 && a1 != a3 && a2 != a3)) {
    		System.out.println("INF");
        }else {
        	int c = 0;
        	for(int i = 2; i <= max; i++) {
        		int temp_max = Math.max(Math.max(a1%i, a2%i), a3%i);
                int temp_min = Math.min(Math.min(a1%i, a2%i), a3%i);
                if((temp_max == a2%i && (a1%i != a2%i && a1%i != a3%i && a2%i != a3%i)) | (temp_min == a2%i && (a1%i != a2%i && a1%i != a3%i && a2%i != a3%i))) {
                	c++;
//                	System.out.println(a1%i + " , " + a2%i + " , " + a3%i);
                }
        	}
        	System.out.println(c);
        }
    }
}
