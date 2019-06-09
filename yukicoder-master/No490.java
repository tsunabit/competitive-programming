import java.util.*;
import java.math.*;

public class No490 {
    public static void main(String[] args) {
    	// 入力元がファイル
    	File inputFile = new File("/Users/aa352872/Desktop/temp.txt");
//    	Scanner sc = new Scanner(new File());
    	Scanner sc = new Scanner(inputFile);
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
//        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] a = sc.nextLine().split(" ");
        
        int[] b = new int[n];
        for(int i = 0; i < a.length; i++) {
        	b[i] = Integer.parseInt(a[i]);
        }
        Arrays.sort(a);
        for(int i = 0; i < n; i++) {
        	System.out.print(b[i] + " ");
        }
        System.out.println("");
    }
}
