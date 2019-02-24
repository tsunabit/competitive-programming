import java.util.Scanner;
import java.util.Calendar;

// 問題文
// 今日は4月22日であり、kamipeipaa君の誕生日です。kamipeipaa君はこの日が4=2+2と表せることに気づきました。
// kamipeipaa君はX月Y日についてYの数字和がXと等しいとき、この日を"HAPPY DAY"であると呼ぶことにしました。ここで数字和とは与えられた整数の各桁の数字が表す数の総和です。
// 例えば、4月4日や10月19日は4=0+4、10=1+9となり、HAPPY DAYですが、12月3日や11月28日は12≠0+3、11≠2+8となりHAPPY DAYではありません。
// グレゴリオ暦の2015年においてHAPPY DAYがどれだけあるかkamipeipaa君に教えてあげてください。
// ヒント:グレゴリオ暦とは通常のカレンダーのことである。2015年のカレンダーを参照しても良い。
// 365日それぞれの日が成り立つか確認してカウントしても十分速い。
// 入力
// この問題に入力はありません。
public class No188 {
    public static void main(String[] args) {
        // Calendarクラスインスタンス化
        Calendar c = Calendar.getInstance();
        c.set(2015, 0, 1);
        // System.out.println(c.get(Calendar.YEAR));
        // System.out.println(c.get(Calendar.MONTH));
        // System.out.println(c.get(Calendar.DATE));
        // System.out.println("----");
        int count = 0;
        int juu = 0;
        int iti = 0;

        while(c.get(Calendar.YEAR) != 2016) {
        // while(count < 50) {
            // System.out.println(c.get(Calendar.YEAR) + " " + (c.get(Calendar.MONTH) + 1) + " " + c.get(Calendar.DATE));
            // System.out.println("----");

            if(c.get(Calendar.DATE) >= 10) {
                juu = c.get(Calendar.DATE) / 10;
                iti = c.get(Calendar.DATE) % 10;
            }
            if(c.get(Calendar.MONTH) + 1 == juu + iti) {
                count++;
            }
            c.add(Calendar.DAY_OF_MONTH, 1);
        }
        System.out.println(count);
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
    //     Scanner sc = new Scanner(System.in);
    //     int S = sc.nextInt();
    //     int F = sc.nextInt();
    //     System.out.println((S / F) + 1);
    }
}
