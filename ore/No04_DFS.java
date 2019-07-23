import java.util.*;
import java.io.*;
import java.math.*;

// 2x2のマス目がある。左上から右下までの最短経路の通り数を深さ優先探索で求めよう。
public class No04_DFS {
	//finalがつくと定数
    private static final int SIZE = 2;// マスの数
    //(クラス変数;とりあえず下のメソッド(dfs)の内部から自由に読み書きできます)。
    private static int count = 0;// 通り数
    
    public static void main(String[] args) {
    	// Scanner sc = new Scanner(System.in);
    	dfs(0, 0);
        System.out.println(String.format("全部で%d通り", count));
    }
    /**
     * 深さ優先探索用再帰関数 SIZEが2の時下記のイメージ 
     *   012(x方向)
     *  0┌┬┐ 
     *  1├┼┤ 
     *  2└┴┘ 
     *  (y方向)
     * @param int x x方向の位置(左を0とする)
     * @param int y y方向の位置(上を0とする)
     */
    public static void dfs(int x, int y) {
//    	System.out.println("dfs = (" + x + " , " + y + ")");
    	// 終了(末端)判定を最初に書く
    	if (x == SIZE && y == SIZE) {
            count++;
            return;
        }
    	// ここからは分岐 こちらで分岐する条件に合わなくなった結果、分岐なしで戻る書き方にする場合もある。
        // 下方向への分岐
        if (y < SIZE) {
        	System.out.println("Y dfs = (" + x + " , " + y + ")");
            dfs(x, y + 1);
        }
        // 右方向への分岐
        if (x < SIZE) {
        	System.out.println("X dfs = (" + x + " , " + y + ")");
            dfs(x + 1, y);
        }
        System.out.println("-----");
    }
    
    
    
    
    
}
