import java.util.ArrayList;
import java.util.Scanner;

public class No123 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // カード積み上げ
        ArrayList<Integer> card = new ArrayList<Integer>();
        for(int i = 0; i < n; i++) {
        	card.add(i+1);
        }
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = 0; i < m; i++) {
        	al.add(sc.nextInt());
        }
        
        for(int i = 0; i < m; i++) {
        	int temp = al.get(i) - 1;
        	int temp_value = card.get(temp);
        	card.remove(temp);
        	card.add(0 , temp_value);
        }
        System.out.println(card.get(0));
    }
}
