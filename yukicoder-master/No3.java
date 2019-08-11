import java.util.*;
import java.io.*;
import java.math.*;

public class No3 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	// BFS
    	int[] step = new int[n];
    	Arrays.fill(step, 0);
    	Queue<Integer> queue = new ArrayDeque<Integer>();
    	queue.add(1);
    	while(queue.peek() != null) {
    		int t = queue.poll();
    		if(t == n) {
    			System.out.println(step[t - 1] + 1);
    			return;
    		}
    		int ido = Integer.toBinaryString(t).replaceAll("0", "").length();
    		int tugi = t + ido;
    		if(tugi <= n && step[tugi - 1] == 0) {
    			step[tugi - 1] = step[t - 1] + 1;
    			queue.add(tugi);
    		}
    		tugi = t - ido;
    		if(1 <= tugi && step[tugi -1] == 0) {
    			step[tugi - 1] = step[t - 1] + 1;
    			queue.add(tugi);
    		}
    	}
    	System.out.println(-1);
    }
}
