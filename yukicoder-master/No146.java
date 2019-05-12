import java.util.ArrayList;
import java.util.Scanner;

public class No146 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long count = 0;
        long m=1000000007;
        for(int i = 0; i < n; i++) {
        	long c = sc.nextLong();
        	long d = sc.nextLong();
        	if(c % 2 == 0) {
        		count += (c/2)%m * (d%m);
        	}else {
        		count += (c/2 + 1)%m * (d%m);
        	}
        	count = count % m;
        }
        System.out.println(count);
    }
}
