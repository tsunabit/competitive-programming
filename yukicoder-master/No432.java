import java.util.*;
import java.math.*;

public class No432 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i = 0; i < t; i++) {
        	String str = s.next();
        	while(str.length() > 1) {
        		String[] v = new String[str.length()];
        		v = str.split("");
        		str = "";
        		for(int j = 0; j < v.length-1; j++) {
        			int temp = (Integer.parseInt(v[j]) + Integer.parseInt(v[j+1]));
        			if(temp >= 10) {
        				temp = (temp / 10) + (temp % 10);
        			}
        			str = str + temp;
        		}
        	}
        	System.out.println(str);
        }
    }
}
