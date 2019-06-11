import java.util.*;
import java.io.*;
import java.math.*;

public class No490 {
    public static void main(String[] args) {
    	try {
    		// 入力元がファイル
        	File inputFile = new File("/Users/aa352872/Desktop/temp.txt");
        	Scanner sc = new Scanner(inputFile);
            // 標準入力から読み込む際に、Scannerオブジェクトを使う。
//            Scanner sc = new Scanner(System.in);
            int n = Integer.parseInt(sc.nextLine());
            String[] a = sc.nextLine().split(" ");
            int[] b = new int[n];
            for(int i = 0; i < a.length; i++) {
            	b[i] = Integer.parseInt(a[i]);
            }
            Arrays.sort(b);
            for(int i = 0; i < n; i++) {
            	System.out.print(b[i] + " ");
            }
            System.out.println("");
    	}catch(Exception e) {
    		
    	}
    }
}
