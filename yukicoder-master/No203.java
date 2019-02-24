import java.util.Scanner;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.HashMap;

// ***問題文***
// 巷ではゴールデンウィークらしいです。
// なのでゴールデンウィークっぽい問題です。
// 2週間分の平日(x)と休日(o)が分かるカレンダーが与えられます。
// この2週間の期間以外は、平日とします。
// 最大の連休（連続の休日）数を求めてください。
// ***入力***
// C1C2....C7
// C8C9....C14
// Ci
// は、"x"か"o"の文字です。 "x"は平日、"o"は休日を表します。
// C1,C2...,CNと連続している日を表すものとします。
// ***出力***
// 最大の連休（連続の休日）数を求めてください。

public class No203 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
        // int n = Integer.parseInt(sc.nextLine());
        String[] w1 = sc.nextLine().split("", 0);
        String[] w2 = sc.nextLine().split("", 0);
        String[] w = new String[w1.length + w2.length];
        System.arraycopy(w1, 0, w, 0, w1.length);
        System.arraycopy(w2, 0, w, w1.length, w2.length);
        int count = 0;
        int max = 0;
        for(int i = 0; i < w.length; i++) {
            if("o".equals(w[i])) {
                count++;
            }
            else {
                if(count > max) {
                    max = count;
                }
                count = 0;
            }
        }
        System.out.println(max > count ? max : count);
    }
}
