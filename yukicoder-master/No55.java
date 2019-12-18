import java.util.*;
import java.io.*;
import java.math.*;

public class No55 {
//	private static Set<String> set = new HashSet<String>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x = new int[3];
		int[] y = new int[3];
		for(int i = 0; i < 3; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
//		for(int i = 0; i < 3; i++) {
//			System.out.println("x y = " + x[i] + " , " + y[i]);
//		}
		int x1, y1, x2, y2;
		boolean f = false;
		// 与えられた3点でのなす角を全て確認するため3回ループ
		for(int i = 0; i < 3; i++) {
			// ベクトル成分を考える。x0~x2のうち、x1を中心に考える。
			x1 = x[1] - x[0];
			y1 = y[1] - y[0];
			x2 = x[2] - x[1];
			y2 = y[2] - y[1];
			// ベクトルの内積が0、かつ長さが等しい場合は正方形の対角線でないため、フラグを立ててループを抜ける
			if((x1 * x2 + y1 * y2) == 0 && Math.pow(x1, 2) + Math.pow(y1, 2) == Math.pow(x2, 2) + Math.pow(y2, 2)) {
				f = true;
				break;
			}
			// 中心となる点を変更するため配列を入れ替える
			// 入れ替えるのは2回のみでOK。最後の一回は不要。
			if(i < 2) {
				int tmpx = x[i];
				x[i] = x[i+1];
				x[i+1] = tmpx;
				int tmpy = y[i];
				y[i] = y[i+1];
				y[i+1] = tmpy;
			}
		}
		// 正方形が描ける場合は座標を出力
		if(f) {
			// 正方形の対角線の交点は、対角線の中点
			// (x[0]+x[2])/2 , (y[0]+y[2])/2 = (x[1]+x?)/2 , (y[1]+y?)/2　を展開すると
			System.out.println((x[0]+x[2]-x[1]) + " " + (y[0]+y[2]-y[1]));
		}else {
			System.out.println(-1);
		}
	}
}