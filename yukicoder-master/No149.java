import java.util.ArrayList;
import java.util.Scanner;

public class No149 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
        int aw = sc.nextInt(), ab = sc.nextInt();
        int bw = sc.nextInt(), bb = sc.nextInt();
        int c  = sc.nextInt(), d  = sc.nextInt();
        int moveW = 0, moveB = 0;
        // a to b
        if(c >= ab) {
        	moveW = c - ab;
        	if(aw >= moveW) {
        		aw = aw - moveW;
        	}else {
        		moveW = aw;
        		aw = 0;
        	}
//        	System.out.println("aw = " + aw + "ab = " + ab);
//        	System.out.println("amoveW = " + moveW + "moveB = " + moveB);
        }else {
        	
        	if(ab - c >= 0) {
        		moveB = c;
            	ab = ab - c;
        	}else {
        		moveB = ab;
        		moveW = c -ab;
        		aw = aw - moveW;
        	}
        	
        }
        bw += moveW;
        bb += moveB;
//        System.out.println("aw = " + aw + "ab = " + ab);
//        System.out.println("bw = " + bw + "bb = " + bb);
        
        if(d >= bw) {
        	System.out.println(aw + bw);
        }else {
        	System.out.println(aw + d);
        }
    }
}
