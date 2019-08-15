import java.util.*;
import java.io.*;
import java.math.*;

public class No7 {
	static int count = 0;

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	// ここで一度だけ素数判定をすれば計算量が減る
    	int[] p = new int[n];
    	p = ar_prime(n);
    	
    	String[] memo = new String[n];
    	memo[0] = "後手必勝";
    	for(int i = 1; i < n; i++) {
    		for(int j = p.length-1; j >= 0; j--) {
    			int t = (i+1) - p[j];
    			if(t <= 1) {
    				continue;
    			}else if(memo[t-1] == "後手必勝") {
    				memo[i] = "先手必勝";
    				continue;
    			}
    		}
    		if(memo[i] != "先手必勝") {
				memo[i] = "後手必勝";
			}
    	}
    	if(memo[n-1] == "先手必勝") System.out.println("Win");
    	else System.out.println("Lose");
    }
	public static int[] ar_prime(int num) {
		List<Integer> al = new ArrayList<Integer>();
    	for(int i = 0; i < num; i++) if(isPrime(i + 1)) al.add(i + 1);
    	int[] p = new int[al.size()];
    	int count = 0;
    	for(int v : al) {
    		p[count] = v;
    		count++;
    	}
    	return p;
    }
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        else if (num == 2) return true;
        else if (num % 2 == 0) return false; // 偶数はあらかじめ除く

        double sqrtNum = Math.sqrt(num);
        for (int i = 3; i <= sqrtNum; i += 2) {
            if (num % i == 0) return false;	//素数でない
        }
        return true;			// 素数である
    }
}
