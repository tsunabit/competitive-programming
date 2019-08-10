import java.util.*;
import java.io.*;
import java.math.*;

public class No3 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	// BFS
    	boolean[] f = new boolean[n];
    	// 配列の初期化
    	Arrays.fill(f, false);
    	f[0] = true;
    	
    	int count = 0;
    	
    	Queue<Integer> queue = new ArrayDeque<Integer>();
    	queue.add(1);
    	while(queue.peek() != null) {
    		count++;
    		int t = queue.poll();
    		System.out.println("tansaku = " + t);
    		if(t == n) {
    			System.out.println(count);
    			return;
    		}
    		int ido = Integer.toBinaryString(t).replaceAll("0", "").length();
    		int tugi = t + ido;
    		if(tugi <= n && f[tugi - 1] == false) {
    			f[tugi -1] = true;
    			queue.add(tugi);
    		}
    		tugi = t - ido;
    		if(1 <= tugi && f[tugi -1] == false) {
    			f[tugi -1] = true;
    			queue.add(tugi);
    		}
    	}
    	System.out.println(-1);
    }
}
