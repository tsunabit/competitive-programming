import java.util.Scanner;

public class No112 {
    public static void main(String[] args) {
        // 標準入力から読み込む際に、Scannerオブジェクトを使う。
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
        	a[i] = sc.nextInt();
        }
        
        int min = a[0];
		int max = a[0];
		for(int i = 1; i < n; i++) {
			min = Math.min(min, a[i]);
			max = Math.max(max, a[i]);
		}
		
		if(max == min) {
			if((max / (n-1)) == 4) System.out.println(0 + " " + n);
			else System.out.println(n + " " + 0);
		}else {
			int kame = 0, tsuru = 0;
			for(int i = 0; i < n; i++) {
				if(a[i] == max) kame++;
				else tsuru++;
			}
			System.out.println(kame + " " + tsuru);
		}
    }
}
