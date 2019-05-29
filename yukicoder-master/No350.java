import java.util.*;

public class No350 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner s = new Scanner(System.in);
        String v = s.next();
//        double v = s.nextDouble();
        int t = s.nextInt();
//      System.out.println((int)(Integer.parseInt(s.next().substring(2,6))*s.nextInt()/10000.0));
//      System.out.println((int)(v * t));
        System.out.println(Integer.parseInt(v.substring(2, 6)) * t / 10000);
    }
}
