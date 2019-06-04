import java.util.*;
import java.math.*;

public class No401 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
//        初期値が0で進めなくなったら+1する変数𝑑を作って、𝑑を4で割った余りが
//        0 ならば右に進む、
//        1 ならば下に進む、
//        2 ならば左に進む、
//        3 ならば上に進む、
//        とすれば渦巻きができます。
        int d = 0;
        int count = 1;
        int gyou = 0, retu = 0;
        int[][] masu = new masu[n][n];
        while(count <= n * n) {
//        	masu[gyou][retu] = count;
        	// 右へ移動
        	if(d % 4 == 0) {
        		retu++;
        		masu[gyou][retu] = count;
        		// dの判定
        		if(retu == n) {
        			d++;
        		}else if(retu < n && masu[gyou][retu + 1] <> null) {
        			d++;
        		}
        	// 下へ移動
        	}else if(d % 4 == 1) {
        		gyou++;
        		masu[gyou][retu] = count;
        		// dの判定
        		if(gyou == n) {
        			d++;
        		}else if(gyou < n && masu[gyou + 1][retu] <> null) {
        			d++;
        		}
        	// 左へ移動
        	}else if(d % 4 == 2) {
        		gyou--;
        		masu[gyou][retu] = count;
        		// dの判定
        		if(gyou == 0) {
        			d++;
        		}else if(gyou > 0 && masu[gyou - 1][retu] <> null) {
        			d++;
        		}
        	// 上へ移動
        	}else if(d % 4 == 4) {
        		retu--;
        		masu[gyou][retu] = count;
        		// dの判定
        		if(retu == 0) {
        			d++;
        		}else if(retu > 0 && masu[gyou][retu - 1] <> null) {
        			d++;
        		}
        	}
        }
        
        // 出力
        for(int[] v : masu) {
        	for(int vv : v) {
        		System.out.print(vv + " ");
        	}
        	System.out.println();
        }
    }
}
