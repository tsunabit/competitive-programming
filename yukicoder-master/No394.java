import java.util.*;
import java.util.stream.Stream;

// ***問題文***
//  スノーボード競技の一つにハーフパイプという種目があります。
// ハーフパイプでは、6人の審査員それぞれが競技者の演技を100点満点で採点し、
// 最低点を1つと最高点を1つ除いた4人分の平均点をその演技の得点とします。 
// （注:この採点方式を用いない大会もあると思います。 参考）
// 例えば、6人の採点結果が {10, 20, 30, 40, 50, 60} であった場合、 この中の最低点10と最高点60が除かれ、
// {20, 30, 40, 50} の平均点(=35.00) が得点となります。
// 同じ最低(最高)点が複数あった場合でも、最低(最高)点として除かれるのは1人分のみです。
// 例){50,50,60,70,70,70} -> {50,60,70,70}
// 例){51,51,51,51,51,51} -> {51,51,51,51}
// 6人の審査員による採点結果S1…S6が入力に与えられるので、
// 上記の採点方式による得点を 小数第二位まで正確に 出力してください。
// ***入力***
// S1 S2 S3 S4 S5 S6
// 6人の審査員による採点結果Sが空白区切りで与えられます。
// Siは 0以上 100以下 の整数です。 
// ***出力***
// 得点を小数第二位まで正確に出力してください。 

public class No394 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
		int[] s = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(s);
		System.out.printf("%.2f", (s[1] + s[2] + s[3] + s[4]) / 4.00);

		//for(int i = 0 ; i < s.length; i++) {
		//	System.out.println(s[i]);
		//}
	}
}
