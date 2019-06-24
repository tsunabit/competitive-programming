import java.util.*;
import java.io.*;
import java.math.*;

public class No706 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	Map<Integer, Integer> m = new TreeMap<Integer, Integer>();
    	for(int i = 0; i < n; i++) {
    		int t = sc.next().length() - 2;
    		if(m.containsKey(t)) m.put(t, m.get(t) + 1);
    		else m.put(t, 1);
    	}
    	int max = 0, o = 0;
    	for(int k : m.keySet()) {
    		if(max <= m.get(k)) {
    			max = m.get(k);
    			o = k;
    		}
    	}
    	System.out.println(o);
    	
    }
}
