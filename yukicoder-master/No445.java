import java.util.*;
import java.math.*;

public class No445 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        // 𝑓(𝑁,𝐾)=50×𝑁+⌊50×𝑁0.8+0.2×𝐾⌋
        // 誤差を回避
        System.out.println(50*n + (int)((250*n) / (4 + k)));
    }
}
