import java.util.*;

public class No349 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner s = new Scanner(System.in);
        Map<String, Integer> eto = new HashMap<String, Integer>() {{ put("ne", 0); put("ushi", 0); put("tora", 0); put("u", 0); put("tatsu", 0); put("mi", 0); put("uma", 0); put("hitsuji", 0); put("saru", 0); put("tori", 0); put("inu", 0); put("i", 0);}};
        int n = s.nextInt();
        for(int i = 0; i < n; i++) {
        	String temp = s.next();
        	eto.put(temp, eto.get(temp) + 1);
        }
        int max = 0;
        for(int c : eto.values()) {
        	max = max < c? c : max;
        }
        if(n % 2 == 0) {
        	if(max > (n / 2)) {
            	System.out.println("NO");
            }else {
            	System.out.println("YES");
            }
        }else {
        	if(max > (n / 2) + 1) {
            	System.out.println("NO");
            }else {
            	System.out.println("YES");
            }
        }
    }
}
