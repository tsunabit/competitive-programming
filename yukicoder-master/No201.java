import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class No201 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner s = new Scanner(System.in);
//        𝑆𝐴 𝑃𝐴 𝑋𝐴
//        𝑆𝐵 𝑃𝐵 𝑋𝐵
        String sa = s.next();
        String pa = s.next();
        String xa = s.next();
        
        String sb = s.next();
        String pb = s.next();
        String xb = s.next();
        
        if(pa.length() == pb.length()) {
        	if(pa.equals(pb)) {
        		System.out.println(-1);
        	}else {
        		System.out.println(pa.compareTo(pb) > 0? sa : sb);
        	}
        }else {
        	System.out.println(pa.length() > pb.length()? sa : sb);
        }
    }
}
