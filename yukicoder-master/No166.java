import java.util.ArrayList;
import java.util.Scanner;

public class No166 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner s = new Scanner(System.in);
        long h = s.nextLong() , w = s.nextLong() , n = s.nextLong() , k = s.nextLong();
		if(h * w % n == k % n){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
    }
}
