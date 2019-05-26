import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class No231 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int max = 0;
        int dan = 0;
        // 𝐺𝑖−30000𝐷𝑖 
        for(int i = 0; i < n; i++) {
        	int g = s.nextInt();
        	int d = s.nextInt();
        	int temp = g - 30000 * d;
        	if(max < temp) {
        		max = temp;
        		dan = i + 1;
        	}
        }
        if(max * 6 >= 3000000) {
        	System.out.println("YES");
        	for(int i = 0; i < 6; i++) {
        		System.out.println(dan);
        	}
        }else {
        	System.out.println("NO");
        }
        
    }
}
