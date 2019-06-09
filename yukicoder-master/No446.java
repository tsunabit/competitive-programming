import java.util.*;
import java.math.*;

public class No446 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next();
        String atemp = a.replaceAll("\\D", "");
        String btemp = b.replaceAll("\\D", "");
        
        if(a.length() == atemp.length() && b.length() == btemp.length()) {
        	if((a.length() > 1 && a.charAt(0) == '0') || (b.length() > 1 && b.charAt(0) == '0')) {
        		System.out.println("NG");
        	}else {
        		int ai = Integer.parseInt(atemp);
                int bi = Integer.parseInt(btemp);
            	if(ai <= 12345 && bi <= 12345) {
            		System.out.println("OK");
                }else {
                	System.out.println("NG");
                }
        	}
        }else {
        	System.out.println("NG");
        }
    }
}
