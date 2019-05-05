import java.util.Scanner;

public class No99 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 0;
        int count = 0;
        for(int i = 0 ; i < n ; i++) {
            temp = sc.nextInt();
            if(temp % 2 == 0) {
                count++;
            }else {
                count--;
            }
        }
        System.out.println(Math.abs(count));
    }
}
